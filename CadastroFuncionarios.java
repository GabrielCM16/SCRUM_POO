import java.util.ArrayList;
import java.util.List;

// Classe Funcionario para representar os dados do funcionário
class Funcionario {
    String nome;
    String endereco;
    String telefone;
    String email;
    String cargo;
    double salario;
}

// Classe responsável pelo cadastro de funcionários
class CadastroFuncionarios {
    List<Funcionario> funcionarios = new ArrayList<>();

    // Método para cadastrar um novo funcionário
    void cadastrarFuncionario(String nome, String endereco, String telefone, String email, String cargo, double salario) {
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.nome = nome;
        novoFuncionario.endereco = endereco;
        novoFuncionario.telefone = telefone;
        novoFuncionario.email = email;
        novoFuncionario.cargo = cargo;
        novoFuncionario.salario = salario;

        funcionarios.add(novoFuncionario);
    }

    // Método para exibir todos os funcionários cadastrados
    void listarFuncionarios() {
        System.out.println("Funcionários Cadastrados");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.nome);
            System.out.println("Endereço: " + funcionario.endereco);
            System.out.println("Telefone: " + funcionario.telefone);
            System.out.println("Email: " + funcionario.email);
            System.out.println("Cargo: " + funcionario.cargo);
            System.out.println("Salário: " + funcionario.salario);
            System.out.println("===============================");
        }
    }
}

// Classe principal para testar o cadastro de funcionários
public class Main {
    public static void main(String[] args) {
        CadastroFuncionarios cadastro = new CadastroFuncionarios();

        // Cadastrando funcionários
        cadastro.cadastrarFuncionario("Cleber Machado", "Rua Paraná, 1556", "999556674", "cleberM@gmail.com.", "Analista", 3000.0);
        cadastro.cadastrarFuncionario("Rita Silva", "Rua Ipanema, 366 ", "998553201", "ritaS@gmail.com", "Gerente", 5000.0);

        // Exibindo a lista de funcionários
        cadastro.listarFuncionarios();
    }
}