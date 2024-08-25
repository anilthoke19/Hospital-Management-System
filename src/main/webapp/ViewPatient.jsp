<%@page import="Hospital.service.ReceptionistService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Hospital.model.PatientModel"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*" %>
<%@ page import="javax.script.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

.viewD{
overflow-x: auto;
display: linear;
}
td{
	color:red;
}
#h2tag{
color: red;
}

table {
  
  width: 100%;
}
th{
border-bottom: 1px solid black;
}

th, td {
  text-align: left;
  padding: 8px;
  border-bottom: 1px solid black;
  
}

td a{
text-decoration: none;

}

/* tr:nth-child(even) {background-color: #f2f2f2;}
 */
table{
  border: 2px solid black;
}
#form2{
position:absolute;
left:800px;
top: 20px;

}

</style>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script type="text/javascript" >

function jname(name) {
	//var name = document.getElementById("nam").value;
	
	 var xhttp= new XMLHttpRequest();
	
	xhttp.onreadystatechange=function() {
		/* console.log(name); */

		if (this.readyState==4&&this.status==200) {
			document.getElementById("d").innerHTML=this.responseText;
		}
	};
	xhttp.open("GET","ViewPatientByName.jsp?n="+name,true)
	xhttp.send();
	
	
	}

</script>

</head>


<body>



<%@ include file="AdminHandle.jsp" %>


<form id="form2" style="margin-left:200px;"> 
  <input type="text"  value='' id="query" name="nam" onkeyup="jname(this.value)" placeholder="Search...">
  <button  type="submit" onclick="jname()">Search</button>
</form>
<div class="viewD" style="margin-left: 25%; ">

<p id="d"> </p>

<h2 style="color:yellow;">Patient's List</h2>

<table>
<%!
List<PatientModel> plist=new ArrayList<PatientModel>();

 %>


<%
ReceptionistService rs=new ReceptionistService();
plist=rs.viewAllPatient();
 
 %>




<tr>
<th>ID</th>
<th>NAME</th>

<th>CONTACT</th>
<th>DIESES</th>
<th>APPOINTMENT DATE</th>
<th>UPDATE </th>
<th>DELETE </th>
</tr>

<%! PatientModel pm=new PatientModel(); %>


<%
for(int i=0;i<plist.size();i++){
pm=plist.get(i);
%>

<tr>

<td><%=pm.getPid() %></td>
<td> <%=pm.getPname() %>  </td>
<td><%=pm.getContact() %></td>
<td><%=pm.getDiesease() %></td>
<td><%=pm.getRegistrationDate() %></td>

<td >  <a  href='DeletePatient?pUser=<%=pm.getPid()%>'><i class="fa-solid fa-pen-to-square fa-2x"></i> </a></td>
<td> <a href='DeletePatient?pUser=<%=pm.getPid()%>'><i class="fa-solid fa-trash fa-2x"></i></a> </td>

</tr>

<%} %>

</table>


</div>

</div>
</div>





</body>
</html>