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
                <li><a href="${pageContext.request.contextPath}/provider/allProviders">供应商管理</a></li>
                <li><a href="${pageContext.request.contextPath}/user/allUsers">用户管理</a></li>
                <li  id="active"><a href="${pageContext.request.contextPath}/deviceList">设备管理</a></li>
                <li><a href="${pageContext.request.contextPath}/loginOut">退出系统</a></li>
                <li><a href="${pageContext.request.contextPath}/toUpdatePass">密码修改</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>设备管理页面 >> 设备添加页面</span>
        </div>
        <div class="providerAdd">
            <form action="${pageContext.request.contextPath}/deviceAdd" method="post">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="deviceId">设备编码：</label>
                    <input type="text" name="deviceId" id="deviceId"/>
                    <span>*请输入设备编码，且不能重复</span>
                </div>
                <div>
                    <label for="deviceName">设备名称：</label>
                    <input type="text" name="deviceName" id="deviceName"/>
                    <span >*请输入设备名称</span>
                </div>
              <div class="">
              	<label for="provider.providerId">供应商编码：</label>
              	<input type="text" name="provider.providerId" id="provider.providerId"/>
              	<span>*请输入供应商编码，可重复</span>
              </div>
               
                <div>
                    <label for="deviceNum">设备数量：</label>
                    <input type="text" name="deviceNum" id="deviceNum"/>
                    <span >*</span>
                </div>
               <div>
               	<label for="deviceMoney">单价：</label>
               	<input type="text" name="deviceMoney" id="deviceMoney"/>
               	<span >*</span>
               </div>
                <div>
                    <label>设备类别：</label>
                    <input type="radio" name="deviceType" value="小型"/>小型
                    <input type="radio" name="deviceType" value="中型"/>中型
                    <input type="radio" name="deviceType" value="大型"/>大型
                    <span >*</span>
                </div>
                <span>${wrong3}</span>
                <div class="providerAddBtn">
                    <!--<a href="#">保存</a>-->
                    <!--<a href="userList.jsp">返回</a>-->
                    <input type="submit" />
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