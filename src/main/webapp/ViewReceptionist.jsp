<%@page import="Hospital.model.ReceptionistModel"%>
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

.viewD{
overflow-x: auto;
margin-right: 10px;
margin-left: 20%;
}
th{
	color:maroon;
}
#h2tag{
color: red;
}

table {
  
  align-self:center;
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


</style>

</head>
<body>


<%@ include file="AdminHandle.jsp" %>

<div class="viewD"  >

<table>
<%!
List<ReceptionistModel> rlist=new ArrayList<ReceptionistModel>();
 %>


<%
AdminService as2=new AdminService();
 rlist=as2.viewAllReceptionist();
 
 %>


<h2 style="color: red;">Receptionist List</h2>

<tr>
<th>ID</th>
<th>NAME</th>

<th>CONTACT</th>
<th>USERNAME </th>
<th>PASSWORD </th>
<th>UPDATE </th>
<th>DELETE </th>
</tr>

<%! ReceptionistModel rm=new ReceptionistModel(); %>


<%
for(int i=0;i<rlist.size();i++){
rm=rlist.get(i);

%>

<tr>

<th><%=rm.getrecpId() %></th>
<th><%=rm.getrecpName()%></th>
<th><%=rm.getrecpContact() %></th>
<th><%=rm.getUsername() %></th>
<th><%=rm.getRecptpassword() %></th>
 
<th >  <a  href='UpdateReceptionist?rUser=<%=rm.getrecpId()%>'>UPDATE </a></th>
<th> <a href='DeleteReceptionist?rUser=<%=rm.getrecpId()%>'>DELETE</a> </th>


</tr>

<%} %>

</table>

</div>



</div>
</div>

</body>
</html>