<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Change Password</title>
</head>
<body>
<div class="container">
    <h2>Change Password</h2>
    <form action="user" method="post">
        <input type="hidden" name="action" value="changePassword">
        Old Password: <input type="password" name="oldPassword" required><br>
        New Password: <input type="password" name="newPassword" required><br>
        Confirm New Password: <input type="password" name="confirmPassword" required><br>
        <button type="submit">Change Password</button>
    </form>
</div>
</body>
</html>
