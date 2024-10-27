<%@page import="bank_dto.Bank"%>
<%@page import="bank_dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<style>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: 'Arial', sans-serif;
    background: linear-gradient(to right, #ff7e5f, #feb47b);
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 100vh;
}

header {
    position: absolute;
    top: 0;
    width: 100%;
    background-color: #333;
    display: flex;
    justify-content: space-between; /* Space between navbar and welcome text */
    align-items: center; /* Center align items vertically */
    padding: 10px; /* Added padding to header */
}

.welcome-text {
    color: white; /* Color of welcome text */
    font-size: 18px; /* Font size of welcome text */
    margin-left: 20px; /* Space on the left of welcome text */
}

.navbar {
    display: flex;
    justify-content: flex-end; /* Aligns items to the right */
}

.nav-item {
    position: relative;
    margin-left: 20px; /* Adds space between nav items */
}

.nav-btn {
    background-color: #ff7e5f;
    border: none;
    color: white;
    padding: 10px 15px;
    font-size: 16px;
    cursor: pointer;
    border-radius: 5px;
    transition: background 0.3s;
}

.nav-btn:hover {
    background-color: #feb47b;
}

.nav-links {
    display: none;
    flex-direction: column;
    background-color: #444;
    position: absolute;
    top: 40px;
    padding: 10px;
    border-radius: 5px;
    width: 250px; /* Increased width for dropdown */
}

.nav-item:hover .nav-links {
    display: flex;
}

.nav-links button {
    background-color: #ff7e5f;
    border: none;
    color: white;
    padding: 10px;
    margin: 5px 0;
    width: 100%;
    border-radius: 5px;
    cursor: pointer;
    transition: background 0.3s;
}

.nav-links button:hover {
    background-color: #feb47b;
}

/* Styles for password input */
.password-input 
{
    display: none; /* Hide by default */
}

.nav-item:hover .password-input {
	height:20vh;
    display: flex; /* Show password input on hover */
    transform: translateX(-7vw);
}

.password-input label {
    color: white; /* Label color */
    margin-bottom: 5px; /* Space below label */
}

.password-input input {
    padding: 10px;
    border-radius: 5px;
    border: none;
    outline: none;
    width: 100%; /* Full width */
}

.main {
    text-align: center;
    margin-top: 100px;
}

h1 {
    color: white;
    font-size: 48px;
    margin-bottom: 40px;
}

.search-bar {
    display: flex;
    justify-content: center;
    margin-bottom: 30px;
}

.search-bar input {
    padding: 10px;
    width: 300px;
    border-radius: 5px 0 0 5px;
    border: none;
    outline: none;
}

.search-bar button {
    padding: 10px;
    border: none;
    background-color: #ff7e5f;
    color: white;
    border-radius: 0 5px 5px 0;
    cursor: pointer;
    transition: background 0.3s;
}

.search-bar button:hover {
    background-color: #feb47b;
}

.create-account button {
    padding: 15px 30px;
    background-color: #ff7e5f;
    color: white;
    border: none;
    border-radius: 5px;
    font-size: 18px;
    cursor: pointer;
    transition: background 0.3s;
}

.create-account button:hover {
    background-color: #feb47b;
}
#trans
{
	transform:translate(-19vw,-2vh);
	display:none;
}
#trans:hover
{
	display:inline;
}
#transout:hover+#trans
{
	display:inline;
}

</style>
<body>
<header>
	<%User user=(User)session.getAttribute("user");
	String name=user.getName();%>
    <div class="welcome-text">Welcome <%=name%></div> <!-- Added welcome text -->
    <div class="navbar">
	    <div class="search-bar nav-items">
	        <input type="text" placeholder="Search...">
	        <button>Search</button>
	    </div>
        <div class="nav-item">
            <button class="nav-btn">☰ Menu</button>
            <div class="nav-links">
                <a href="Profile.jsp"><button>Profile</button></a>
                <a href="Update.jsp"><button>Update</button></a>
                <a href="Delete.jsp"><button>Delete</button></a>
                <a href="index.jsp"><button onclick="fun()">Logout</button></a>
            </div>
        </div>
        <div class="nav-item">
        
            <button class="nav-btn">Account</button>
            <div class="nav-links">
                <a href="accountdetails.jsp"><button>Account Details</button></a>
                <button id="transout">Transaction</button>
                <div id="trans" class="nav-links">
                	<a href="Transaction.jsp"><button>To Other Account</button></a>
                	<button>To Self Account</button>
                </div>
                <a href="history"><button>History</button></a>
            </div>
        </div>
        <div class="nav-item">
            <button class="nav-btn">Balance Enquiry</button> <!-- New Balance Enquiry button -->
            <div class="nav-links password-input">
            	<%String pass= ((User)session.getAttribute("user")).getPassword();
            	Bank bank=(Bank)session.getAttribute("bank");
            	int balance=bank.getBalance();
            	long account=bank.getAccountnumber();
            	if(account>0)
            	{%>
	                <label for="password" id="lab">Enter the Password:</label>
		            <input type="password" id="password" name="pass" placeholder="Password">
		            <h2 id="bal" style="display:none;color:white">₹ <%=balance%>. INR</h2>
		            <button id="sub" onclick="fun1(<%=pass%>)">Submit</button>
	            <%}
	            else
	            {
	            	out.println("<h3 style='color:white'>no account to fetch balance from</h3>");
	            }%>
            </div>
        </div>
    </div>
</header>

<div class="main">
    <h1>Welcome to Our Homepage</h1>
    <%String status= (String)session.getAttribute("status");
		if(status!="created")
		{
	%>
    <div class="create-account">
        <a href="bankaccount.jsp"><button>Create Account</button></a>
    </div>
    <% }%>
</div>
<script>
	function fun1(pass)
	{
		var password=document.getElementById("password");
		var sub=document.getElementById("sub");
		var bal=document.getElementById("bal");
		var lab=document.getElementById("lab");
		if(pass==password.value)
		{
			lab.style.display="none";
			password.style.display="none";
			bal.style.display="block";
			sub.style.display="none";
		}
		else
		{
			password.value="";
			password.setAttribute("placeholder","invalid password");
			password.style.border="1px solid red";
		}
	}
</script>
</body>
</html>
