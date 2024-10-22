<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sign Up</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>User Sign Up</h2>
    <form action="user" method="post" onsubmit="return validateForm()">
        <input type="hidden" name="action" value="register">
        First Name: <input type="text" name="firstName" required><br>
        Last Name: <input type="text" name="lastName" required><br>
        Email: <input type="email" name="email" required><br>
        Mobile: <input type="text" name="mobile" required><br>
        Address: <textarea name="address" required></textarea><br>
        Gender: <input type="radio" name="gender" value="Male" required> Male
                <input type="radio" name="gender" value="Female"> Female<br>
        Password: <input type="password" name="password" required><br>
        Confirm Password: <input type="password" name="confirmPassword" required><br>
        <button type="submit">Submit</button>
    </form>
    <script>
        function validateForm() {
            const password = document.querySelector('input[name="password"]').value;
            const confirmPassword = document.querySelector('input[name="confirmPassword"]').value;
            if (password !== confirmPassword) {
                alert("Passwords do not match!");
                return false;
            }
            return true;
        }
    </script>
</div>
</body>
</html>
