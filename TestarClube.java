public class TestarClube {
    public static void main(String[] args) {

        System.out.println("Testando o painel para cadastro de associados:\n");

        // Criando um objeto PainelAdministrativo
        PainelAdministrativo painel = new PainelAdministrativo(); 

        // Adicionando novos associados
        Associado associado1 = new Associado("João", "Rua A", "123456789", "joao@example.com", 100.0, "Cartão");
        associado1.adicionarDependente("Maria", 12);
        associado1.adicionarDependente("Pedro", 8);

        Associado associado2 = new Associado("Ana", "Rua B", "987654321", "ana@example.com", 150.0, "Boleto");
        associado2.adicionarDependente("Luiz", 10);

        // Adicionando os associados ao painel administrativo
        painel.adicionarAssociado(associado1);
        painel.adicionarAssociado(associado2);

        // Exibindo os detalhes dos associados cadastrados
        painel.exibirDetalhesAssociados();

        System.out.println("\n\nTestando a classe funcionarios:\n");

        // Criando um objeto CadastroFuncionarios
        CadastroFuncionarios cadastro = new CadastroFuncionarios();

        // Cadastrando funcionários usando o método cadastrarFuncionario
        cadastro.cadastrarFuncionario("Cleber Machado", "Rua Paraná, 1556", "999556674", "cleberM@gmail.com.", "Analista", 3000.0);
        cadastro.cadastrarFuncionario("Rita Silva", "Rua Ipanema, 366 ", "998553201", "ritaS@gmail.com", "Gerente", 5000.0);

        // Exibindo a lista de funcionários usando o método listarFuncionarios
        cadastro.listarFuncionarios();
    }
}   
