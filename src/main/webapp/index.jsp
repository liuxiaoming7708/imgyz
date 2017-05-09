<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <script type="text/javascript">
        function changImg(){
            var img = document.getElementById("servletImg");
            var d = new Date();
            var time = d.getTime();//如果没有这个
            //下面这一句不会起作用，因为浏览器的缓存技术，图片并不会刷新
            //img.src="/myHelloWeb/servlet/ImageServlet";
            img.src="/servlet/ImageServlet?"+time;
            //?号后面的东西是通过get方式传递的
        }

    </script>
</head>

<body>
这是我的手动主页！
<br/>
<img id="servletImg" src="/servlet/ImageServlet" /><a href="javascript:changImg()">看不清</a>
</body>
</html>