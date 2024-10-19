<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.dao.StudentDAO" %>
<%@ page import="com.bean.Student" %>
<%
    StudentDAO studentDAO = new StudentDAO();
    List<Student> students = studentDAO.viewAllStudents();
%>
<!DOCTYPE html>
<html>
<head>
    <title>View All Students</title>
</head>
<body>
<h1>All Students</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Contact</th>
    </tr>
    <%
        for (Student student : students) {
    %>
    <tr>
        <td><%= student.getId() %></td>
        <td><%= student.getFirstName() %></td>
        <td><%= student.getContactNumber() %></td>
    </tr>
    <%
        }
    %>
</table>
<a href="index.jsp">Back to Main Menu</a>
</body>
</html>
