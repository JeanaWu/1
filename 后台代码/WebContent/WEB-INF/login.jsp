<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="utf-8">
    <title>登陆界面</title>
</head>
<body>
    <div class="wrapper">
        <form action="${pageContext.request.contextPath}/Admin" method="post">
            用户名：<input type="text" name="username" id="username"/>
                               密    码：<input type="password" name="password" id="password"/>
            <input type="submit" value="登陆"/>                           
        </form>
        <br><c:if test="${message ne null}">
			    ${message}
			</c:if>
    </div>
</body>
</html>

