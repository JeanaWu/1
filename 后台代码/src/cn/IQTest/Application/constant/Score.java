package cn.IQTest.Application.constant;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Score {

	private static Map<String,Map<Integer,Integer>> score = new HashMap<>();
	private static String [] ages = {"5.5","6","6.5","7","7.5","8","8.5","9","9.5","10","10.5","11","11.5","12","12.5","13","13.5","14","14.5","15","15.5","16","16.5","17","20","30","40","50","60","70"};
	static {
		for(int i=0;i<ages.length;i++) {
			Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
			if(ages[i].equals("5.5")) {
				map.put(95, 34);
				map.put(90, 31);
				map.put(75, 25);
				map.put(50, 16);
				map.put(25, 13);
				map.put(10, 12);
				map.put(5, 9);
			}
			if(ages[i].equals("6")) {
				map.put(95, 36);
				map.put(90, 31);
				map.put(75, 25);
				map.put(50, 17);
				map.put(25, 13);
				map.put(10, 12);
				map.put(5, 9);
			}
			if(ages[i].equals("6.5")) {
				map.put(95, 37);
				map.put(90, 31);
				map.put(75, 25);
				map.put(50, 18);
				map.put(25, 13);
				map.put(10, 12);
				map.put(5, 10);
			}
			if(ages[i].equals("6.5")) {
				map.put(95, 37);
				map.put(90, 31);
				map.put(75, 25);
				map.put(50, 18);
				map.put(25, 13);
				map.put(10, 12);
				map.put(5, 10);
			}
			if(ages[i].equals("7")) {
				map.put(95, 43);
				map.put(90, 36);
				map.put(75, 25);
				map.put(50, 19);
				map.put(25, 13);
				map.put(10, 12);
				map.put(5, 10);
			}
			if(ages[i].equals("7.5")) {
				map.put(95, 44);
				map.put(90, 38);
				map.put(75, 31);
				map.put(50, 21);
				map.put(25, 13);
				map.put(10, 12);
				map.put(5, 10);
			}
			if(ages[i].equals("8")) {
				map.put(95, 44);
				map.put(90, 39);
				map.put(75, 31);
				map.put(50, 23);
				map.put(25, 15);
				map.put(10, 13);
				map.put(5, 10);
			}
			if(ages[i].equals("8.5")) {
				map.put(95, 45);
				map.put(90, 40);
				map.put(75, 33);
				map.put(50, 29);
				map.put(25, 20);
				map.put(10, 14);
				map.put(5, 12);
			}
			if(ages[i].equals("9")) {
				map.put(95, 47);
				map.put(90, 43);
				map.put(75, 37);
				map.put(50, 33);
				map.put(25, 25);
				map.put(10, 14);
				map.put(5, 12);
			}
			if(ages[i].equals("9.5")) {
				map.put(95, 50);
				map.put(90, 47);
				map.put(75, 39);
				map.put(50, 35);
				map.put(25, 27);
				map.put(10, 17);
				map.put(5, 13);
			}
			if(ages[i].equals("10")) {
				map.put(95, 50);
				map.put(90, 48);
				map.put(75, 42);
				map.put(50, 35);
				map.put(25, 27);
				map.put(10, 17);
				map.put(5, 13);
			}
			if(ages[i].equals("10.5")) {
				map.put(95, 50);
				map.put(90, 49);
				map.put(75, 42);
				map.put(50, 39);
				map.put(25, 32);
				map.put(10, 25);
				map.put(5, 18);
			}
			if(ages[i].equals("11")) {
				map.put(95, 52);
				map.put(90, 50);
				map.put(75, 43);
				map.put(50, 39);
				map.put(25, 33);
				map.put(10, 25);
				map.put(5, 19);
			}
			if(ages[i].equals("11.5")) {
				map.put(95, 53);
				map.put(90, 50);
				map.put(75, 45);
				map.put(50, 42);
				map.put(25, 35);
				map.put(10, 25);
				map.put(5, 19);
			}
			if(ages[i].equals("12")) {
				map.put(95, 53);
				map.put(90, 50);
				map.put(75, 46);
				map.put(50, 42);
				map.put(25, 37);
				map.put(10, 27);
				map.put(5, 21);
			}
			if(ages[i].equals("12.5")) {
				map.put(95, 53);
				map.put(90, 52);
				map.put(75, 50);
				map.put(50, 45);
				map.put(25, 40);
				map.put(10, 33);
				map.put(5, 28);
			}
			if(ages[i].equals("13")) {
				map.put(95, 53);
				map.put(90, 52);
				map.put(75, 50);
				map.put(50, 45);
				map.put(25, 40);
				map.put(10, 35);
				map.put(5, 30);
			}
			if(ages[i].equals("13.5")) {
				map.put(95, 54);
				map.put(90, 52);
				map.put(75, 50);
				map.put(50, 46);
				map.put(25, 42);
				map.put(10, 35);
				map.put(5, 32);
			}
			if(ages[i].equals("14")) {
				map.put(95, 55);
				map.put(90, 52);
				map.put(75, 50);
				map.put(50, 48);
				map.put(25, 43);
				map.put(10, 36);
				map.put(5, 34);
			}
			if(ages[i].equals("14.5")) {
				map.put(95, 55);
				map.put(90, 53);
				map.put(75, 51);
				map.put(50, 48);
				map.put(25, 43);
				map.put(10, 36);
				map.put(5, 34);
			}
			if(ages[i].equals("15")) {
				map.put(95, 57);
				map.put(90, 54);
				map.put(75, 51);
				map.put(50, 48);
				map.put(25, 43);
				map.put(10, 36);
				map.put(5, 34);
			}
			if(ages[i].equals("15.5")) {
				map.put(95, 57);
				map.put(90, 55);
				map.put(75, 52);
				map.put(50, 49);
				map.put(25, 43);
				map.put(10, 41);
				map.put(5, 34);
			}
			if(ages[i].equals("16")) {
				map.put(95, 57);
				map.put(90, 56);
				map.put(75, 53);
				map.put(50, 49);
				map.put(25, 44);
				map.put(10, 41);
				map.put(5, 36);
			}
			if(ages[i].equals("16.5")) {
				map.put(95, 57);
				map.put(90, 56);
				map.put(75, 53);
				map.put(50, 49);
				map.put(25, 45);
				map.put(10, 41);
				map.put(5, 37);
			}
			if(ages[i].equals("17")) {
				map.put(95, 58);
				map.put(90, 57);
				map.put(75, 55);
				map.put(50, 52);
				map.put(25, 47);
				map.put(10, 40);
				map.put(5, 37);
			}
			if(ages[i].equals("20")) {
				map.put(95, 57);
				map.put(90, 56);
				map.put(75, 54);
				map.put(50, 50);
				map.put(25, 44);
				map.put(10, 38);
				map.put(5, 33);
			}
			if(ages[i].equals("30")) {
				map.put(95, 57);
				map.put(90, 55);
				map.put(75, 52);
				map.put(50, 48);
				map.put(25, 37);
				map.put(10, 34);
				map.put(5, 28);
			}
			if(ages[i].equals("40")) {
				map.put(95, 57);
				map.put(90, 54);
				map.put(75, 50);
				map.put(50, 47);
				map.put(25, 41);
				map.put(10, 31);
				map.put(5, 28);
			}
			if(ages[i].equals("50")) {
				map.put(95, 54);
				map.put(90, 52);
				map.put(75, 48);
				map.put(50, 42);
				map.put(25, 34);
				map.put(10, 24);
				map.put(5, 21);
			}
			if(ages[i].equals("60")) {
				map.put(95, 54);
				map.put(90, 52);
				map.put(75, 46);
				map.put(50, 37);
				map.put(25, 30);
				map.put(10, 22);
				map.put(5, 19);
			}
			if(ages[i].equals("70")) {
				map.put(95, 52);
				map.put(90, 49);
				map.put(75, 44);
				map.put(50, 33);
				map.put(25, 26);
				map.put(10, 18);
				map.put(5, 17);
			}
			score.put(ages[i], map);
		}
	}
	public static Map<String,Map<Integer,Integer>> getMapScore() {
		return score;
	}
}
