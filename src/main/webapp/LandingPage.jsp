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

.slider-section {
	background-image:url("images/m.jpg");
	animation:changeImage 15s linear infinite;
	background-size: cover;
	background-position: center;
	height: 400px;
	display: flex;
	justify-content: center;
	align-items: center;
	color: #fff;
	text-align: center;
}

@keyframes changeImage{
25%{
	background-image:url("images/ban2.jpg");
}

75%{
	background-image:url("images/ban3.jpg");
}
100%{
	background-image:url("images/ban33.jpg");
}

}

.take{
padding:13px;
border: 5px solid black;
border-radius: 120px;
}

.slider-section h1 {
	font-size: 3em;
	margin-bottom: 20px;
	color:purple;
	
}

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

.footer {
	background-color: #333;
	color: #fff;
	text-align: center;
	padding: 20px 0;
}


@media ( max-width : 768px) {
	.slider-section {
		height: 300px;
	}
	.slider-section h1 {
		font-size: 2em;
	}
	.menu-item {
		display: block;
		
	}
}
.contact-section{
background-color:black;
}
.contact-section h2{
text-align:center;
color: white;
}
.contact-section p{
color:white;
text-align:center;
}
.contact-form {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .contact-form input[type="text"],
        .contact-form input[type="email"],
        .contact-form textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .contact-form textarea {
            height: 150px;
        }
        .contact-form input[type="submit"] {
            background-color: #333;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        .contact-form input[type="submit"]:hover {
            background-color: #555;
        }
#doctor img,#doctorNext img
{
    height: 230px;
    width: 330px;
    border-radius: 10px;
    margin-right: 30px;
   padding: 20px;
    
}

.AllDoctor
{
    border:4px solid black;
    margin: 10px;
    background-color:aqua;
}
 .contact-form label{
 
 padding-top: 18px;} 
 
 .marq{
 padding-top: 10px;
 overflow:hidden;
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
	<div class="container">
		<div class="slider-section">
			<div class="take">
				<h1>We take care of you</h1>
				<p>Best health </p>
			</div>
		
		
	</div>
		
						
<div class="AllDoctor">
<marquee class="marq">
    <h3  >Our WorldClss Doctor Team</h3>
    </marquee >
       <div class="row" id="doctor">


        <div class="col-4" id="doctor4"> <img src="images/doc5.jpg" alt=""> 
            <h4>Cardiologists</h4>
            <h5>Dr.HemLata (MBBS.MD).London</h5>
        </div>
        
        
        <div class="col-4" id="doctor5">
             <img src="images/doc1.jpg" alt="">
             <h4>Allergist</h4>
             <h5>Dr.Vishal (MBBS.MD).India</h5>   
             </div>
        
        
        <div class="col-4" id="doctor6">
             <img src="images/doc2.jpg" alt="">
             <h4>Hematologist</h4>
             <h5>Dr.Sushant (MBBS.MD).Japan</h5>
            </div>
    </div>



    <div class="row" id="doctorNext">

        <div class="col-4" id="doctor4"> <img src="images/doc7.jpg" alt=""> 
            <h4>Cardiologists</h4>
            <h5>Dr.Manoj Sinha (MBBS.MD).America </h5>
        </div>
        
        
        <div class="col-4" id="doctor5">
             <img src="images/doc6.jpg" alt="">
             <h4>Allergist</h4>
             <h5>Dr.Vishal (MBBS.MD).Pune</h5>   
             </div>
        
        
        <div class="col-4" id="doctor6">
             <img src="images/docL7.jpg" alt="">
             <h4>Hematologist </h4>
             <h5>Dr.Sanjivani (MBBS.MD).Mumbai</h5>
            </div>
            
            </div>

</div>
	
		
		
		
		
		
		
		
		
		
		
		
		<div id="about" class="about-section">
			<h2>About Us</h2>
			<p>
			We are provide best medicine,care .Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed
				imperdiet, nunc eget efficitur feugiat, nulla purus varius nunc, sit
				amet varius augue libero quis lectus.</p>
		</div>
		<div id="contact" class="contact-section">
		
		<div class="contact-section">
        <h2>Take Appointment</h2>
        <div class="contact-form">
            <form action="AddPatientC" method="post">
                <input type="text" name="pname" placeholder="Your Name" required autocomplete="off">
                <input type="text" name="pcontact" placeholder="Your contact" autocomplete="off" required >
                
                <div class="special">
                <select name="dieses">
                <option>Brain</option>
                <option>Fever</option>
                <option>Ortho</option>
                <option>Cardio</option>
                <option>Cardiac</option>
                <option>HammerSpant</option>
                <option>BlodSp</option>
                <option>Fever</option>
                <option>Ortho</option>
                </select>
                </div>
                
                <div>
                <label for="pdate">select appointment date</label>
                <input type="date" name="pdate" autocomplete="off" required >
               </div>
                <label for="ptime">  Select your slot</label>&nbsp;&nbsp;
                <input type="time" name="ptime">
                <br><br>
                <input type="submit" value="Submit">
                
                
            </form>
        </div>
    </div>
	
			<p>Email: info@panasoniHospital.in</p>
			<p>Phone: 111-456-8804</p>
			<p>Address: 104 second floor bavdhan, pune</p>
		</div>
	
	
	
	<footer class="footer">
		<p>&copy; 2024 Our hospitalManagement. All rights reserved.</p>
	</footer>
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	
</body>
</html>