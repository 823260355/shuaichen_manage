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
            <span>用户管理页面 >> 用户修改页面</span>
        </div>
        <div class="providerAdd">
            <form method="post" action="${pageContext.request.contextPath}/user/updateUser">
                <input type="hidden" name="userId" id="userId" value="${user.getUserId()}"/>
                <input type="hidden" name="password" id="password" value="${user.getPassword()}"/>

                <div>
                    <label for="userName">用户名称：</label>
                    <input type="text" name="userName" id="userName" value="${user.getUserName()}"/>
                    <span >*</span>
                </div>
                <div>
                    <label >用户性别：</label>
                    <select name="sex" >
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
                    <span></span>
                </div>
                <div>
                    <label for="birthday">出生日期：</label>
                    <input type="text" name="birthday" id="birthday" value="${user.getBirthday()}"/>
                    <span >*如2020-01-01</span>
                </div>
                <div>
                    <label for="userTelephone">用户电话：</label>
                    <input type="text" name="userTelephone" id="userTelephone" value="${user.getUserTelephone()}"/>
                    <span >*</span>
                </div>
                <div>
                    <label for="age">年龄：</label>
                    <input type="text" name="age" id="age" value="${user.getAge()}"/>
                    <span >*</span>
                </div>
                <div>
                    <label for="userAddress">用户地址：</label>
                    <input type="text" name="userAddress" id="userAddress" value="${user.getUserAddress()}"/>
                </div>
<%--                <div>--%>
<%--                    <label >用户类别：</label>--%>
<%--                    <input type="radio" name="userType " value="管理员" />管理员--%>
<%--                    <input type="radio" name="userType" value="经理" />经理--%>
<%--                    <input type="radio" name="userType" value="普通用户" />普通租户--%>

<%--                </div>--%>
                <div>
                    <label >用户类别：</label>
                    <select name="userType" >
                        <option value="管理员">管理员</option>
                        <option value="经理">经理</option>
                        <option value="普通用户">普通用户</option>
                    </select>
                    <span></span>
                </div>
                <div class="providerAddBtn">
                    <!--<a href="#">保存</a>-->
                    <!--<a href="userList.jsp">返回</a>-->
                    <input type="submit">
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