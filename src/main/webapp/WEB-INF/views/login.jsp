<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="share/header.jsp"></jsp:include>
</head>
<body id="LoginForm">
	<div class="container">
		<h1 class="form-heading">Tshop</h1>
		<div class="login-form">
			<div class="main-div">
				<div class="panel">
					<h2>Đăng nhập</h2>
					<p>Điền email và password</p>
				</div>
				<form id="Login">

					<div class="form-group">


						<input type="email" class="form-control" id="inputEmail"
							placeholder="Email Address">

					</div>

					<div class="form-group">

						<input type="password" class="form-control" id="inputPassword"
							placeholder="Password">

					</div>
					<div class="forgot">
						<a href="register.jsp">Đăng ký</a>
					</div>
					<div class="forgot">
						<a href="reset.html">Quên mật khẩu?</a>
					</div>
					<button type="submit" class="btn btn-primary">Login</button>

				</form>
			</div>

		</div>
	</div>
	</div>


</body>
</html>
