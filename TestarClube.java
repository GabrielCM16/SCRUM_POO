public class TestarClube {
    public static void main(String[] args) {

        //instaciando um novo associado
        Associado associado = new Associado("Gabriel Costa", "Endereço", "Telefone", "Email", 300.00, "Boleto Mensal");
        associado.adicionarDependente("Nome 1", 10);
        associado.adicionarDependente("Nome 2", 8);
        associado.adicionarDependente("Nome 3", 17);

    
        System.out.println("Nome do Associado: " + associado.getNome());
        System.out.println("Endereço do Associado: " + associado.getEndereco());
        System.out.println("Telefone do Associado: " + associado.getTelefone());
        System.out.println("Email do Associado: " + associado.getEmail());
        System.out.println("Pagamento Mensal: $" + associado.getPagamentoMensal());

        System.out.println("\n\nDependentes:");
        for (Dependente dependente : associado.getDependentes()) {
            System.out.println("Nome: " + dependente.getNome() + ", Idade: " + dependente.getIdade());
        }
    }
}