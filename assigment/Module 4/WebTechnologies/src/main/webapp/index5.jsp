<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>Student List</h1>
     <table border="1">
          <tr>
               <th>ID</th>
               <th>Name</th>
               <th>Email</th>
               <th>Mobile</th>
          </tr>
          <c:forEach var="row" items="${result.rows}">
               <tr>
                    <td><c:out value="${row.name}"/></td>
                    <td><c:out value="${row.email}"/></td>
                    <td><c:out value="${row.mobile}"/></td>
               </tr>
          </c:forEach>
          <sql:query var="students" dataSource="${DatabaseConnection.getConnection()}">
    SELECT * FROM students;
</sql:query>
     </table>
</body>
</html>