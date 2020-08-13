<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <li id="active"><a href="${pageContext.request.contextPath}/provider/allProviders">供应商管理</a></li>
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
            <span>供应商管理页面</span>
        </div>
        <div class="search">

            <form action="${pageContext.request.contextPath}/provider/toViewProvider" method="post">
                <span>查询供应商：</span>
                <input type="text" name="id" placeholder="请输入供应商的编号"/>
                <input type="submit" value="查询" style="width:100px"/>
                <a href="${pageContext.request.contextPath}/provider/toAddProvider">添加供应商</a>
            </form>
        </div>
        <span>${noResult1}</span>
        <!--供应商操作表格-->
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="10%">供应商编码</th>
                <th width="20%">供应商名称</th>
                <th width="10%">联系人</th>
                <th width="10%">联系电话</th>
                <th width="10%">传真</th>
                <th width="10%">创建时间</th>
                <th width="30%">操作</th>
            </tr>
            <c:forEach var="provider" items="${allProviders}">
                <tr>
                    <td>${provider.getProviderId()}</td>
                    <td>${provider.getProviderName()}</td>
                    <td>${provider.getContact()}</td>
                    <td>${provider.getContactTelephone()}</td>
                    <td>${provider.getFax()}</td>
                    <td>${provider.getCreationTime()}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/provider/toViewProvider?id=${provider.getProviderId()}"><img src="${pageContext.request.contextPath}/img/read.png" alt="查看" title="查看"/></a>
                        <a href="${pageContext.request.contextPath}/provider/toUpdateProvider?id=${provider.getProviderId()}"><img src="${pageContext.request.contextPath}/img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="${pageContext.request.contextPath}/provider/deleteProvider?id=${provider.getProviderId()}" class="removeProvider"><img src="${pageContext.request.contextPath}/img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>
            </c:forEach>

        </table>

    </div>
</section>

<!--点击删除按钮后弹出的页面-->
<%--<div class="zhezhao"></div>--%>
<%--<div class="remove" id="removeProv">--%>
<%--   <div class="removerChid">--%>
<%--       <h2>提示</h2>--%>
<%--       <div class="removeMain" >--%>
<%--           <p>你确定要删除该供应商吗？</p>--%>
<%--           <a href="#" id="yes">确定</a>--%>
<%--           <a href="#" id="no">取消</a>--%>
<%--       </div>--%>
<%--   </div>--%>
<%--</div>--%>


<footer class="footer">
</footer>

<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/js.js"></script>
<script src="${pageContext.request.contextPath}/js/time.js"></script>

</body>
</html>