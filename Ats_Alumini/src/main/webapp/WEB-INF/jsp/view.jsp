<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<portlet:defineObjects />
<h1>REGISTRATION PORTLET FOR ALUMINI...</h1>
<portlet:actionURL var="actionOneMethodURL">
	<portlet:param name="action" value="actionOne"></portlet:param>
</portlet:actionURL>

<form action="${actionOneMethodURL}" name="actionform" method="POST">
	Name: <input type="text" name="userName"><br>
	<input type="submit">	
</form>