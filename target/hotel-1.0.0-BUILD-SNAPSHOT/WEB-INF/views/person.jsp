<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title><spring:message code="label.title" /></title>
</head>
<body>

<a href="<c:url value="/logout" />">
	<spring:message code="label.logout" />
</a>

<h2><spring:message code="label.title" /></h2>


<h3><spring:message code="label.persons" /></h3>
<c:if test="${!empty getAllPersons}">
	<table class="db">
		<tr>
			<th><spring:message code="label.fName" /></th>
			<th><spring:message code="label.email" /></th>
			<th><spring:message code="label.phone" /></th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${getAllPersons}" var="person">
			<tr>
				<td>${person.lName}, ${person.fName}</td>
				<td>${person.email}</td>
				<td>${person.phone}</td>
				<td><a href="delete/${person.id}"><spring:message code="label.delete" /></a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>

</body>
</html>