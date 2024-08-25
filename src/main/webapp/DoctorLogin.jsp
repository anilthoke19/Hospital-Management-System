<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Login</title>

<style type="text/css">

 #back a{
	color:black;
	text-decoration: none;
}

 #back:hover{
 background-color:red;
	color:black;
	text-decoration: none;
}


#back{
margin-left: 40px;

}
</style>



<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" >

<link href="LoginPageCss/Login.css" rel="stylesheet" type="text/css">
</head>
<body>





<section class="vh-90" style="background-color: #9A616D;">
  <div class="container py-5 vh-90">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-xl-10">
        <div class="card" style="border-radius: 1rem;">
          <div class="row g-0">
            <div class="col-md-6 col-lg-5 d-none d-md-block">
                            <img src="https://wallpapers.com/images/high/hd-medical-doctor-with-facemask-mvpr3mlyq0zkvpy7.webp"
                alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
           
            </div>
            <div class="col-md-6 col-lg-7 d-flex align-items-center">
              <div class="card-body p-4 p-lg-5 text-black">

                <form action="DoctorVerify" method="get">

                  <div class="d-flex align-items-center mb-3 pb-1">
                    <i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i>
                    <span class="h1 fw-bold mb-0">Doctor Login</span>
                  </div>

                  <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign into your account</h5>

                  <div data-mdb-input-init class="form-outline mb-4">
                    <input type="text" name="duser" class="form-control form-control-lg" />
                    <label class="form-label" for="duser">Email address</label>
                  </div>

                  <div data-mdb-input-init class="form-outline mb-4">
                    <input type="password" name="dpass" class="form-control form-control-lg" />
                    <label class="form-label" for="dpass">Password</label>
                  </div>

                  <div class="pt-1 mb-4">
<!--                     <button data-mdb-button-init data-mdb-ripple-init class="btn btn-dark btn-lg btn-block" type="submit" id="back">Login</button>
 -->                     
                  <input type='submit' name='s' value='SUBMIT' id="back">
 
  <button id="back"><a href="HospitalManagment.jsp"> BACK </a></button> 
                  
                  </div>

                
                </form>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>






<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>


</body>
</html>
