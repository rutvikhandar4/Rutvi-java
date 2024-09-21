<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Information</title>
</head>
<body>
    <h2>Submitted Student Information</h2>
   
      <form action="SubmitStudent" method="post">
        First Name: <input type="text" name="fname" required><br>
        Last Name: <input type="text" name="lname" required><br>
        Email: <input type="email" name="email" required><br>
        Mobile: <input type="text" name="mobile" required><br>
        Gender: 
        <select name="gender" required>
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
        </select><br>
        Password: <input type="password" name="password" required><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
