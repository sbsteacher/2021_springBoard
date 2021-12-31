<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
</head>
<body>
    <h1>회원가입</h1>
    <div>${requestScope.msg}</div>
    <div>
        <form action="/user/join" method="post">
            <div><input type="text" name="uid" placeholder="id"></div>
            <div><input type="password" name="upw" placeholder="password"></div>
            <div><input type="text" name="nm" placeholder="name"></div>
            <div>
                Gender :
                <label>Female <input type="radio" name="gender" value="2" checked></label>
                <label>Male <input type="radio" name="gender" value="1"></label>
            </div>
            <div><input type="submit" value="Join"></div>
        </form>
    </div>
    <div>
        <a href="/user/join">Join</a>
    </div>
</body>
</html>