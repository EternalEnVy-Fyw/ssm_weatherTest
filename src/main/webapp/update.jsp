<%--
  Created by IntelliJ IDEA.
  User: feiyanwen
  Date: 2019-05-19
  Time: 14:52
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
    <form action="updateAir" method="post">
        <input type="hidden" name="id" value="${air.id}">
        <table border="1" cellspacing="0">
            <tr>
                <td><h1>维护</h1></td>
            </tr>
            <tr>
                <td>
                    监测区域:
                    <select name="districtid">
                        <option value="-1">--不限--</option>
                        <c:forEach items="${disList}" var="dis">
                            <option value="${dis.id}" ${dis.id==air.districtid?'selected':''}>${dis.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    监测日期:<input type="text" name="monitortime" value="${air.monitortime}">
                </td>
            </tr>
            <tr>
                <td>
                    PM10值:<input type="text" name="pm10" value="${air.pm10}">
                </td>
            </tr>
            <tr>
                <td>
                    PM2.5值:<input type="text" name="pm25" value="${air.pm25}">
                </td>
            </tr>
            <tr>
                <td>
                    监测站:<input type="text" name="monitoringstation" value="${air.monitoringstation}">
                </td>
            </tr>
                <td>
                    <input type="submit" value="保存">
                    <input type="reset" value="删除" onclick="window.location.href='deleteAir?id=${air.id}'">
                    <input type="button" value="返回" onclick="window.location.href='findAllAir'">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
