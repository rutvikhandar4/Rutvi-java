<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div class="container">
    <h2>Login</h2>
    <form action="user" method="post">
        <input type="hidden" name="action" value="login">
        Email: <input type="text" name="email" required><br>
        Password: <input type="password" name="password" required><br>
        <button type="submit">Login</button>
        <a href="forgot_password.jsp">Forgot Password?</a>
    </form>
    <c:if test="${not empty error}">
        <div class="alert alert-danger">${error}</div>
    </c:if>
</div>
</body>
</html>
