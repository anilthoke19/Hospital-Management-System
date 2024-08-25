<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CssFile/Admin.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />






<style>
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
color: green; 
}


.main-menu li a{
color: green;
}

.main-menu li a span
{
padding-left:14px;
color:purple;
}

.main-menu{
margin-top: 0px;
height:100%;
margin: 0%;

}

 img{

}
body{
  

 
 }


.DoctorSidebar button{
	margin-top:5px;
	margin-left: 90px;
}

.DoctorSidebar input{
	
	width: 270px;
	border-color: navy;
	
}

.dropbtn {
  background-color: #04AA6D;
  background-color:black;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  width: 100px;
}

#two,#four,#five
{
margin-left: 12px;
}
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body style="background-image:url('images/bcimage2.jpg'); background-repeat: no-repeat;background-size: cover;">


<%
 response.setHeader("Cache-Control","no-store");
%>


<div class="Container"  >

   
  <nav class="main-menu" id="on" >
            <ul>
                <li>
                    <a href="https://jbfarrow.com">
                        <i class="fa fa-solid fa-hospital fa-3x"></i>
                        <span class="nav-text">
                       ADMIN PAGE!
                        </span>
                    </a>
                  
                </li>
              
              
              
              
              
              
                <li>
                    <a href="AddDoc.jsp">
                     <i id="two" class="fa-solid fa-user-doctor fa-3x"></i>
                        <span class="nav-text">
                            ADD DOCTOR
                        </span>
                    </a>
                </li>
                
                <li>
                    <a href="AddRec.jsp">
                    <i class="fa fa-solid fa-user-nurse fa-3x"></i>
                        <span class="nav-text">
                          ADD RECEPTIONIST
                        </span>
                    </a>
                </li>
                <li>
                   <a href="ViewDoctor.jsp">
<i id="four" class="fa-solid fa-book-medical fa-3x"></i>                        <span class="nav-text">
                           VIEW DOCTOR
                        </span>
                    </a>
                </li>
                <li>
                   <a href="ViewReceptionist.jsp">
<i id="five"  class="fa-solid fa-notes-medical fa-3x"></i>                        <span class="nav-text">
                            VIEW RECEPTIONIST
                            
                        </span>
                    </a>
                </li>
                <li>
                    <a href="ViewPatient.jsp">
<i class="fa fa-solid fa-pager fa-3x"></i>                        <span class="nav-text">
                            VIEWPATIENT
                        </span>
                    </a>
                </li>
            </ul>

            <ul class="logout">
                <li>
                   <a href="LandingPage.jsp">
                         <i class="fa fa-power-off fa-3x"></i>
                        <span class="nav-text">
                            Logout
                        </span>
                    </a>
                </li>  
            </ul>
           
        </nav>
        
  
		</div>


<!-- Example split primary button -->





</body>
</html>