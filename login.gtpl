<html>
<head>
<title></title>
</head>
<body>
<form action="/login" method="post">
	用户名:<input type="text" name="username"><p>
	密&nbsp&nbsp&nbsp&nbsp碼:<input type="password" name="password"><p>
	<input type="submit" value="登入">
	token:<input type="text" name="token" value="{{.}}">
</form>
</body>
</html>