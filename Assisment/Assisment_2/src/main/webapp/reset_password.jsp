<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Reset Password</title>
</head>
<body>
<div class="container">
    <h2>Reset Password</h2>
    <form action="user" method="post">
        <input type="hidden" name="action" value="resetPassword">
        New Password: <input type="password" name="newPassword" required><br>
        Confirm Password: <input type="password" name="confirmPassword" required><br>
        <button type="submit">Reset Password</button>
    </form>
</div>
</body>
</html>
