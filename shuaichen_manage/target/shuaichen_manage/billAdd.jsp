<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" errorPage="error.jsp" %>
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
                <li id="active"><a href="${pageContext.request.contextPath}/bill/billList">账单管理</a></li>
                <li><a href="${pageContext.request.contextPath}/provider/allProviders">供应商管理</a></li>
                <li><a href="${pageContext.request.contextPath}/user/allUsers">用户管理</a></li>
                <li><a href="${pageContext.request.contextPath}/deviceList">设备管理</a></li>
                <li><a href="${pageContext.request.contextPath}/loginOut">退出系统</a></li>
                <li><a href="${pageContext.request.contextPath}/toUpdatePass">密码修改</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>账单管理页面 >> 订单添加页面</span>
        </div>
        <div class="providerAdd">
            <form method="post" action="${pageContext.request.contextPath}/bill/afterbillAdd">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="billId">账单编码：</label>
                    <input type="text" name="billId" id="billId" required/>
                    <span>*请输入账单编码</span>
                </div>
                <div class="">
                    <label for="userId">租户编码：</label>
                    <input type="text" name="userId" id="userId" required/>
                    <span>*请输入已存在的租户编码</span>
                </div>
                <div>
                    <label for="money">总金额：</label>
                    <input type="text" name="money" id="money" required/>
                    <span>*请输入大于0的正自然数，小数点后保留2位</span>
                </div>
                <div>
                    <label for="deviceId">设备编码：</label>
                    <input type="text" name="deviceId" id="deviceId" required/>
                    <span>*请输入已存在的设备编码</span>
                </div>
                <div>
                    <label for="checked">是否付款：</label>
                    <input type="text" name="checked" id="checked" required/>
                    <span>*请输入是/否</span>
                </div>
                <div>
                    <label for="date">创建时间：</label>
                    <input type="text" name="date" id="date" required"/>
                    <span>*例如2020-01-01</span>
                </div>
                <span>${wrong}</span>
                <div class="providerAddBtn">
                    <input type="submit"/>
                    <input type="button" value="返回" onclick="history.back(-1)"/>
                </div>
            </form>
        </div>

    </div>
</section>
<footer class="footer">
</footer>
<script src="${pageContext.request.contextPath}/js/time.js"></script>

</body>
</html>