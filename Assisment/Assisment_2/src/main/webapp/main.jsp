<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<div class="container">
    <h2>Welcome, ${user.firstName}!</h2>
    <p>This is your main dashboard.</p>
    <a href="user?action=logout">Logout</a>
    <a href="change_password.jsp">Change Password</a>
</div>
</body>
</html>
