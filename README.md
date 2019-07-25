# itau-api-transfers

Requisitos para desenvolvimento

# Pré-requisito
- Docker versão mais atual
- Maven versão mais atual
- Git client versão mais atual
- SOAP UI versão mais atual
- IDE para Desenvolvimento: STS, Eclipse ou IntelliJ
- Criar um diretório na estação chamado workpsace que conterá os códigos-fonte
- Editar o arquivo /etc/hosts e adicionar os seguintes IP's
	
	127.0.0.1       itau-core
	127.0.0.1       itau-api-gateway
	127.0.0.1       itau-api-accounts
	127.0.0.1       itau-api-transfers

# Baixar o código-fonte

- Via linha de comando, entrar no diretório que conterá os códigos-fonte e executar os comandos abaixo, caso esteja vazio:

	git init
	git clone https://github.com/natokratos/itau-api-transfers.git

- Abrir a IDE de desenvolvimento, importar como projeto Maven existente

# Compilar a aplicação

- Via linha de comando, mudar para o diretório itau-api-transfers dentro do diretório de códigos-fonte
  
	cd $HOME/workspace/itau-api-transfers
  
- Via linha de comando, executar o comando abaixo para gerar as classes, executar os testes e gerar o relatório de cobertura:

	mvn clean install test  

- A partir daqui basta usar a IDE de desenvolvimento para construir o código, compilar e testar a aplicação

# Relatório de Cobertura

- O relatório estará disponível dentro deste mesmo diretório em target/site/jacoco/index.html, deve ser acessado por um browser de sua escolha

# Rodando a aplicação local
  
- Para rodar basta executar a aplicação pelo IDE de desenvolvimento

# Rodando a aplicação no Docker

- A aplicação já deve estar compilada para que funcione no Docker, veja na seção "Compilar a Aplicação"

- Via linha de comando, mudar para o diretório src/main/docker

- Executar o comando a seguir. Caso apareça um erro dizendo que já existe, apenas ignore e continue no item abaixo:

	docker network create itau-micro-net

- Executar o comando a seguir:

	docker build -t itau-api-transfers . 
	
- Veja se aparece alguma imagem com o nome itau-api-transfers executando este comando:

	docker images
	
- Caso apareça execute o comando a seguir para criar o container pela primeira vez, não é necessário executar novamente:

	docker run -d -p 9300:9300 --name itau-api-transfers --network itau-micro-net itau-api-transfers
	
- Parar o container:

	docker stop itau-api-transfers
	
- Iniciar o container:

	docker start itau-api-transfers

# Atualizar a Aplicação no Docker

- Para atualizar a aplicação no docker, primeiro pare o container:

	docker stop itau-api-transfers

- Compile a aplicação novamente conforme descrito na seção "Compilar a Aplicação"

- Via linha de comando mude para o diretório src/main/docker e execute o comando a seguir:

	docker cp itau-api-transfers*.jar itau-api-transfers:/root/itau-api-transfers.jar
	
- Reinicie o container:
	
	docker start itau-api-transfers

# Transfers - Micro Serviço REST

- Para acessar o Micro Serviço REST Transfers, digite o seguinte endereço pelo browser:

	http://localhost:9300/transfers/send

- Para testar os métodos use o SOAP UI. Abra a ferramenta, crie um novo projeto e aponte para o endereço acima

- A ferramenta já irá criar objetos para testar todos os métodos disponíveis no serviço

- Selecione um dos métodos, troque o method para POST, preencha as informações necessárias e execute
- Você pode salvar os casos de teste criados numa suíte maior para executar sempre que precisar
