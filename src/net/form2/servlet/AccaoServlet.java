package net.form2.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import net.form2.dao.accaoDAO;
import net.form2.entidade.Accao;

@WebServlet("/AccaoServlet")
public class AccaoServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//String acao = request.getParameter("acao");
		String destino = "accaolista.jsp";
		//String mensagem = "";
		List<Accao> lista = new ArrayList<>();
 
 
	//	Accao accao = new Accao();
		accaoDAO dao = new accaoDAO();
 

 
		// Lista todos os registros existente no Banco de Dados
		lista = dao.listar();
		request.setAttribute("listaAccao", lista);
		//request.setAttribute("mensagem", mensagem);

		//O sistema é direcionado para a página 
		//sucesso.jsp Se tudo ocorreu bem
		//erro.jsp se houver algum problema.
		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);
	}
	

}
