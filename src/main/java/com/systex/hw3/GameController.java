package com.systex.hw3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class GameController
 */
public class GameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		System.out.println("表單提交成功！");
	    System.out.println("輸入的數字: " + request.getParameter("number"));
		HttpSession	 session = request.getSession();
        GuessGame game = (GuessGame) session.getAttribute("game");
        
        if (game == null) {
            game = new GuessGame(10,3);
            session.setAttribute("game", game);
        }
   

        int number = Integer.parseInt(request.getParameter("number"));

        if (game.guess(number)) {
        	request.getRequestDispatcher("game/youWin.jsp").forward(request, response);
        }else if(game.getRemains() <= 0) {
        	request.getRequestDispatcher("game/youLose.jsp").forward(request, response);
        }else {
        	request.getRequestDispatcher("game/guess.jsp").forward(request, response);
        }

        /*if (game.guess(number)) {
            session.removeAttribute("game");
            response.sendRedirect("youWin.jsp");
        } else if (game.getRemains() <= 0) {
            session.removeAttribute("game");
            response.sendRedirect("youLost.jsp");
        } else {
            response.sendRedirect("guess.jsp");
        }*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
