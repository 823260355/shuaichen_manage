<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>帅辰工程设备租赁管理平台</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>帅辰工程设备租赁管理平台</h1>

    <div class="publicHeaderR">
        <p><span>您好！</span><span style="color: #fff21b"> Admin</span> , 欢迎你！</p>
        <a href="${pageContext.request.contextPath}/loginOut">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2020年2月28日 11:11  星期五</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li ><a href="${pageContext.request.contextPath}/bill/billList">账单管理</a></li>
                <li><a href="${pageContext.request.contextPath}/provider/allProviders">供应商管理</a></li>
                <li><a href="${pageContext.request.contextPath}/user/allUsers">用户管理</a></li>
                <li><a href="${pageContext.request.contextPath}/deviceList">设备管理</a></li>
                <li><a href="${pageContext.request.contextPath}/loginOut">退出系统</a></li>
                <li><a href="${pageContext.request.contextPath}/toUpdatePass">密码修改</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <img class="wColck" src="${pageContext.request.contextPath}/img/clock.jpg" alt=""/>
        <div class="wFont">
            <h2>Admin</h2>
            <p>帅辰工程设备租赁管理平台!</p>
            <span id="hours"></span>
        </div>
    </div>
</section>
<footer class="footer">
</footer>
<script src="${pageContext.request.contextPath}/js/time.js"></script>
</body>
</html>