<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<style>
/* From Uiverse.io by mi-series */ 
.container {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  text-align: center;
}

.form_area {
  margin-top:7%;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  height: auto;
  width: auto;
  border: 2px solid #264143;
  border-radius: 20px;
  
  background-color: #1a1a1a;
  color: #fff;
  box-shadow: 3px 4px 0px 1px #E99F4C;
}

.title {
  color: #00bfff;
  font-weight: 900;
  font-size: 1.5em;
  margin-top: 20px;
}



.form_group {
  display: flex;
  flex-direction: column;
  align-items: baseline;
  margin: 10px;
}

.form_style {
  outline: none;
  border: 2px solid #264143;
  box-shadow: 3px 4px 0px 1px #E99F4C;
  width: 290px;
  padding: 12px 10px;
  border-radius: 4px;
  font-size: 15px;
}

.form_style:focus, .btn:focus {
  transform: translateY(4px);
  box-shadow: 1px 2px 0px 0px #E99F4C;
}

.btn {
  padding: 15px;
  margin: 25px 0px;
  width: 290px;
  font-size: 15px;
  background: #00bfff;;
  border-radius: 10px;
  font-weight: 800;
  box-shadow: 0px 0px 10px white;
}

.btn:hover {
  opacity: .9;
}

.link {
  font-weight: 800;
  color: #264143;
  padding: 5px;
}
</style>
<body>
<div class="container">
    <div class="form_area">
        <p class="title">Login</p>
        <form action="signin" method="post">
            <div class="form_group">
                <label class="sub_title" for="email">Email</label>
                <input placeholder="Enter your email" id="email" name="email" class="form_style" type="email" required>
            </div>
            <div class="form_group">
                <label class="sub_title" for="password">Password</label>
                <input placeholder="Enter your password" id="password" name="password" class="form_style" type="password" required>
            </div>
            <a class="link" href="forgotpassword.jsp">Forgot Passowrd?</a>
            <div>
                <button class="btn">SIGN IN</button>
                <% String msg=(String)request.getAttribute("msg");
                if(msg!=null)
                {
                	out.println("<p>"+msg+"</p>");
                }%>
                <p>Dont Have an Account? <a class="link" href="register.jsp">Register Here!</a></p>
              </div>
          </form>
      </div>
</div>
</body>
</html>