function goPage(pno,psize){
	/*var table = document.getElementsByTagName('tbody')[0];*/
	var $table = $("#tbody")[0];
	var tr = document.getElementsByTagName('tbody')[0].getElementsByTagName('tr');/*document.getElementById("data");*/
    var num = tr.length;//表格所有行数(所有记录数)
    /*alert(num);*/
    var totalPage = 0;//总页数
    var pageSize = psize;//每页显示行数
    //总共分几页 
    if(num/pageSize > parseInt(num/pageSize)){   
            totalPage=parseInt(num/pageSize)+1;   
       }else{   
           totalPage=parseInt(num/pageSize);   
       }   
    var currentPage = pno;//当前页数
    var startRow = (currentPage - 1) * pageSize+1;//开始显示的行  31 
       var endRow = currentPage * pageSize;//结束显示的行   40
       endRow = (endRow > num)? num : endRow;    40
    /*   alert(totalPage);*/
       //遍历显示数据实现分页
    /*for(var i=1;i<(num+1);i++){    
        var irow = tr.rows[i-1];
        if(i>=startRow && i<=endRow){
        	irow.style.display="block";
        }else{
        	irow.style.display="none";
        }
    }*/
       
       $table.empty();
       $table.append("<c:forEach var=\"item\" items=\"${bloglist}\"  begin=\""+startRow+"\"    end=\""+endRow+"\">"
    	       +"<tr>"
    	       +" <td><input type=\"checkbox\" class=\"input-control\" name=\"checkbox[]\" value=\"\" /></td>"
    	       +"<td class=\"article-title\">${item.title}</td>"
    	       +"<td class=\"hidden-sm\">${item.type}</td>" 
    	       +"<td class=\"hidden-sm\">${item.scanNum}</td>"
    	       +"<td>${item.time_string}</td>" 
    	       +"<td><a href=\"update-article.html\">修改</a> <a rel=\"6\">删除</a></td>"
    	       +"</tr>"
    	       +"</c:forEach>");
       /*table.innerHTML="<c:forEach var=\"item\" items=\"${bloglist}\"  begin=\""+startRow+"\"    end=\""+endRow+"\">"
       +"<tr>"
       +" <td><input type=\"checkbox\" class=\"input-control\" name=\"checkbox[]\" value=\"\" /></td>"
       +"<td class=\"article-title\">${item.title}</td>"
       +"<td class=\"hidden-sm\">${item.type}</td>" 
       +"<td class=\"hidden-sm\">${item.scanNum}</td>"
       +"<td>${item.time_string}</td>" 
       +"<td><a href=\"update-article.html\">修改</a> <a rel=\"6\">删除</a></td>"
       +"</tr>"
       +"</c:forEach>";*/
       
       
      
    var tempStr =" <li class=\"disabled\"><a aria-label=\"Previous\"> <span aria-hidden=\"true\">&laquo;</span> </a> </li>";
    for(var i=1;i<=totalPage;i++){
    	if(i==currentPage){
    		tempStr +="<li class=\"active\"><a href=\"#\" onclick=\"goPage("+i+","+psize+") \">"+i+"</a></li>";
    	}else{
        	tempStr +="<li><a href=\"#\" onclick=\"goPage("+i+","+psize+")\">"+i+"</a></li>";
    	}
    }
    tempStr +="<li><a href=\"#\" aria-label=\"Next\"> <span aria-hidden=\"true\">&raquo;</span> </a> </li>"
    
    
    /*var pageEnd = document.getElementById("pageEnd");
    var tempStr = "共"+num+"条记录 分"+totalPage+"页 当前第"+currentPage+"页";
    
    
    if(currentPage>1){
        tempStr += "<a href=\"#\" onClick=\"goPage("+(1)+","+psize+")\">首页</a>";
        tempStr += "<a href=\"#\" onClick=\"goPage("+(currentPage-1)+","+psize+")\"><上一页</a>"
    }else{
        tempStr += "首页";
        tempStr += "<上一页";    
    }*/

    /*if(currentPage<totalPage){
        tempStr += "<a href=\"#\" onClick=\"goPage("+(currentPage+1)+","+psize+")\">下一页></a>";
        tempStr += "<a href=\"#\" onClick=\"goPage("+(totalPage)+","+psize+")\">尾页</a>";
    }else{
        tempStr += "下一页>";
        tempStr += "尾页";    
    }*/

    
    document.getElementById("footpage").innerHTML = tempStr;
	
	
	
}

function select(){
	 var checkbox=document.getElementsByName("checkbox");
	 for(var i=0;i<checkbox.length;i++){
		 if(checkbox[i].checked="false") checkbox[i].checked="true";
	 }
} 
function reverse(){
	var checkbox=document.getElementsByName("checkbox");
	 for(var i=0;i<checkbox.length;i++){
		 if(checkbox[i].checked="false") checkbox[i].checked="true";
		 else checkbox[i].checked="false";
	 }
}
