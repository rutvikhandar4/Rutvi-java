<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.dao.StudentDAO" %>
<%@ page import="com.bean.Student" %>
<%
    StudentDAO studentDAO = new StudentDAO();
    Student student = null;
    String message = "";

    if ("POST".equals(request.getMethod())) {
        int id = Integer.parseInt(request.getParameter("id"));
        student = studentDAO.viewSpecificStudent(id);
        if (student == null) {
            message = "User does not exist.";
        }
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>View Specific Student</title>
</head>
<body>
<h1>View Specific Student</h1>
<form method="post" action="viewSpecificStudent.jsp">
    Enter Student ID: <input type="text" name="id" required><br>
    <input type="submit" value="View Student">
</form>
<p><%= message %></p>
<%
    if (student != null) {
%>
    <h2>Student Details:</h2>
    <p><%= student.toString() %></p>
<%
    }
%>
<a href="index.jsp">Back to Main Menu</a>
</body>
</html>
