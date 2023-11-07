class AtividadeEsportiva {
    private String nome;
    private String horario;
    private String descricao;
    private String instrutor;
    private String nivelHabilidade;

    public AtividadeEsportiva(String nome, String horario, String descricao, String instrutor, String nivelHabilidade) {
        this.nome = nome;
        this.horario = horario;
        this.descricao = descricao;
        this.instrutor = instrutor;
        this.nivelHabilidade = nivelHabilidade;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public String getNivelHabilidade() {
        return nivelHabilidade;
    }

    @Override
    public String toString() {
        return "Atividade: " + nome + "\nHorário: " + horario + "\nDescrição: " + descricao + "\nInstrutor: " + instrutor + "\nNível de Habilidade: " + nivelHabilidade;
    }
}