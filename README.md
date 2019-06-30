*Trabalho de Banco de Dados 1*




---------------------------------------
Requisitos para testar as funcionalidades

Ter instalado em seu computador:
-Netbeans
-MySQL server 
-MySQL Workbench (que será usado como exemplo nesse tutorial)
---------------------------------------
Passos para testar as funcionalidades
-Criar um banco de dados com o nome petShop
-Copie o cole em seu banco de dados o seguinte script (sem as aspas)

"use petShop;

create table cliente(
	id integer not null auto_increment,
    cpf varchar(11),
    nome varchar(50),
    telefone varchar(20),
    endereco varchar(50),
    cidade varchar(50),
    estado varchar(20),
    primary key (id)
);"

-Clone ou baixe o projeto do seguinte repositório https://github.com/gustavorafaell/bd1.git
-Abra o porjeto petShop_v1 no MySQL-Workbench 
-No MySQL-Workbench abra PetShop_v1->Pacotes de Códigos-fonte -> conexao -> ConexaoBD.java 
-Em Código-Fonte na Classe ConexaoBD altere os campos com seu usuario e senha do servidor.
	private static final String USER = "seu_usuario";
    	private static final String PASS = "sua_senha";
-Faça a conexão do banco de dados petShop com o MySQL-Workbench usando seu login e senha
-Abra PetShop_v1->Pacotes de Códigos-fonte -> telas e selecione a TelaPrincipal.java e execute usando as teclas Shift+f6
-Na pagina inicial do programa clique em CLIENTE 
---------------------------------------------------
Funcionalidades do sistema

Criar um novo cliente 
-Adicione os dados do Cliente e Clique no botão Salvar. 

Pesquisar um cliente
-Digite o nome do cliente na barra 'nome' e clique no botão com icone de lupa
*todos os cliente com o nome digitado aparecerão na tabela*

Atualizar um cliente
-Selecione um cliente da tabela e atualize os dados nos campos desejados. Clique no botão Atualizar para salvar os dados alterados.

Excluir um cliente 
-selecione um cliente da tabela e clique no botão excluir  


