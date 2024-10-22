<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Forgot Password</title>
</head>
<body>
<div class="container">
    <h2>Forgot Password</h2>
    <form action="user" method="post">
        <input type="hidden" name="action" value="forgotPassword">
        Email: <input type="email" name="email" required><br>
        <button type="submit">Send OTP</button>
    </form>
</div>
</body>
</html>