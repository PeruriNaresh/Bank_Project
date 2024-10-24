package bank_project;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bank_dao.UserDao;

@WebServlet("/signin")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try 
		{
			String email=req.getParameter("email");
			int result= UserDao.login(email, req.getParameter("password"));
			if(result==0)
			{
				req.setAttribute("msg", "email does not exist!!");
				RequestDispatcher same=req.getRequestDispatcher("index.jsp");
				same.include(req, resp);
			}
			else if(result==-1)
			{
				req.setAttribute("msg", "password incorrect!!");
				RequestDispatcher same=req.getRequestDispatcher("index.jsp");
				same.include(req, resp);
			}
			else if(result==1)
			{
				HttpSession session=req.getSession();
				session.setAttribute("email", email);
				RequestDispatcher home=req.getRequestDispatcher("https://www.instagram.com/naresh_peruri");
//				home.forward(req, resp);
				resp.sendRedirect("https://www.instagram.com/naresh_peruri");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
