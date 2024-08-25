<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



<link href="css/style.css" type="text/css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style type="text/css">


*{
	padding: 0;
	margin: 0;
}
body{
  background: url(http://wrbbradio.org/wp-content/uploads/2016/10/grey-background-07.jpg) no-repeat center fixed;
  background-size: cover;
}

.container{
	background: #2d3e3f;
	width: 380px;
	height: 450px;
	padding-bottom: 10px;
	position: absolute;
	top:50%;
	left: 50%;
	transform: translate(-50%, -50%);
	margin: auto;
  padding: 20px 60px 30px 50px;
  
}


.fl{
	float: left;
  width: 110px;
  line-height: 35px;
}

.fontLabel{
  color: white;
}

.fr{
	float: right;
}

.clr{
	clear: both;
}

.box{
	width: 360px;
	height: 35px;
	margin-top: 5px;
	font-family: verdana;
	font-size: 12px;
	padding: 10px;
   
}


.textBox{
	height: 35px;
	width: 190px;
	border: none;
  padding-left: 20px;
}

.new{
  float: left;
}

.iconBox{
	height: 35px;
	width: 40px;
	line-height: 38px;
	text-align: center;
  background: #ff6600;
}





.submit{
	float: right;
	border: none;
	color: white;
	width: 110px;
	height: 35px;
	background: #ff6600;
	text-transform: uppercase;
  cursor: pointer;
}

::-webkit-input-placeholder { /* Chrome/Opera/Safari */

}

.HeadName{

margin-bottom: 10px;

}

.dropdown {
  position: absolute;
  display: inline-block;
  left:875px;
  top: 18px;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #3e8e41;}

</style>


</head>


 <body>
 <%@ include file="AdminHandle.jsp" %>
    <!-- Body of Form starts -->
  	<div class="container">
  	 <div class="HeadName">
      <h2>ADD DOCTOR</h2>
      </div>
      <form method="get" autocomplete="on" action="AddDoctorC">
      
     
  


        <!--Second name-->
    		<div class="box">
          <label for="dname" class="fl fontLabel">  Name: </label>
    			<div class="fl iconBox"><i class="fa fa-user" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" required placeholder="First name" id="dname" name="dname" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!--Second name-->


    		<!---Speci.------>
    		<div class="box">
          <label for="rContact" class="fl fontLabel"> Specialisation </label>
    			<div class="fl iconBox"><i class="fa fa-phone-square" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" required maxlength="10"  name="specilisation" placeholder="specilisation" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!---speci.---->


    		<!---Email ID---->
    		<div class="box">
          <label for="rusername" class="fl fontLabel"> FEES </label>
    			<div class="fl iconBox"><i class="fa fa-envelope" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" required  name="fees" placeholder="Fees" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!--Email ID----->


    		<!---Password------>
    		<div class="box">
          <label for="rpassword" class="fl fontLabel"> CONTACT </label>
    			<div class="fl iconBox"><i class="fa fa-key" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" required  name="contact" placeholder="contact"class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!---Password---->

<div class="box">
          <label for="rusername" class="fl fontLabel"> USERNAME </label>
    			<div class="fl iconBox"><i class="fa fa-envelope" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" required  name="username" placeholder="Fees" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>    		



<div class="box">
          <label for="rusername" class="fl fontLabel"> PASSWORD </label>
    			<div class="fl iconBox"><i class="fa fa-envelope" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" required  name="password" placeholder="Fees" class="textBox">
    			</div>
    			<div class="clr"></div>
    		</div>

    		<!---Submit Button------>
    		<div class="box" style="background: #2d3e3f">
    				<input type="Submit" name="Submit" class="submit" value="SUBMIT">
    		</div>
    		<!---Submit Button----->
      </form>
  </div>
  <div class="dropdown">
  <button class="dropbtn">ADD</button>
  <div class="dropdown-content">
    <a href="AddDoc.jsp">DOCTOR</a>
    <a href="AddRec.jsp">RECEPTIONIST</a>
  
  </div>
 
</div>
  </div>
  </body>



</html>