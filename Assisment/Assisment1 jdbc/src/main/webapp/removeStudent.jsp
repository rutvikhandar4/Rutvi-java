<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.dao.StudentDAO" %>
<%@ page import="com.bean.Student" %>
<%
    StudentDAO studentDAO = new StudentDAO();
    String message = "";
    
    if ("POST".equals(request.getMethod())) {
        int id = Integer.parseInt(request.getParameter("id"));
        String confirmation = request.getParameter("confirmation");
        
        if ("Y".equalsIgnoreCase(confirmation)) {
            studentDAO.removeStudent(id);
            message = "Student removed successfully!";
        } else {
            message = "Operation cancelled.";
        }
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Remove Student</title>
</head>
<body>
<h1>Remove Student</h1>
<form method="post" action="removeStudent.jsp">
    Enter Student ID to remove: <input type="text" name="id" required><br>
    Are you sure you want to delete? (Y/N): <input type="text" name="confirmation" required><br>
    <input type="submit" value="Confirm Removal">
</form>
<p><%= message %></p>
<a href="index.jsp">Back to Main Menu</a>
</body>
</html>
