package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Ong;
import model.OngDAO;

@WebServlet("/excluir")
public class RemoverOng extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		OngDAO odao = new OngDAO();
		
		odao.removeBYId(id);

		resp.sendRedirect("sucessoExcluir.jsp");
	}

}
