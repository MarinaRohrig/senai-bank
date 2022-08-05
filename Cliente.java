public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(String nome, String profissao) {
        this.nome = nome;
        this.profissao = profissao;
    }

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
