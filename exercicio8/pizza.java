import java.util.List;

public class pizza {
    private String nome;
    private double valor;
    private List<String> ingredientes;

    public pizza(String nome, double valor, List<String> ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void exibirInformacoes() {
        System.out.println("Pizza: " + nome);
        System.out.println("Valor: R$ " + valor);
        System.out.print("Ingredientes: ");
        for (String ingrediente : ingredientes) {
            System.out.print(ingrediente + " ");
        }
        System.out.println();
    }
}
