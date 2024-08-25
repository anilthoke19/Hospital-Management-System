<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
}

header {
	background-color:gray;
	color: #fff;
	padding: 15px 0;
	text-align: center;
    color:navy;
    font-weight:bolder;
   text-shadow: 2px 2px red;
   
    
}

nav {
	background-color: #444;
	text-align: center;
	padding: 10px 0;
}

nav a {
	color:yellow;
	text-decoration: none;
	padding: 10px 20px;
}

.container {
	max-width: 1200px;
	margin: auto;
	padding: 20px;
}

.


.slider-section p {
	color: maroon;
	text-decoration: underline;
}

.menu-section {
	
	text-align: center;
}

.menu-section h2 {
	font-size: 2em;
	margin-bottom: 10px;
}

.menu-item {
	display: inline-block;
	margin: 0 10px;
}


@media ( max-width : 768px) {
	
	.menu-item {
		display: block;
		
	}
}
  
.menu{
position:sticky;
top:0;
overflow:inherit;
}  
        
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" >

</head>
<body>

<div class="menu">
	<header>
	
	
		<h1>Hospital Management System</h1>
	</header>
	
	<nav>
		<a href="#">Home</a> 
		<a href="#about">About Us</a>
		<a href="#contact">Contact</a>
		<a href="NewFile.jsp">Services</a>
		<a href="LoginForm.jsp">Login</a>
		
	</nav>
	</div>
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	
</body>
</html>