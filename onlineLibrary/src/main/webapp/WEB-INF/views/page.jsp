<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
  
  
  <c:set var="contextRoot" value="${pageContext.request.contextPath}" />
  <s:url var="css" value="/resources/css" />
  <s:url var="js" value="/resources/js" />
  <s:url var="images" value="/resources/images" />
  
    

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title> LIBRARY --> ${title}  </title>
    
    <script>
        window.menu = '${title} ';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>


   <!-- navigation -->
   
     <%@include file="./shared/navbar.jsp" %>

  
    <!-- page content -->
   
   <!-- loading home content -->
   <c:if test="${userClickHome == true }">
     <%@include file="./home.jsp" %>
   </c:if>
   
   <!-- loading home content -->
   <c:if test="${userClickAbout == true }">
     <%@include file="./about.jsp" %>
   </c:if>
   
   <!-- loading home content -->
   <c:if test="${userClickContact == true }">
     <%@include file="./contact.jsp" %>
   </c:if>
   

    <!-- footer  -->
   
   <%@include file="./shared/footer.jsp" %>
   
    <!-- /.container -->

    <!-- JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/bootstrap.js"></script>
    
    <!-- custom javascript -->
      <script src="${js}/myapp.js"></script>
    
</body>

</html>
