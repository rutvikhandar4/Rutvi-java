<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script>
        function validateForm() {
            // Add your client-side validation logic here
        }
    </script>
</head>
<body>
<div class="container">
    <h2>Add Student</h2>
    <form action="students" method="post" onsubmit="return validateForm()">
        <input type="text" name="fname" required placeholder="First Name" class="form-control"/>
        <input type="text" name="lname" required placeholder="Last Name" class="form-control"/>
        <input type="email" name="email" required placeholder="Email" class="form-control"/>
        <input type="text" name="mobile" required placeholder="Mobile" class="form-control"/>
        <input type="text" name="gender" required placeholder="Gender" class="form-control"/>
        <input type="password" name="password" required placeholder="Password" class="form-control"/>
        <button type="submit" class="btn btn-primary">Add Student</button>
    </form>
</div>
</body>
</html>
