<%@page import="Hospital.service.AdminService"%>
<%@page import="org.controller.AdminController"%>
<%@page import="javax.swing.text.Document"%>
<%@page import="Hospital.service.ReceptionistService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Hospital.model.PatientModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>





<div class="viewD" style="margin-left: 25%; ">

<table>
<%!
List<PatientModel> plist=new ArrayList<PatientModel>();
AdminService as=new AdminService();
 %>

<%
String name=request.getParameter("n");

plist=as.SearchByNamePatient(name);
 
 %>
<%=name  %>



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

<th><%=pm.getPid() %></th>
<th> <%=pm.getPname() %>  </th>
<th><%=pm.getContact() %></th>
<th><%=pm.getDiesease() %></th>
<th><%=pm.getRegistrationDate() %></th>

<th >  <a  href='DeletePatient?pUser=<%=pm.getPid()%>'>UPDATE </a></th>
<th> <a href='DeletePatient?pUser=<%=pm.getPid()%>'>DELETE</a> </th>


</tr>

<%} %>

</table>

</div>

</div>
</div>










</body>
</html>