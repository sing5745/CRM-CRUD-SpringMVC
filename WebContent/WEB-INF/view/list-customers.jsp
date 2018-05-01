<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css"
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
     <div id="wrapper">
         <div id="header">
              <h2>CRM - Customer Relationship Manager </h2>
         </div>
     </div>
     <div id="container">
        <div id="content">
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                </tr>
                 <c:forEach var="cu" items="${customers}">
                   <tr> 
                      <td> ${cu.firstName}</td>
                      <td> ${cu.lastName}</td>
                      <td> ${cu.email}</td>
                   </tr>
                </c:forEach>
                          
            </table>
        </div>
     </div>
</body>
</html>