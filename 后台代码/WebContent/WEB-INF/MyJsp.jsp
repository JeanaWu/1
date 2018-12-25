<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
	<title>IQ测试后台管理系统</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/MyCss.css" type="text/css" />
	
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/MyJS.js"></script>
</head>
  
  <body style='background: #FFFFFF'>
 	<div class="container" >
		<!--网页导航栏-->
		<nav class="navbar navbar-inverse" role="navigation">
			<div class="container-fluid">
				<div class="navbar-header">
<!-- 					<a class="navbar-brand" href="#home">数学章节测验</a> -->
					<a class="navbar-brand" href="#search">查找章节测试题</a>		
				</div>
				<div>
					<ul class="nav nav-tabs navbar-nav">
						<li id="uploadQuestion"><a data-toggle="tab" href="#upload">上传章节测试题</a></li>
					</ul>
				</div>
			</div>
		</nav>
	 <div class="tab-content">
		
		<!--查找章节测试题目-->
		<div id="home" class="in active welcome">
			<form class="center" action="${pageContext.request.contextPath}/selectQuestionList"  method="get">
				<label class="labelFont">请输入要查找的题目关键字:</label><br/>
				<input type="text" placeholder="题目关键字" value="${key }" class="inputFont" name="key"/><br/>
				<button class="btn" >确定</button>
				<button class="btn">重置</button>
			</form>
			<form action="${pageContext.request.contextPath}/DeleteIQQuestion" method="post">
			<input type="hidden" name="key" value="${key}">
			<table class="table table-hover tableFont">
				<caption style="text-align: center;">查询结果</caption>
					<thead>
						<tr>
						    <td>选择</td>
						    <td>序号</td>
							<td>题目</td>
							<td>组别</td>
							<td>选项A</td>
							<td>选项B</td>
							<td>选项C</td>
							<td>选项D</td>
							<td>选项E</td>
							<td>选项F</td>
							<td>选项G</td>
							<td>选项H</td>
							<td>正确选项</td>
						</tr>
					</thead>
					<tbody>
					    <c:forEach var="item" items="${list}" varStatus="status">
						<tr>
						    <td><input type="checkbox" id ="cid" name="items" value="${item.id}"></td>
						    <td>${ status.index + 1}</td>
							<td><img class="img-responsive center-block" height="200" width="200" src="${item.question}"></td>
							<td>${item.type}</td>
							<td><img class="img-responsive center-block" height="200" width="200" src="${item.a}"></td>
							<td><img class="img-responsive center-block" height="200" width="200" src="${item.b}"></td>
							<td><c:if test="${item.c ne ''}"><img class="img-responsive center-block" height="200" width="200" src="${item.c}">
								</c:if>
								<c:if test="${item.c eq ''}">
								 	图片不存在
								</c:if>
							</td>
							<td><c:if test="${item.d ne ''}"><img class="img-responsive center-block" height="200" width="200" src="${item.d}">
								</c:if>
								<c:if test="${item.d eq ''}">
								 	图片不存在
								</c:if>
							</td>
							<td><c:if test="${item.e ne ''}"><img class="img-responsive center-block" height="200" width="200" src="${item.e}">
								</c:if>
								<c:if test="${item.e eq ''}">
								 	图片不存在
								</c:if>
							</td>
							<td><c:if test="${item.f ne ''}"><img class="img-responsive center-block" height="200" width="200" src="${item.f}">
								</c:if>
								<c:if test="${item.f eq ''}">
								 	图片不存在
								</c:if>
							</td>
							<td><c:if test="${item.g ne ''}"><img class="img-responsive center-block" height="200" width="200" src="${item.g}">
								</c:if>
								<c:if test="${item.g eq ''}">
								 	图片不存在
								</c:if>
							</td>
							<td><c:if test="${item.h ne ''}"><img class="img-responsive center-block" height="200" width="200" src="${item.h}">
								</c:if>
								<c:if test="${item.h eq ''}">
								 	图片不存在
								</c:if>
							</td>
							<td>${item.answer}</td>
						</tr>
					</c:forEach>
					</tbody>
			</table>
			<input type="submit" name="submit" value="删除选择" onclick="alert('删除成功');">
			</form>
		</div>
		</div>
		<!--上传章节测试题目-->
		<div id="upload" class="fade upload divFont">
			<!-- 上传题目表单 -->
			<form class="bs-example bs-example-form center" role="form" id="upload" action="${pageContext.request.contextPath}/InsertIQQuestion" method="post">
				<label class="labelFont">请添加要上传的数学测试题:</label>
				
				<div class="input-group">
					<span class="input-group-addon" onclick="upImage_situation()" >题目</span>
					<input type="text" class="form-control" placeholder="请输入题目图片路径" name="question" id="question"/>
				</div>
				<br>
				
				<div class="input-group">	
					<span class="input-group-addon" onclick="upImage_a()" >选项A</span>
					<input type="text" class="form-control" placeholder="请输入选项图片路径" name="a" id="a"/>
				</div>
				<br>
				
				<div class="input-group">
					<span class="input-group-addon" onclick="upImage_b()" >选项B</span>
					<input type="text" class="form-control" placeholder="请输入选项图片路径" name="b" id="b"/>
				</div>
				<br>
				
				<div class="input-group">
					<span class="input-group-addon" onclick="upImage_c()" >选项C</span>
					<input type="text" class="form-control"  value="" placeholder="请输入选项图片路径" name="c" id="c"/>
				</div>
				<br>
				
				<div class="input-group">
					<span class="input-group-addon" onclick="upImage_d()" >选项D</span>
					<input type="text" class="form-control"  value="" placeholder="请输入选项图片路径" name="d" id="d"/>
				</div>
				<br>
				
				<div class="input-group">
					<span class="input-group-addon" onclick="upImage_e()" >选项E</span>
					<input type="text" class="form-control"  value="" placeholder="请输入选项图片路径" name="e" id="e" />
				</div>
				<br>
				
				<div class="input-group">
					<span class="input-group-addon" onclick="upImage_f()" >选项F</span>
					<input type="text" class="form-control" value="" placeholder="请输入选项图片路径" name="f" id="f"/>
				</div>
				<br>	
				<div class="input-group">
					<span class="input-group-addon" onclick="upImage_g()" >选项G</span>
					<input type="text" class="form-control" value="" placeholder="请输入选项图片路径" name="g" id="g"/>
				</div>	
				<br>
				<div class="input-group">
					<span class="input-group-addon" onclick="upImage_h()" >选项H</span>
					<input type="text" class="form-control" value="" placeholder="请输入选项图片路径" name="h" id="h"/>
				</div>	
				<br>
				
				<div class="input-group">
					<span class="input-group-addon" >组别</span>
					<input type="text" class="form-control" placeholder="请输入题目组别" name="type" id="type"/>
				</div>
				<br>
				
				<div class="input-group">
					<span class="input-group-addon" >正确选项</span>
					<input type="text" class="form-control" placeholder="输入正确答案" name="answer"/>
				</div>
				<br>
				<input type="submit" value="上传" id="uploadbutton" onclick="aclick();" class="uploadBtn"/>
			</form>
		</div>
		</div><!-- .content-tab -->
		</div><!-- container -->
	</body>
	
	<script src="${pageContext.request.contextPath}/ueditor/ueditor.config.js"></script> 
    <script src="${pageContext.request.contextPath}/ueditor/ueditor.all.min.js"> </script> 
    <script  charset="utf-8" src="${pageContext.request.contextPath}/ueditor/lang/zh-cn/zh-cn.js"></script>  
    <script id="situationEditor" type="text/plain"></script>
    <script id="aEditor" type="text/plain"></script>
    <script id="bEditor" type="text/plain"></script>
    <script id="cEditor" type="text/plain"></script>
    <script id="dEditor" type="text/plain"></script>
    <script id="eEditor" type="text/plain"></script>
    <script id="fEditor" type="text/plain"></script>
    <script id="gEditor" type="text/plain"></script>
     <script id="hEditor" type="text/plain"></script>
    <script  type="text/javascript">
    
    //上传提交按钮点击事件
    function aclick() {
    	alert('上传成功');
    }
    /* situation */
    //实例化编辑器，使用工厂方法getEditor创建和使用编辑器实例
    var situation = UE.getEditor('situationEditor');
    situation.ready(function () {
        //设置编辑器不可用
        //_editor.setDisabled();  这个地方要注意 一定要屏蔽
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        situation.hide();
        //侦听图片上传
        situation.addListener('beforeinsertimage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            var imgs;
            for(var i in arg){
                imgs +=arg[i].src+',';
            }
            $("#question").attr("value", arg[0].src);
            //图片预览
            /* $("#preview").attr("src", arg[0].src); */
        })

    });
    //弹出图片上传的对话框
    function upImage_situation() {
        var myImage = situation.getDialog("insertimage");
        myImage.open();
    }
    
     /*  a */
    //实例化编辑器，使用工厂方法getEditor创建和使用编辑器实例
    var a = UE.getEditor('aEditor');
    a.ready(function () {
        //设置编辑器不可用
        //_editor.setDisabled();  这个地方要注意 一定要屏蔽
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        a.hide();
        //侦听图片上传
        a.addListener('beforeinsertimage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            var imgs;
            for(var i in arg){
                imgs +=arg[i].src+',';
            }
            $("#a").attr("value", arg[0].src);
            //图片预览
            /* $("#preview").attr("src", arg[0].src); */
        })

    });
    //弹出图片上传的对话框
    function upImage_a() {
        var myImage = a.getDialog("insertimage");
        myImage.open();
    }
    
    /*  b */
    //实例化编辑器，使用工厂方法getEditor创建和使用编辑器实例
    var b = UE.getEditor('bEditor');
    b.ready(function () {
        //设置编辑器不可用
        //_editor.setDisabled();  这个地方要注意 一定要屏蔽
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        b.hide();
        //侦听图片上传
        b.addListener('beforeinsertimage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            var imgs;
            for(var i in arg){
                imgs +=arg[i].src+',';
            }
            $("#b").attr("value", arg[0].src);
            //图片预览
            /* $("#preview").attr("src", arg[0].src); */
        })

    });
    //弹出图片上传的对话框
    function upImage_b() {
        var myImage = b.getDialog("insertimage");
        myImage.open();
    }
    
    
   /*  c */
    //实例化编辑器，使用工厂方法getEditor创建和使用编辑器实例
    var c = UE.getEditor('cEditor');
    c.ready(function () {
        //设置编辑器不可用
        //_editor.setDisabled();  这个地方要注意 一定要屏蔽
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        c.hide();
        //侦听图片上传
        c.addListener('beforeinsertimage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            var imgs;
            for(var i in arg){
                imgs +=arg[i].src+',';
            }
            $("#c").attr("value", arg[0].src);
            //图片预览
            /* $("#preview").attr("src", arg[0].src); */
        })

    });
    //弹出图片上传的对话框
    function upImage_c() {
        var myImage = c.getDialog("insertimage");
        myImage.open();
    }
    
    /*  d */
    //实例化编辑器，使用工厂方法getEditor创建和使用编辑器实例
    var d = UE.getEditor('dEditor');
    d.ready(function () {
        //设置编辑器不可用
        //_editor.setDisabled();  这个地方要注意 一定要屏蔽
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        d.hide();
        //侦听图片上传
        d.addListener('beforeinsertimage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            var imgs;
            for(var i in arg){
                imgs +=arg[i].src+',';
            }
            $("#d").attr("value", arg[0].src);
            //图片预览
            /* $("#preview").attr("src", arg[0].src); */
        })

    });
    //弹出图片上传的对话框
    function upImage_d() {
        var myImage = d.getDialog("insertimage");
        myImage.open();
    }
    
    /*  e */
    //实例化编辑器，使用工厂方法getEditor创建和使用编辑器实例
    var e = UE.getEditor('eEditor');
    e.ready(function () {
        //设置编辑器不可用
        //_editor.setDisabled();  这个地方要注意 一定要屏蔽
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        e.hide();
        //侦听图片上传
        e.addListener('beforeinsertimage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            var imgs;
            for(var i in arg){
                imgs +=arg[i].src+',';
            }
            $("#e").attr("value", arg[0].src);
            //图片预览
            /* $("#preview").attr("src", arg[0].src); */
        })

    });
    //弹出图片上传的对话框
    function upImage_e() {
        var myImage = e.getDialog("insertimage");
        myImage.open();
    }
    
	/*  f */
    //实例化编辑器，使用工厂方法getEditor创建和使用编辑器实例
    var f = UE.getEditor('fEditor');
    f.ready(function () {
        //设置编辑器不可用
        //_editor.setDisabled();  这个地方要注意 一定要屏蔽
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        f.hide();
        //侦听图片上传
        f.addListener('beforeinsertimage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            var imgs;
            for(var i in arg){
                imgs +=arg[i].src+',';
            }
            $("#f").attr("value", arg[0].src);
            //图片预览
            /* $("#preview").attr("src", arg[0].src); */
        })

    });
    //弹出图片上传的对话框
    function upImage_f() {
        var myImage = f.getDialog("insertimage");
        myImage.open();
    }
    /*g*/
    //实例化编辑器，使用工厂方法getEditor创建和使用编辑器实例
    var g = UE.getEditor('gEditor');
    g.ready(function () {
        //设置编辑器不可用
        //_editor.setDisabled();  这个地方要注意 一定要屏蔽
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        g.hide();
        //侦听图片上传
        g.addListener('beforeinsertimage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            var imgs;
            for(var i in arg){
                imgs +=arg[i].src+',';
            }
            $("#g").attr("value", arg[0].src);
            //图片预览
            /* $("#preview").attr("src", arg[0].src); */
        })

    });
    //弹出图片上传的对话框
    function upImage_g() {
        var myImage = g.getDialog("insertimage");
        myImage.open();
    }
    
    /*h*/
    //实例化编辑器，使用工厂方法getEditor创建和使用编辑器实例
    var h = UE.getEditor('hEditor');
    h.ready(function () {
        //设置编辑器不可用
        //_editor.setDisabled();  这个地方要注意 一定要屏蔽
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        h.hide();
        //侦听图片上传
        h.addListener('beforeinsertimage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            var imgs;
            for(var i in arg){
                imgs +=arg[i].src+',';
            }
            $("#h").attr("value", arg[0].src);
            //图片预览
            /* $("#preview").attr("src", arg[0].src); */
        })

    });
    //弹出图片上传的对话框
    function upImage_h() {
        var myImage = h.getDialog("insertimage");
        myImage.open();
    }
    
    
    
    //选中事件
    function select(){
   	 var checkbox=document.getElementsById("cid");
   	 for(var i=0;i<checkbox.length;i++){
   		 if(checkbox[i].checked==false) checkbox[i].checked=true;
   	 }
    } 
    //非选中事件
    function noselect(){
    	var checkbox=document.getElementsById("cid");
    	 for(var i=0;i<checkbox.length;i++){
    		 if(checkbox[i].checked==true) checkbox[i].checked=false;
    	 }
    }
</script>
</html>
