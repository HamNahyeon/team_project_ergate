package edu.kh.semi.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.kh.semi.member.model.service.MyPostService;
import edu.kh.semi.member.model.vo.ComMember;
import edu.kh.semi.member.model.vo.MemberBoard;
import edu.kh.semi.member.model.vo.MyPostPagination;
import edu.kh.semi.member.model.vo.Question;

@WebServlet("/com_myPost/*")
public class ComMyPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = uri.substring( (contextPath + "/com_myPost/").length());
		
		String path = null;
		RequestDispatcher view = null;
		
		try {
			
			MyPostService service = new MyPostService();
			
			HttpSession session = request.getSession();
			
			ComMember comLoginMember = (ComMember)session.getAttribute("comLoginMember");
			
			int memberNo = comLoginMember.getMemberNo();
			
			System.out.println(memberNo);
			// 현재 페이지
			int cp = request.getParameter("cp") == null ? 1 : Integer.parseInt(request.getParameter("cp"));
			
			// 게시글 목록 조회
			if(command.equals("list")) {
				
				MyPostPagination pagination = service.getPagination(cp,memberNo);
				List<MemberBoard> boardList = service.boardList(pagination,memberNo);
				
				pagination.setMemberNo(memberNo);
				
				session.setAttribute("pagination", pagination);
				session.setAttribute("boardList", boardList);
				
				path = "/WEB-INF/views/member/com_myPost.jsp";
				view = request.getRequestDispatcher(path);
				view.forward(request, response);
				
			// 게시글 상세 조회
			}else if(command.equals("view")) {
				
				int boardNo = Integer.parseInt(request.getParameter("boardNo"));
				
				path = "/WEB-INF/views/detail?" + boardNo; 
				 view = request.getRequestDispatcher(path); 
				 view.forward(request, response);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
