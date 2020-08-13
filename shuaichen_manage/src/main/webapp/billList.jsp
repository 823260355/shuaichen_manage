<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                <span>账单管理页面</span>
            </div>
            <div class="search">
                <form  action="${pageContext.request.contextPath}/bill/billSelect">
                    查询账单:<input type="text" name="id" placeholder="请输入账单编号" required/>
                    <input type="submit" value="查询" style="width: 100px"/>
                    <%--添加信息--%>
                    <a href="${pageContext.request.contextPath}/bill/billAdd">添加账单</a>
                </form>



            </div>
            <!--账单表格 样式和供应商公用-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">账单编码</th>
                    <th width="10%">租户编码</th>
                    <th width="20%">设备名称</th>
                    <th width="10%">账单金额</th>
                    <th width="10%">是否付款</th>
                    <th width="10%">创建时间</th>
                    <th width="20%">操作</th>
                </tr>

                <c:forEach var="bill" items="${bills}" varStatus="status">
                    <tr>
                        <td>${bill.getBillId()}</td>
                        <td>${bill.getUserId()}</td>
                        <td>${bill.getDeviceInfo().getDeviceName()}</td>
                        <td>${bill.getMoney()}</td>
                        <td>${bill.getChecked()}</td>
                        <td>${bill.getDate()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/bill/billUpdate?id=${bill.getBillId()}"><img src="${pageContext.request.contextPath}/img/xiugai.png" alt="修改" title="修改"/></a>
                            <a href="${pageContext.request.contextPath}/bill/del/${bill.getBillId()}"><img src="${pageContext.request.contextPath}/img/schu.png" alt="删除" title="删除"/></a>
                        </td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </section>

<!--点击删除按钮后弹出的页面-->
<%--<div class="zhezhao"></div>--%>
<%--<div class="remove" id="removeBi">--%>
<%--    <div class="removerChid">--%>
<%--        <h2>提示</h2>--%>
<%--        <div class="removeMain">--%>
<%--            <p>你确定要删除该订单吗？</p>--%>
<%--            <a href="#" id="yes">确定</a>--%>
<%--            <a href="#" id="no">取消</a>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

    <footer class="footer">
    </footer>

<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/js.js"></script>
<script src="${pageContext.request.contextPath}/js/time.js"></script>

</body>
</html>