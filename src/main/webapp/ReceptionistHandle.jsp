<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.main-menu li a {
position:relative;
display:table;
border-collapse:collapse;
border-spacing:0;

 font-family: arial;
font-size: 14px;
text-decoration:none;
-webkit-transform:translateZ(0) scale(1,1);
-webkit-transition:all .1s linear;
transition:all .1s linear;
color:green;
  
}


.main-menu{
margin-top: 0px;
height:100%;

}

body img{
height:400px;
width: 100%;
}
body{
background-image:url('images/bcimage5.jpg'); background-repeat: no-repeat;background-size: cover;

}

.main-menu li
{
margin-bottom: 15px;
}

.main-menu li a{
color: green;
}

.main-menu li a span
{
padding-left:4px;
color:purple;
}

#one
{
margin-left: 10px;
}

</style>
<link href="CssFile/Admin.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />


</head>

<!-- <body style="background-image:url('images/bdimage4.jpg'); background-repeat: no-repeat;background-size: cover;">
 -->
 <body>
<%
 response.setHeader("Cache-Control","no-store");

%>

  <nav class="main-menu" style="margin-left: 0px">
            <ul>
                <li>
                    <a href="https://jbfarrow.com">
                        <i class="fa fa-home fa-2x"></i>
                        <span class="nav-text">
                         Welcome.....
                        </span>
                    </a>
                  
                </li>
              
                
              
                <li>
                    <a href="AddPatient.jsp">
<i id="one" class="fa-solid fa-person-circle-plus fa-3x"></i>                        <span class="nav-text">
                            ADD PATIENT
                        </span>
                    </a>
                </li>
                <li>
                    <a href="ViewPatientReceptionist.jsp">
                        <i class="fa fa-book fa-2x"></i>
                        <span class="nav-text">
                         VIEW PATIENT DETAILS
                        </span>
                    </a>
                </li>
               
              
            </ul>

            <ul class="logout">
                <li>
                   <a href="LandingPage.jsp">
                         <i class="fa fa-power-off fa-2x"></i>
                        <span class="nav-text">
                            Logout
                        </span>
                    </a>
                </li>  
            </ul>
           
        </nav>
        
  
				




</body>
</html>