<%@page import="Hospital.service.AdminService"%>
<%@page import="java.util.List"%>
<%@page import="Hospital.model.DoctorModel"%>
<%@page import="Hospital.service.DoctorServices"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CssFile/AddPat.css" rel="stylesheet" type="text/css">



</head>
<body>



<%@ include file="ReceptionistHandle.jsp" %>

<div class="sidebar">
       <%! AdminService as=new AdminService();
       List<DoctorModel>dlist=as.viewAllDoctor();
       DoctorModel dm=new DoctorModel();
       int i;
       %>
       
   
  <!-- 
<form action="AddPatientC" method="get">
  <div class="mb-2">

    <label for="pname" class="form-label">Name</label>
    <input type="text" class="form-control" name="pname" aria-describedby="emailHelp">
  </div>
  
  <div class="mb-2">
    <label for="pcontact" class="form-label">Contact</label>
    <input type="tel" class="form-control" name="pcontact">
  </div>
  
    <div class="mb-2">
    <label for="dieses" class="form-label">dieses</label>
    <input type="tel" class="form-control" name="dieses">
  </div>
   
   <div class="mb-2">
    <label for="pdate" class="form-label">Date</label>
    <input type="date" class="form-control" name="pdate">
  </div>
 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</div>

 -->
 
 
  	<div class="container">
  	 <div class="HeadName">
      <h2>Add Patient</h2>
      </div>
      <form method="GET" autocomplete="on" action="AddPatientC">
      
     
       


        <!--Second name-->
    		<div class="box">
          <label for="rname" class="fl fontLabel">  Name: </label>
    			<div class="fl iconBox"><i class="fa fa-user" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" required name="pname" placeholder="name" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!--Second name-->


    		<!---Phone No.------>
    		<div class="box">
          <label for="rContact" class="fl fontLabel"> Contact No.: </label>
    			<div class="fl iconBox"><i class="fa fa-phone-square" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" required maxlength="10"  name="pcontact" placeholder="Contact" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!---Phone No.---->


    		<!---Email ID---->
    		<div class="box">
          <label for="rusername" class="fl fontLabel"> Dieses </label>
    			<div class="fl iconBox"><i class="fa fa-envelope" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" required name="dieses" placeholder="dieses" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!--Email ID----->


    		<!---Password------>
    		<div class="box">
          <label for="rpassword" class="fl fontLabel">Date of op</label>
    			<div class="fl iconBox"><i class="fa fa-key" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="date" required name="pdate" placeholder="Enterr Date "class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!---Password---->

    		



    		<!---Submit Button------>
    		<div class="box" style="background: #2d3e3f">
    				<input type="Submit" name="Submit" class="submit" value="SUBMIT">
    		</div>
    		<!---Submit Button----->
      </form>
  </div>
 
 
</div>
</div>
</body>
</html>