<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<body>
	<div>${welcomeMessage}</div>

	<form:form action="welcomeUserSubmit" method="POST"
		modelAttribute="user">
		<spring:message code="lang.lang" /> : <a href="?lang=en">English</a>|<a
			href="?lang=vi">VN</a>
		<label><spring:message code="register.fullName" /> : </label>
		<form:input path="fullName" />

		<label><spring:message code="register.age" /> : </label>
		<form:input path="age" />

		<spring:message code="register.email" /> :<form:input path="email" />
		<form:input path="email" />
		<form:errors path="email" cssClass="error" />

		<spring:message code="register.password" /> :<form:password	path="password" />
		<form:input path="password" />
		<form:errors path="password" cssClass="error" />
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>