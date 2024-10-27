<%@page import="com.mysql.cj.xdevapi.Table"%>
<%@page import="bank_dto.Bank"%>
<%@page import="bank_dto.TransactionsDto"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	table
	{
		border:1px solid black;
		border-collapse:collapse;
	}
	tr
	{
		border:1px solid black;
		border-collapse:collapse;
	}
	td	
	{
		padding:1vh 1vw;
		border:1px solid black;
		border-collapse:collapse;
	}
	* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: 'Arial', sans-serif;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.container {
    background-color: white;
    padding: 20px 40px;
    border-radius: 10px;
    box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
    max-width: 400px;
    width: 100%;
    display:inline
}

h1 {
    text-align: center;
    margin-bottom: 20px;
    color: #4e54c8;
}

form {
    display: flex;
    flex-direction: column;
}

</style>
<title>Insert title here</title>
</head>
<body>
	<form>	
	<div class="container">
	<h1 id="title">Transaction History</h1>
	<%LinkedList<TransactionsDto> rs=(LinkedList<TransactionsDto>)session.getAttribute("transactions"); 
	Bank bank =(Bank)session.getAttribute("bank");
	if(bank==null || bank.getAccountnumber()==0)
	{
		out.println("no account attached");
	}
	else if(rs!=null)
	{
		boolean has=false;
		for(TransactionsDto transaction:rs)
		{
			has=true;
			break;
		}
		if(has==true)
		{
		%>
		<table>
			<tr>
				<td>Sender account number</td>
				<td>reciver account number</td>
				<td>amount</td>
				<td>cr/dr</td>
				<td>date</td>
				<td>time</td>
			</tr>
		<%
		for(TransactionsDto transaction:rs)
		{
		%>
			<tr style="border">
				<td><%=transaction.getSenderAccount()%></td>
				<td><%=transaction.getRecieverAccount()%></td>
				<td><%=transaction.getAmount()%></td>
				<%if(bank.getAccountnumber()==transaction.getSenderAccount())
				{out.println("<td>dr</td>");
				}
				else
				{out.println("<td>cr</td>");
				}%>
				<td><%=transaction.getDate()%></td>
				<td><%=transaction.getTime()%></td>
			</tr>
		<%}%>
		</table>
		<%
		}
		else if(has==false)
		{
			out.println("no transactions made");
		}
	}%>
	</div>
	</form>
</body>
</html>