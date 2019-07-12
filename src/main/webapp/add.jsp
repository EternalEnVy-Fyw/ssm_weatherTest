<%--
  Created by IntelliJ IDEA.
  User: feiyanwen
  Date: 2019-05-19
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>




</head>
<body>
    <form action="addAir" method="post">
        <table border="1" cellspacing="0">
            <tr>
                <td><h1>添加新条目</h1></td>
            </tr>
            <tr>
                <td>
                    监测区域:
                    <select name="districtid">
                        <option value="-1">--不限--</option>
                        <c:forEach items="${disList}" var="dis">
                            <option value="${dis.id}">${dis.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    监测日期:<input type="text" name="monitortime">
                </td>
            </tr>
            <tr>
                <td>
                    PM10值:<input type="text" name="pm10">
                </td>
            </tr>
            <tr>
                <td>
                    PM2.5值:<input type="text" name="pm25">
                </td>
            </tr>
            <tr>
                <td>
                    监测站:<input type="text" name="monitoringstation">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="保存">
                    <input type="reset" value="重置">
                    <input type="button" value="放弃" onclick="window.location.href='findAllAir'">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
