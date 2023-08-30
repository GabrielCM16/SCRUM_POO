import java.util.ArrayList;

class PainelAdministrativo { //inicio da classe PainelAdministrativo
    private ArrayList<Associado> associados; //cria um array de associados

    public PainelAdministrativo() {  
        associados = new ArrayList<>();
    }

    //para adicionar um novo associado
    public void adicionarAssociado(Associado associado) {
        associados.add(associado);
    }

    //mostra todos os cadastrados de associados
    public ArrayList<Associado> getAssociados() {
        return associados;
    }

    public void exibirDetalhesAssociados() { //inicio de exibirDetalhesAssociados
        for (Associado associado : associados) {//inicio do for para ver as informações do associado
            System.out.println("Nome: " + associado.getNome());
            System.out.println("Endereço: " + associado.getEndereco());
            System.out.println("Telefone: " + associado.getTelefone());
            System.out.println("Email: " + associado.getEmail());
            System.out.println("Pagamento Mensal: " + associado.getPagamentoMensal());
            System.out.println("Forma de Pagamento: " + associado.getFormaPagamento());

            System.out.println("Dependentes:"); 
            for (Dependente dependente : associado.getDependentes()) {//inicio do for para ver dependentes
                System.out.println("   Nome: " + dependente.getNome()); 
                System.out.println("   Idade: " + dependente.getIdade());
            }//fim do for 

            System.out.println("-----------------------");
        }//fim do for 
    }//inicio de exibirDetalhesAssociados

    //para encontrar associados pelo nome
            public Associado encontrarAssociadoPorNome(String nome) { 
                for (Associado associado : associados) {
                    if (associado.getNome().equalsIgnoreCase(nome)) {
                        return associado; //retorna o associado
                    }
                }
                return null; // Associado não encontrado
            }
} //fim da classe PainelAdministrativo