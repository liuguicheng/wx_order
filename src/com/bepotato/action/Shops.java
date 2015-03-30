package com.bepotato.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bepotato.dao.impl.ShopImpl;
import com.bepotato.entity.Shop;

/**
 * Servlet implementation class Shops
 */
@WebServlet("/Shops")
public class Shops extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Shops() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		//实例化店铺对象
		ShopImpl shopImpl = new ShopImpl();
		Shop shop = shopImpl.getShop(1);
		String targetURL = "/pages/shop.jsp";
		//存储数据到request里面
		request.setAttribute("shop", shop);
		//转发请求到jsp
		RequestDispatcher rd;
		rd = getServletContext().getRequestDispatcher(targetURL);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
	}

}
