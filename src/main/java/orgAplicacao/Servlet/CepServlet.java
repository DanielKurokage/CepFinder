package orgAplicacao.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import orgAplicacao.dto.EnderecoDto;
import orgAplicacao.servico.ApiServico;

@WebServlet("/buscarEndereco") // Define a URL do Servlet
public class CepServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String cep = request.getParameter("cep"); // Obtém o CEP do usuário
        
        if (cep != null && !cep.isEmpty()) {
            try {
                ApiServico apiServico = new ApiServico();
                EnderecoDto endereco = apiServico.getEndereco(cep); // Chama a API ViaCEP

                request.setAttribute("endereco", endereco); // Adiciona o resultado no request
            } catch (Exception e) {
                request.setAttribute("erro", "Erro ao buscar o endereço: " + e.getMessage());
            }
        }

        // Encaminha para a página JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }
}
