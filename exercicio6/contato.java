public class contato {
    private String nome;
    private String telefone;

    public contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}
