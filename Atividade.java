import java.util.ArrayList;
import java.util.List;

class Atividade {
    private String nome;
    private String descricao;
    private String faixaEtariaIndicada;
    private List<String> niveisHabilidade;
    private List<Turma> turmas;

    public Atividade(String nome, String descricao, String faixaEtariaIndicada) {
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtariaIndicada = faixaEtariaIndicada;
        this.niveisHabilidade = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para descricao
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter e Setter para faixaEtariaIndicada
    public String getFaixaEtariaIndicada() {
        return faixaEtariaIndicada;
    }

    public void setFaixaEtariaIndicada(String faixaEtariaIndicada) {
        this.faixaEtariaIndicada = faixaEtariaIndicada;
    }

    // Getter e Setter para niveisHabilidade
    public List<String> getNiveisHabilidade() {
        return niveisHabilidade;
    }

    public void adicionarNivelHabilidade(String nivel) {
        this.niveisHabilidade.add(nivel);
    }

    // Getter e Setter para turmas
    public List<Turma> getTurmas() {
        return turmas;
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }
}

