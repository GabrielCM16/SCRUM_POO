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

        //vamos agora criar novas atividades começando por turmas
        System.out.println("\n\nTestando a classe Turmas e Atividades:\n");

        Turma turma = painel.novaTurma("Terça-Feira", "15:00", "16:30");
        Atividade atividade = new Atividade("Natação",
         "Natação com professore especializados",
         "10-18");

         atividade.adicionarNivelHabilidade("Sem nivel especifico");

         Turma outraTurma = new Turma("Quarta-Feira", "14:00", "15:30");
              Turma outraTurma2 = new Turma("Sexta-Feira", "16:00", "17:30");

// Criar outra instância de Atividade
Atividade outraAtividade = new Atividade("Yoga",
    "Yoga para relaxamento",
    "18+");
       outraAtividade.adicionarNivelHabilidade("Habilidades basicas em flexibilidade");

         atividade.adicionarTurma(turma);
         outraAtividade.adicionarTurma(outraTurma);
           outraAtividade.adicionarTurma(outraTurma2);

         painel.cadastrarAtividade(atividade);
        painel.cadastrarAtividade(outraAtividade);

        painel.mostrarAtividades();
    }
}   
