package com.booking.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.BoardDAO;
import com.board.model.BoardDAOImpl;
import com.board.model.BoardDTO;
import com.board.model.PageUtil;
import com.booking.model.BookingDAO;
import com.booking.model.BookingDTO;

/**
 * Servlet implementation class BookingSearchAction
 */
@WebServlet("/booking/insert")
public class BookingInsertAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingInsertAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("fileList.jsp");
		rd.forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		BookingDTO booking = new BookingDTO();
		int num = Integer.parseInt(request.getParameter("num"));
		String hotel_name= request.getParameter("hotel_name");
				

		booking.setHotel_name(request.getParameter("hotel_name"));
		booking.setHotel_addr(request.getParameter("hotel_addr"));
		booking.setHotel_repu(request.getParameter("hotel_repu"));
		booking.setHotel_price(request.getParameter("hotel_price"));
		booking.setCheckin(request.getParameter("checkin"));
		booking.setCheckout(request.getParameter("checkout"));
		booking.setRooms_count(Integer.parseInt(request.getParameter("rooms_count")));
		
		
		BookingDAO dao = BookingDAO.getInstance();
		dao.bookingInsert(booking);
		response.sendRedirect("bookingList.jsp");
	}

}
