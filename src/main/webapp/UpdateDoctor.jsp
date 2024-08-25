<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor update </title>
<link href="CssFile/DoctorUpdate.css" rel="stylesheet" type="text/css">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" >


</head>
<body>
<%@ include file="AdminHandle.jsp" %>



<div class="DoctorSidebar2">
<h2>UPDATE DOCTOR</h2>
<form action="AddDoctorC" method="get">
<div class="row">
 <div class="col">
 
     <label for="dname" class="form-label">Enter Name</label>
      <input type="text" class="form-control" placeholder="First name" id="dname" name="dname">
    </div>
    
    <div class="col">
        <label for="dspecilisation" class="form-label">Specialisation</label>
      <input type="text" class="form-control" name="specilisation" placeholder="specilisation">
    </div>
</div>

<div class="row">
 <div class="col">
         <label for="dfees" class="form-label">Fees</label>
      <input type="text" class="form-control" name="fees" placeholder="Fees">
    </div>
    </div>
    
    <div class="row">
<div class="col">       
 <label for="dcontact" class="form-label">contact</label>
      <input type="text" class="form-control" name="contact" placeholder="contact">
    </div>
    
    </div>


<div class="row">

 <div class="col">
         <label for="dusername" class="form-label">USERNAME</label>
      <input type="text" class="form-control" name="username" placeholder="username">
    </div>
    
    <div class="col">
                     <label for="dusername" class="form-label">PASSWORD</label>
      <input type="text" class="form-control"  name="password" placeholder="password">
    </div>
</div>

<div class="col">

<button type="submit" name="s" value="SignIn">UPDATE</button>
  
</div>
    
</div>

</form>




</div></div></div></div>






<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>