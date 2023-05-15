<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<style type="text/css">
    .login{
        height: 180px; width: 250px;
        margin: 0;
        padding: 10px;
        border: 1px #CCC solid;
    }

    .login input{
        padding: 5px; margin: 5px;
    }
</style>


<body>
<form method="post" action="/login">
    <div class="login">
        <h2>Log In</h2>
        <input type="text" name="usename" size="30" placeholder="usename">
        <input type="password" name="password" size="30" placeholder="password">
        <input type="submit" value="Sign In">
    </div>
</form>
</body>
</html>