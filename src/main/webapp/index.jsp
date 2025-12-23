<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%-- ✅ Tomcat 11 = Jakarta EE → JSTL usa URIs "jakarta.tags.*" (NO java.sun.com) --%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Países</title>
</head>
<body>
    <h2>Países (MVC + JSP + Servlet)</h2>

    <!-- Botón de carga: llama al Servlet por POST -->
    <form action="${pageContext.request.contextPath}/Controlador" method="post">
        <button type="submit">Cargar países</button>
    </form>

    <hr/>

    <table border="1" cellpadding="6">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Capital</th>
            </tr>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${empty paises}">
                    <tr>
                        <td colspan="3">Presiona "Cargar países" para listar.</td>
                    </tr>
                </c:when>
                <c:otherwise>
                    <c:forEach var="p" items="${paises}">
                        <tr>
                            <td><c:out value="${p.idpais}"/></td>
                            <td><c:out value="${p.nombre}"/></td>
                            <td><c:out value="${p.capital}"/></td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>

</body>
</html>
