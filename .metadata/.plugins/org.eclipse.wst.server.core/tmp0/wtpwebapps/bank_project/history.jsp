<%@page import="bank_dto.Bank"%>
<%@page import="bank_dto.TransactionsDto"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
			out.println(transaction.getSenderAccount()+" "+transaction.getRecieverAccount()+" "+transaction.getAmount()+" "+transaction.getDate()+" "+transaction.getTime());
		}
		if(has==false)
		{
			out.println("no transactions made");
		}
	}%>
</body>
</html>