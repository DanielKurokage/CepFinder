<h1>Cep Finder</h1>
Esta aplicação foi desenvolvida com o objetivo de praticar o consumo de APIs em Java. O projeto consiste em um buscador de CEPs que consome uma API online para consultar, filtrar e exibir informações sobre um determinado endereço.

<h1>Aplicação na Prática</h1>
A aplicação roda totalmente no Terminal da IDE, Necessitando alterar manualmente o CEP no Codigo: 
<img width="1421" height="341" alt="Cep Finder" src="https://github.com/user-attachments/assets/158d8aa2-aab0-4d9f-a16e-f05447ec3f77" />

<h1>Especificações Tecnicas</h1>
A aplicação foi desenvolvida em Java, seguindo o padrão de arquitetura Model-View-Controller (MVC). A camada Model representa a estrutura dos dados retornados pela API de CEP, como logradouro, bairro, cidade e estado. 
A camada Controller é responsável por consumir a API, enviando requisições HTTP e processando as respostas. No projeto, o Controller utiliza classes como HttpURLConnection ou HttpClient para se conectar à API, receber os dados em formato JSON e convertê-los para objetos do Model. A camada View consiste no terminal da IDE, onde os dados processados são exibidos diretamente ao usuário.
A aplicação é executada totalmente no back-end, sem interface gráfica ou banco de dados, permitindo compreender de forma prática o fluxo de dados entre Java e APIs externas.

<h1>Como Executar o Projeto</h1>
Para testar o software imediatamente, siga esses passo:
<h3>Execução Direta (Via IDE): </h3>

- Baixe ou clone este repositório.

- Abra o projeto em sua IDE (IntelliJ, Eclipse, etc.).
  
- Localize a classe principal (Main.java).

- Altere o CEP que está na linha comentada e clique em Run (Executar).

<h1>Autor</h1>

<h3>Daniel Carvalho</h3>

- Github: https://github.com/DanielKurokage
  
- LinkdIn: https://www.linkedin.com/in/danielcarvalhodev36

<h3>Lucas Marques</h3>

- Github: https://github.com/Loghzin
  
- LinkdIn: https://www.linkedin.com/in/lucas-marques-b0aba1298
