<%--
  Created by IntelliJ IDEA.
  User: feiyanwen
  Date: 2019-05-30
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="findAllAir" method="post">
    <h1>空气质量监测信息库</h1>
    按区域查询
    <select name="districtid">
        <option value="-1">--不限--</option>
        <c:forEach items="${disList}" var="dis">
            <option value="${dis.id}" ${dis.id==districtid?'selected':''}>${dis.name}</option>
        </c:forEach>
    </select>
    <input type="submit" value="查找">
    <a href="selectAddDis">添加条目</a>
</form>

<c:if test="${page.total!=0}">

<table border="1" cellspacing="0">
    <thead>
    <tr>
        <th>序号</th>
        <th>区域</th>
        <th>监测时间</th>
        <th>PM10数据</th>
        <th>PM2.5数据</th>
        <th>监测站</th>
    </tr>
    </thead>




    <form method="post" action="BookServlet">
        <c:forEach items="${page.list}" var="air" varStatus="num">
        <tr>
            <td>${num.count}</td>
            <td><a href="updateSelect?id=${air.id}">${air.district.name}</a></td>
            <td>${air.monitortime}</td>
            <td>${air.pm10}</td>
            <td>${air.pm25}</td>
            <td>${air.monitoringstation}</td>
        </tr>
        </c:forEach>
</table>
<table>
    <tr>
            ${page.total} 条记录 ${page.pageNum}/${page.pages<1?1:page.pages} 页
        <a href="findAllAir?districtid=${districtid}">首页</a>
        <a href="findAllAir?index=${page.prePage==0?1:page.prePage}&districtid=${districtid}">上一页</a>
        <a href="findAllAir?index=${page.nextPage==0?page.pages:page.nextPage}&districtid=${districtid}">下一页</a>
        <a href="findAllAir?index=${page.pages}&districtid=${districtid}">尾页</a>
    </tr>

</table>

</c:if>

<c:if test="${page.total==0}">
    <tr><h1>抱歉,暂无数据</h1></tr>
</c:if>
</form>

</body>
</html>
