package cn.IQTest.Application.Service;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import cn.IQTest.Application.constant.Score;

public class GiveScore {

	private static Map<String ,Map<Integer,Integer>> scores = Score.getMapScore();
	public static double get(String age,int num) {
		Map.Entry<Integer,Integer> score = findScore(age,num);
		if(score==null) {
			return 100;
		}
		if(score.getValue()==num) {
			return score.getKey();
		}else if(score.getValue()>num) {
			int value = score.getValue();
			double temp = score.getKey()*((double)num/(double)value);
			DecimalFormat dFormat = new DecimalFormat("#.00");
			String s = dFormat.format(temp);
	        Double res = Double.valueOf(s);
			return res;
		}
		return 0;
	}
	public static String getGrade(double score) {
		if(score>=97.8) {
			return "130以上&超优";
		}else if(score>=91.1) {
			return "120~129&优秀";
		}else if(score>=75.0) {
			return "110~119&中上(聪明)";
		}else if(score>=50.0) {
			return "90~110&中等";
		}else if(score>=25.0) {
			return "80~89&中下(迟钝)";
		}else if(score>=8.9) {
			return "70~79&低能边缘";
		}else  {
			return "69以下&缺陷";
		}
	}
	private  static Map.Entry<Integer,Integer> findScore(String age,int num) {
		Map<Integer,Integer> map = scores.get(age);
		Set<Map.Entry<Integer,Integer>> set = map.entrySet();
		Iterator<Map.Entry<Integer,Integer>> iterator = set.iterator();
		Map.Entry<Integer, Integer> pre = null;
		while(iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = iterator.next();
			if(entry.getValue()==num) {
				return entry;
			}else if(entry.getValue()<num) {
				if(pre==null) break;
				return pre;
			}
			if(!iterator.hasNext()) {
				return entry;
			}
			pre = entry;
		}
		return null;
	}
}
