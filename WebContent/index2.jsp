<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="files.DummyDB1"%>
    <%@page import="java.io.BufferedReader"%>
    <%@page import="java.io.FileReader"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%System.out.println("You need to know about this place !! wow"); %>
Location : <%=request.getParameter("location") %>

<%
String location = request.getParameter("location");
//String show = DummyDB1.give2(request.getParameter("location"));


String[] str_array=null;
System.out.println("on give 2");
//List<String> files = Files.readAllLines(Paths.get("Film_Locations_in_San_Francisco.csv"));
String fileName = DummyDB1.class.getResource("Film_Locations_in_San_Francisco.csv").getFile();
BufferedReader iofile = new BufferedReader(new FileReader(fileName));	
String str = null;
String finalstring=null;
int i = 0;

%> 

<table style="width:100%">
  <tr>
    <th>Title</th>
    <th>Release Year</th>		
    <th>Locations</th>
        <th>Fun Facts</th>
        <th>Production Company</th>
        <th>Distributor</th>
        <th>Director</th>
        <th>Writer</th>
        <th>Actor1</th>
        <th>Actor2</th>
        <th>Actor3</th>
    
  </tr>


<%

while ((str=iofile.readLine())!=null)
{
//count++;
//System.out.println("Value of count ="+count);
str_array = str.split(",");
//System.out.println(str_array[2]);
//finalstring+=str_array[2];
if (location.equalsIgnoreCase(str_array[2]))
{
System.out.println("Match found");
//System.out.println(str_array);

%><tr><%
for(i=0;i<10;i++)
{
	
	%>
	
    <td><%=str_array[i] %></td>
    	
	<%
	
	}%>
 </tr>
<%
}

}




%>
</table>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDjyuktdmUWSVLvQwaS_YLG7dAWW6CAhZ4&signed_in=true&libraries=places&callback=initMap"async defer></script>
<br>

</body>
</html>