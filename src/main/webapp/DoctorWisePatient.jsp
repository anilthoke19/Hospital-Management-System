<%@page import="Hospital.service.DoctorServices"%>
<%@page import="Hospital.service.ReceptionistService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Hospital.model.PatientModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<style type="text/css">
@import url(font-awesome/4.0.3/css/font-awesome.css);


.viewD{
overflow-x: auto;
}
td{
	color:red;
}
a{
	text-decoration: none;

}
#h2tag{
color: red;
}

table {
  
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

th a{
text-decoration: none;
}





table{
  border: 1px solid black;
}


.viewD{
overflow-x: auto;
margin-right: 10px;
margin-left: 20%;
}

</style>




</head>
<body>





<%@ include file="DoctorHandle.jsp" %>
<div class="viewD" style="margin-left: 25%; ">

<table>
<%!
List<PatientModel> plist=new ArrayList<PatientModel>();
 %>



<%
  Object name=session.getAttribute("uname");
DoctorServices ds=new DoctorServices();
plist=ds.getDoctorWisePatient(name.toString());
 
 %>


<h2 style="color:blue;">Patient List</h2>

<tr>
<th>ID</th>
<th>NAME</th>

<th>CONTACT</th>
<!-- <th>DIESES</th> -->
<th>APPOINTMENT DATE</th>
<th>Presciption</th>


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
<%-- <th><%=pm.getDiesease() %></th>
 --%>
 <td><%=pm.getRegistrationDate() %></td>
 <td> <h3><a href='Presciption.jsp?pname=<%=pm.getPname()%>&pid=<%=pm.getPid()%>'>Treatement</a></h3>  </th>



</tr>

<%} %>

</table>
















</body>
</html>