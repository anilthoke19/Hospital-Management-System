<%@page import="java.util.ArrayList"%>
<%@page import="Hospital.model.DoctorModel"%>
<%@page import="java.util.List"%>
<%@page import="Hospital.repository.AdminRepository"%>
<%@page import="Hospital.service.AdminService"%>
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
th{
	color:maroon;
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

tr:nth-child(even) {background-color: #f2f2f2;

}


table,th{
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


<%@ include file="AdminHandle.jsp" %>
<div class="viewD" >

<table>
<%List<DoctorModel> dList=new ArrayList<DoctorModel>();
 %>


<%
AdminService as=new AdminService();
dList= as.viewAllDoctor(); %>



<h2 id="h2tag">Doctor's </h2>


<th>ID</th>
<th>NAME</th>
<th>SPECIALITY</th>
<th>FEES</th>
<th>CONTACT</th>
<th>USERNAME </th>
<th>PASSWORD </th>
<th>UPDATE </th>
<th>DELETE </th>

<% DoctorModel dm=new DoctorModel(); %>


<%
for(int i=0;i<dList.size();i++)
{
dm=dList.get(i);
%>

<tr>
<th> <%=dm.getDid()  %>  </th>
<th>  <%=dm.getDname() %> </th>
<th><%=dm.getSpecialization() %>  </th>
<th> <%=dm.getFees() %> </th>
<th> <%=dm.getContact() %> </th>
<th> <%=dm.getUsername() %> </th>
<th> <%=dm.getPassword() %> </th>
<th >  <a  href="DeleteDoctor?dUser=<%= dm.getDid() %>">DELETE</i></a></th>
<th> <a href='update?dUser=<%= dm.getDid() %>'>UPDATE </a> </th>



</tr>

<%} %>

</table>

</div>

</div>
</div>
</div>
</div>

</body>
</html>