package br.com.fiap.controllers.cliente;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiapon.model.ClienteModel;


@WebServlet("/cliente-novo")
public class ClienteNovoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ClienteNovoServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/cliente-novo.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Executando o doPost do Servlet Cliente novo");
		
		String nome = request.getParameter("nomeCliente");//Parâmetro vem do item name no input.
		String email = request.getParameter("email");//Parâmetro vem do item name do input.
		
		ClienteModel clienteModel = new ClienteModel();
		clienteModel.setNomeCliente(nome);
		clienteModel.setEmailCliente(email);
		
		//int codigoGerado = codigodaoCliente.insert(clienteModel);
		
		System.out.println(" INSERT INTO CLIENTE VALUES " + nome + "," + email);
		
		clienteModel.setIdCliente(9878985);//Fake
		
		//Importante
		request.setAttribute("clienteModelAttr", clienteModel);
		
		request.getRequestDispatcher("/cliente-novo-sucesso.jsp").forward(request, response);
		
		
		
		
	}

}
