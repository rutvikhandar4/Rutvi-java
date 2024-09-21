<!DOCTYPE html>
<html>
<head>
    <title>Fetch Data from web.xml</title>
</head>
<body>
    <h1>Fetch Data from web.xml</h1>
    <%
        String name = application.getInitParameter("name");
        String age = application.getInitParameter("age");
    %>
    <p>Name: <%= name %></p>
    <p>Age: <%= age %></p>
</body>
</html>
