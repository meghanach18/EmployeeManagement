<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot JSP CRUD</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.12.1/css/all.css" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
	<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.17.0/additional-methods.min.js"></script>
	


<style >



.error {
color: #F00;



}
input {
width:350px;
}
.c{



border:2px red ridge;
}
</style>





 
</head>
<body>

 
<div class="col-md-4 offset-4 mt-3">
  <spring:url value="/insert" var="saveURL" />
  <h2>ADD EMployee</h2>
  <form:form modelAttribute="employeeForm" method="post" action="${saveURL }" cssClass="form" id="form" >
   <form:hidden path="id"/>
  
   <div class="form-group">
				<label>Name</label><br> 
				<input class="input-field" type="text" name="name" id="name path="name" class="form-control"> <br>
				<form:errors path="name"/> 
				</div>
				
				
                <div class="form-group">
				<label>Designation</label><br> 
				<input class="input-field" type="text" name="designation" id="designation" path="designation" class="form-control"> <br>
				<form:errors path="designation"/> 
				</div>
				
				<div class="form-group">
				<label>Address</label><br> 
				<input class="input-field" type="text" name="address" id="address" path="address" class="form-control"> <br>
				<form:errors path="address"/> 
				</div>
				
				<div class="form-group">
				<label>Grade</label><br> 
				<input class="input-field" type="text" name="grade" id="grade" path="grade" class="form-control"> <br>
				<form:errors path="grade"/> 
				</div>
  
            <div class="form-group">
				<label>phone</label><br> 
				<input class="input-field" type="text" name="phone" id="phone" path="phone" class="form-control"> <br>
				<form:errors path="phone"/> 
				</div>
  
  
				<div class="form-group">
				<label>Password</label><br> 
				<input class="input-field" type="text" name="password" id="password" path="phone" class="form-control"> <br>
				<form:errors path="password"/> 
				</div>
				
				<div class="form-group">
				<label>Roles</label><br> 
				<input class="input-field" type="text" name="roles" id="roles" path="roles" class="form-control"> <br>
				<form:errors path="roles"/> 
				</div>
<div>
<button type="submit" class="btn btn-primary">Save</button> 
    <a class="btn btn-primary" href="${cancelURL}" role="button" >Cancel</a> 
    </div>
  </form:form>
  </div>
  <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js"></script>
<script type="text/javascript" src="/js/form.js"></script>
</body>
</html>