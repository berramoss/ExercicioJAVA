import java.util.ArrayList;

public class agenda {
    private ArrayList<contato> contatos;

    // Construtor que inicializa a lista de contatos
    public agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato.getNome());
    }

    public contato buscarContatoPorNome(String nome) {
        for (contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;  // Retorna null se não encontrar o contato
    }

    public boolean removerContato(String nome) {
        contato contato = buscarContatoPorNome(nome);
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato removido: " + nome);
            return true;
        }
        return false;  // Retorna false se o contato não for encontrado
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            for (contato contato : contatos) {
                contato.exibirInformacoes();
                System.out.println("-------------------");
            }
        }
    }
}
