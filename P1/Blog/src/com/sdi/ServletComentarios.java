package com.sdi;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletComentario
 */
@WebServlet("/comentarios")
public class ServletComentarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Comentario> comentarios;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletComentarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ComentariosService cS = new ComentariosService();
		comentarios = cS.getComentarios();
		request.setAttribute("productos", comentarios);
		getServletContext().getRequestDispatcher("/vista-comentarios.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
