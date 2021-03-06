<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Form</title>
<link type="text/css"
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/style.css" />
      <link type="text/css"
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
</head>
<body>
    <div id="wrapper">
       <div id="header">
          <h2>CRM - CustomerRelationship Manager</h2>
       </div>
    </div>
    <div id="container">
     <h3>Add Customer</h3>
     <form:form action="saveCustomer" modelAttribute="customer" method="post">
        <form:hidden path="id"/>
        <table>
           <tbody>
             <tr>
                <td><label> First name: </label></td>
                <td><form:input path="firstName"/></td>
             </tr>
             <tr>
                <td><label> Last name: </label></td>
                <td><form:input path="lastName"/></td>
             </tr>
             <tr>
                <td><label> Email: </label></td>
                <td><form:input path="email"/></td>
             </tr>
             <tr>
                <td><input type="submit" class="save-button"/></td>
                
             </tr>
           </tbody>
        </table>
     </form:form>
    </div>
</body>
</html>