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
import com.file.model.FileDAO;
import com.file.model.FileDTO;
import com.member.model.MemberDAOImpl;
import com.member.model.MemberVO;

/**
 * Servlet implementation class BookingSearchAction
 */
@WebServlet("/booking/list")
public class BookingListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingListAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8");
		    
			BookingDAO dao = BookingDAO.getInstance();
			ArrayList<BookingDTO> arr = dao.bookingList();
			int count = dao.getCount();
			request.setAttribute("bookingchecks", arr);
			request.setAttribute("count", count);
			
			RequestDispatcher rd = request.getRequestDispatcher("bookingList.jsp");
			rd.forward(request, response);
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
