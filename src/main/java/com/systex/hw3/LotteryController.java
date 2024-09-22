package com.systex.hw3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Servlet implementation class LotteryController
 */
@WebServlet("/LotteryController.do")
public class LotteryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LotteryController() {
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
		int group = Integer.parseInt(request.getParameter("group"));
	    String excludeNum = request.getParameter("excludeNum");
	    
	    Set<Integer> excludeNumbers = new TreeSet<>();
	    String[] exludeNums = excludeNum.split(" ");
		TreeSet<Integer> excludeNumSet = new TreeSet<>();
		
		for(int i=0; i<exludeNums.length ; i++) {
			excludeNumSet.add(Integer.parseInt(exludeNums[i]));
		}
		
		LotteryService lotteryService = new LotteryService();
        List<List<Integer>> generatedNumbers = lotteryService.getNumbers(group, excludeNumSet);
        
        request.setAttribute("generatedNumbers", generatedNumbers);
        request.getRequestDispatcher("result.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
