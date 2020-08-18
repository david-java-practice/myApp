package com.file.action;

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
import com.file.model.FileDAO;
import com.file.model.FileDTO;

/**
 * Servlet implementation class BookingSearchAction
 */
@WebServlet("/file/list")
public class FileListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileListAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8");
		    
		   // System.out.println("list");
		    
			FileDAO dao = FileDAO.getInstance();
			String pageNum = request.getParameter("pageNum")==null?"1":request.getParameter("pageNum");
			String field = request.getParameter("field")==null?"":request.getParameter("field");
			String word = request.getParameter("word")==null?"":request.getParameter("word");
			//String checkin = request.getParameter("checkin")==null?"":request.getParameter("checkin");
			//String roomscount="";
			//if(request.getParameter("rooms_count").equals("")  ||request.getParameter("rooms_count")==null ) {
			//	roomscount ="1";
			//}
			//String roomscount = request.getParameter("rooms_count").equals("") ? "1" :request.getParameter("rooms_count") ;
			//String roomscount ="1";
			//int rooms_count = Integer.parseInt(roomscount);
			int currentPage = Integer.parseInt(pageNum);
			int pageSize = 5;
			int startRow = (currentPage-1)*pageSize+1;
			int endRow = currentPage*pageSize;
			
			int count = dao.fileCount(field, word);
			int totPage = (count/pageSize)+(count%pageSize==0?0:1);
			int pageBlock =3;
			int startPage = ((currentPage-1)/pageBlock)*pageBlock+1;
			int endPage = startPage+pageBlock-1;
			if(endPage > totPage) endPage = totPage;
			
			PageUtil pu = new PageUtil();
			pu.setCurrentPage(currentPage);
			pu.setEndPage(endPage);
			pu.setPageBlock(pageBlock);
			pu.setStartPage(startPage);
			pu.setTotPage(totPage);
			pu.setField(field);
			pu.setWord(word);
			//pu.setCheckin(checkin);
			//pu.setRooms_count(rooms_count);
			
			ArrayList<FileDTO> arr = null;
			
			arr = dao.fileList(field, word, startRow, endRow);
			//System.out.println("arr size : " + arr.size());
			
			int rowNo = count -((currentPage-1)*pageSize);
			request.setAttribute("rowNO", rowNo);
			request.setAttribute("count", count);
			request.setAttribute("board", arr);
			request.setAttribute("pu", pu);
			
			RequestDispatcher rd = request.getRequestDispatcher("fileListResult.jsp");
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
