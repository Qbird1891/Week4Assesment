package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CookieShop;
import Model.CookieType;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cookieType = request.getParameter("Type");
		
		CookieShop cookieShop = new CookieShop();
		CookieType c = CookieType.valueOf(cookieType);
		
		List cookieBrands = CookieShop.getAvailibleBrands(c);
		request.setAttribute("cookie brands", cookieBrands);
		RequestDispatcher view = request.getRequestDispatcher("result1.jsp");
		view.forward(request, response);
	}

}
