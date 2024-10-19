<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.bean.Student" %>
<%@ page import="com.dao.StudentDAO" %>
<%@ page import="com.util.ValidationUtil" %>
<%
    StudentDAO studentDAO = new StudentDAO();
    String message = "";
    if ("POST".equals(request.getMethod())) {
        int id = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("firstName");
        String contactNumber = request.getParameter("contactNumber");
        
        if (ValidationUtil.isValidName(firstName) && ValidationUtil.isValidContactNumber(contactNumber)) {
            studentDAO.addStudent(new Student(id, firstName, contactNumber));
            message = "Student added successfully!";
        } else {
            message = "Invalid input! Please check your details.";
        }
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<h1>Add Student</h1>
<form method="post" action="addStudent.jsp">
    ID: <input type="text" name="id" required><br>
    First Name: <input type="text" name="firstName" required><br>
    Contact Number: <input type="text" name="contactNumber" required><br>
    <input type="submit" value="Add Student">
</form>
<p><%= message %></p>
<a href="index.jsp">Back to Main Menu</a>
</body>
</html>
