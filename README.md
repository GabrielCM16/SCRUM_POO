# SCRUM_POO

## Gabriel 
Como funcionário do clube, gostaria de
cadastrar no sistema o associado do clube
recreativo, fornecendo informações
pessoais como nome, endereço, telefone,
e-mail, dependentes e dados de
pagamento.
### Como foi realizada
ideia se baseia em desenvolver uma classe para representar as informações a serem cadastradas. com uma classe que representa a pessoa com atributos como “nome”, “endereço”, “telefone” e “email”, “dependentes” etc, que são fundamentais para manter um registro organizado das atividades do clube separadamente. A intenção é que essa classe seja estruturada para armazenar esses detalhes pessoais. para depois ser facil de usar conectado ao banco de dados.

a segunda etapa seria, colocar na classe para controlar as operações (CRUD) relacionadas às informações cadastradas. Essa classe permitirá criar, ler, atualizar e excluir registros. O objetivo é ter as informações do sistema a “disposicao”, com metodos set e get.

##  Carla e Beth
Como funcionário do clube, gostaria de
ter acesso a um painel administrativo
onde posso visualizar e atualizar os
detalhes dos associados e dependentes,
como informações de contato, status de
pagamento e atividades esportivas
registradas.
### Como foi realizado
Para essa tarefa precisamos criar as classes principais para modelar os associados, atividades e etc no sistema, também precisamos realizar a definição dos atributos das classes

## Camila
Como gerente, gostaria de poder
cadastrar novos funcionários no sistema,
fornecendo informações como nome,
endereço, telefone, e-mail, cargo e
salário.
### Como foi realizado
Para fazer essa tarefa, primeiramente preciso criar as classes: funcionário; que irá ter os atributos básicos, clube; que pode ter a função de gerenciar os funcionários cadastrados e a classe principal que contém o método main que irá criar as instancias da classe clube e funcionário e utilizar os métodos implementados para cadastrar e gerenciar funcionários

## Helo
Como gerente, gostaria de poder definir
permissões e níveis de acesso para cada
funcionário cadastrado, garantindo que
apenas as informações relevantes
estejam disponíveis para cada cargo.
### Como foi realizado
Segundo a necessidade do gerente, o ideal é separar os usuários em superclasses (como exemplo: ‘classe cliente’, ‘classe gerente’) e deixar visível para cada um apenas o’que lhe interessa. Para isso, seria necessário o uso de herança, seria inicialmente criada uma superclasse ‘funcionário’ (para separá-los dos clientes), depois seriam criadas subclasses com as funções de cada funcionário, por exemplo: ‘classe recepcionista’, ‘classe gerente’, etc.
