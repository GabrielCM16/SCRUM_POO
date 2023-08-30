// Classe que representa os dados de um funcionário
class Funcionario {
    // Atributos privados que armazenam informações do funcionário
    private String nome;      // Nome do funcionário
    private String endereco;  // Endereço do funcionário
    private String telefone;  // Número de telefone do funcionário
    private String email;     // Endereço de email do funcionário
    private String cargo;     // Cargo do funcionário
    private double salario;   // Salário do funcionário

    // Método setter para atribuir um novo nome ao funcionário
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método setter para atribuir um novo endereço ao funcionário
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método setter para atribuir um novo número de telefone ao funcionário
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método setter para atribuir um novo endereço de email ao funcionário
    public void setEmail(String email) {
        this.email = email;
    }

    // Método setter para atribuir um novo cargo ao funcionário
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método setter para atribuir um novo salário ao funcionário
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método getter para obter o nome do funcionário
    public String getNome() {
        return nome;
    }

    // Método getter para obter o endereço do funcionário
    public String getEndereco() {
        return endereco;
    }

    // Método getter para obter o número de telefone do funcionário
    public String getTelefone() {
        return telefone;
    }

    // Método getter para obter o endereço de email do funcionário
    public String getEmail() {
        return email;
    }

    // Método getter para obter o cargo do funcionário
    public String getCargo() {
        return cargo;
    }

    // Método getter para obter o salário do funcionário
    public double getSalario() {
        return salario;
    }
}
