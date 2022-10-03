package controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Ong;
import model.OngDAO;
@SuppressWarnings("serial")
@WebServlet("/home")
public class listaOngs extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//criando lista de contatos uqe irão vir doo banco de dados
		List<Ong> listaONGs = new ArrayList<Ong>(); /*List<Contato> agenda = new ArrayList<Contato>();*/
		
		OngDAO odao = new OngDAO();	/*ContatoDAO cdao = new ContatoDAO();*/  	
		
		//select do banco de dados pegará todos os dados  e guardará em lista ongs
		 listaONGs= odao.getOngs();		
		//vai setar um atributo  na memória do computador chamdao listaDeONGs
		req.setAttribute("listaDeOngs", listaONGs);
		
		//irá redirecionar a agenda dentro de casdatro2
		RequestDispatcher dispatcher = req.getRequestDispatcher("ListaOngs.jsp");
		dispatcher.forward(req, resp);
	}
}
