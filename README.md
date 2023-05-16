## :memo: Projeto API de Pagamentos
API para pagamento, estorno e consulta de transações.

## :books: Funcionalidades (Testadas no Postman)
* <b>Pagamento</b>: Entrada JSON padrão da transação, retorna JSON com status AUTORIZADO.

	POST localhost:8080/transacoes/pagamento

	Json Teste:

	{
    	"cartao": "2222",
   	 "descricao": {
        	"valor": 111.22,
        	"dataHora": "2023-05-16T20:30:00",
        	"estabelecimento":"estab 222"
    		},
   	 "formaPagamento":{
        "tipo": "AVISTA",
       "parcelas": 5
    		}
	}


* <b>Estorno</b>: Consulta pelo ID e retorna JSON da transação com status modificado para CALCELADO.

	PUT localhost:8080/transacoes/estorno/1
	
* <b>Consulta por ID</b>: Consulta pelo ID e retorna JSON da transação.

	GET localhost:8080/transacoes/consulta/1

* <b>Consultar Todos</b>: Consulta exibindo listagem de todas as transções.

	GET localhost:8080/transacoes/consulta

## :wrench: Tecnologias utilizadas
* IDE - Spring Toos Suite 4
* Postman para testar o consumo das APIs
* Maven - Para fazer gerenciamento de dependencias 
* JPA - Server Container Tomcat
* Dependencias Principais:
	- Spring web
	- Banco de dados em memoria: h2 database
	- spring Data JPA
	- DevTools

## :rocket: Rodando o projeto
Para rodar o repositório é necessário clonar o mesmo, dar o seguinte comando para iniciar o projeto:

git clone https://github.com/weltonoliveiralima/ToolsChallenge

./mvnw spring-boot:run

ou

mvn spring-boot:run


## :handshake: Desenvolvedor
 * Welton Lima

