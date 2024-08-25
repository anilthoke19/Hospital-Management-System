<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CssFile/Admin.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<!-- <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
 --><style>

@import url(//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css);

@import url(https://fonts.googleapis.com/css?family=Titillium+Web:300);


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
color: blue;

  
}



.main-menu li a{
color: green;
}

.main-menu li a span
{

color:purple;
}

.main-menu{
margin-top: 0px;
height:100%;
}










i{
margin-left: 10px;
padding-bottom: 20px;
}

span{
padding-left: 20px;
}

body img{
height:400px;
width: 100%;
}
body{
/* background-image: url("images/doctorH.jpg") ;
 */ 
background: teal;
 }




</style>

</head>
<body style="background-image:url('images/bdimage4.jpg'); background-repeat: no-repeat;background-size: cover;">


<%-- <%@ include file="LandingHead.jsp" %>
 --%>
<%
 response.setHeader("Cache-Control","no-store");
%>

<div class="DoctorLoginBar">  

  <nav class="main-menu" id="on" >
  
 
            <ul>
           
                <li>
                    <a href="#">
<!--                         <i class="fa fa-film fa-2x"></i>
 -->                 
        <i class="fa-solid fa-user-doctor fa-3x"></i>
                        <span class="nav-text">
                            VIEW APPOITMENT
                        </span>
                    </a>
                </li>
                
                <li>
                    <a href="#">
<i class="fa-solid fa-file-medical fa-3x"></i>                        <span class="nav-text">
                         TREATMENT
                        </span>
                    </a>
                </li>
                
                <li>
                   <a href="DoctorWisePatient.jsp">
<i class="fa-solid fa-hospital-user fa-3x"></i>  
                      <span class="nav-text">
                           VIEW PATIENT
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
        
  
  </div>
  
 
  
 
  

</div>








</body>
</html>