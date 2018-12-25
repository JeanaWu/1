<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>

</head>
<body>
	<input class="easyui-textbox" type="text" id="picture" name="pic" value="" style="width:160px"/>
	<input type="button" class="datepicker" onclick="upImage();" value="上传图片" />
</body>
<script type="text/javascript" charset="utf-8" src="/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/ueditor/lang/zh-cn/zh-cn.js"></script>
<script id="Ueditor" type="text/plain"></script>
<script>
	//实例化编辑器，使用工厂方法getEditor创建和使用编辑器实例
    var _editor = UE.getEditor('Ueditor');
    _editor.ready(function () {
        //设置编辑器不可用
        //_editor.setDisabled();  这个地方要注意 一定要屏蔽
        //隐藏编辑器，因为不会用到这个编辑器实例，所以要隐藏
        _editor.hide();
        //侦听图片上传
        _editor.addListener('beforeinsertimage', function (t, arg) {
            //将地址赋值给相应的input,只去第一张图片的路径
            var imgs;
            for(var a in arg){
                imgs +=arg[a].src+',';
            }
            $("#picture").attr("value", arg[0].src);
            //图片预览
            $("#preview").attr("src", arg[0].src);
        })

    });
    //弹出图片上传的对话框
    function upImage() {
        var myImage = _editor.getDialog("insertimage");
        myImage.open();
    }
</script>
</html>