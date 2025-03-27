<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="orgAplicacao.dto.EnderecoDto" %>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <title>Resultado da Busca</title>
</head>
<body>
    <h2>Resultado da Busca</h2>

    <%
        EnderecoDto endereco = (EnderecoDto) request.getAttribute("endereco");
        String erro = (String) request.getAttribute("erro");

        if (erro != null) {
    %>
        <p style="color: red;"><%= erro %></p>
    <%
        } else if (endereco != null) {
    %>
        <p><strong>CEP:</strong> <%= endereco.getCep() %></p>
        <p><strong>Logradouro:</strong> <%= endereco.getLogradouro() %></p>
        <p><strong>Bairro:</strong> <%= endereco.getBairro() %></p>
        <p><strong>Cidade:</strong> <%= endereco.getLocalidade() %></p>
        <p><strong>Estado:</strong> <%= endereco.getUf() %></p>
    <%
        } else {
    %>
        <p>Nenhum dado encontrado.</p>
    <%
        }
    %>

    <br>
    <a href="index.jsp">Fazer nova consulta</a>
</body>
</html>
