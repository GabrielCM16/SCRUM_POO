import java.util.ArrayList;

class Associado {
    private String nome;
    private int id;
    private String endereco;
    private String telefone;
    private String email;
    private ArrayList<Dependente> dependentes;
    private double pagamentoMensal;
    private String formaPagamento;

    public Associado(String nome, Int id, String endereco, String telefone, String email, double pagamentoMensal, String formaPagamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dependentes = new ArrayList<>();
        this.pagamentoMensal = pagamentoMensal;
        this.formaPagamento = formaPagamento;
    }

    public void adicionarDependente(String nome, int idade) {
        Dependente dependente = new Dependente(nome, idade);
        dependentes.add(dependente);
    }

     public Associado(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    // Getter para endereco
    public String getEndereco() {
        return endereco;
    }

    // Setter para endereco
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getter para telefone
    public String getTelefone() {
        return telefone;
    }

    // Setter para telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Getter para email
    public String getEmail() {
        return email;
    }

    // Setter para email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter para dependentes
    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    // Getter para pagamentoMensal
    public double getPagamentoMensal() {
        return pagamentoMensal;
    }

    // Setter para pagamentoMensal
    public void setPagamentoMensal(double pagamentoMensal) {
        this.pagamentoMensal = pagamentoMensal;
    }

    // Getter para formaPagamento
    public String getFormaPagamento() {
        return formaPagamento;
    }

    // Setter para formaPagamento
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
