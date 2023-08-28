import java.util.ArrayList;

public class Main { //inicio da classe Main
    public static void main(String[] args) { //inicio da classe main
        PainelAdministrativo painel = new PainelAdministrativo(); 

        //adiciona novos associados
        Associado associado1 = new Associado("João", "Rua A", "123456789", "joao@example.com", 100.0, "Cartão");
        associado1.adicionarDependente("Maria", 12);
        associado1.adicionarDependente("Pedro", 8);

        Associado associado2 = new Associado("Ana", "Rua B", "987654321", "ana@example.com", 150.0, "Boleto");
        associado2.adicionarDependente("Luiz", 10);

        painel.adicionarAssociado(associado1);
        painel.adicionarAssociado(associado2);

        painel.exibirDetalhesAssociados();//mostra todos os associados cadastrados
    }//fim da classe main
}//fim da classe Main
