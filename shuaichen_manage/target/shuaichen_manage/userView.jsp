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
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li><a href="${pageContext.request.contextPath}/bill/billList">账单管理</a></li>
                <li ><a href="${pageContext.request.contextPath}/provider/allProviders">供应商管理</a></li>
                <li id="active"><a href="${pageContext.request.contextPath}/user/allUsers">用户管理</a></li>
                <li><a href="${pageContext.request.contextPath}/deviceList">设备管理</a></li>
                <li><a href="${pageContext.request.contextPath}/loginOut">退出系统</a></li>
                <li><a href="${pageContext.request.contextPath}/toUpdatePass">密码修改</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面 >> 用户信息查看页面</span>
        </div>
        <div class="providerView">
            <p><strong>用户编号：</strong><span>${user.getUserId()}</span></p>
            <p><strong>用户名称：</strong><span>${user.getUserName()}</span></p>
            <p><strong>用户性别：</strong><span>${user.getSex()}</span></p>
            <p><strong>出生日期：</strong><span>${user.getBirthday()}</span></p>
            <p><strong>用户电话：</strong><span>${user.getUserTelephone()}</span></p>
            <p><strong>用户地址：</strong><span>${user.getUserAddress()}</span></p>
            <p><strong>用户类别：</strong><span>${user.getUserType()}</span></p>

            <a href="${pageContext.request.contextPath}/user/allUsers">返回</a>
        </div>
    </div>
</section>
<footer class="footer">
</footer>
<script src="${pageContext.request.contextPath}/js/time.js"></script>

</body>
</html>