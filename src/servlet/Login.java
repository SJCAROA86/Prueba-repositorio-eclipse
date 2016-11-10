package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Simulando usuario y contraseña
		
		String miusuario = new String("Draco");
		String mipw = new String("Celtibero");

		String usuario = request.getParameter("usuario");
		String pw = request.getParameter("password");
		String boton_enviar =request.getParameter("enviar");
		
		if(boton_enviar != null){
			if ((usuario.equals(miusuario) && (pw.equals(mipw)))) {
				response.sendRedirect("html/inicio.html");
			} else {
				response.sendRedirect("Index.html");
			}
		}
			else{
				response.sendRedirect("html/registro.html");
			}
		}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
