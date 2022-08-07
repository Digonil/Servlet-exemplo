package br.com.fiap.controllers.cliente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiapon.model.ClienteModel;

@WebServlet("/cliente-listar")
public class ClienteListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ClienteListarServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//List cliente = daoCliente.findByAll();
		
		List<ClienteModel> clientes = new ArrayList<>();
		clientes.add(new ClienteModel(1, "Flávio", "flavio@gmail.com"));
		clientes.add(new ClienteModel(2, "Diego", "diego@gmail.com"));
		clientes.add(new ClienteModel(3, "Paulo", "paulo@gmail.com"));
		clientes.add(new ClienteModel(4, "Marco", "paulo@gmail.com"));
		
		request.setAttribute("listaClientes", clientes);
		
		
		//Recebe o endereço da tela que irá renderizar.
		request.getRequestDispatcher("/cliente-listar.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
