import java.util.ArrayList;
import java.util.List;

public class pedido {
    private static int contadorPedidos = 0;  // Para contar os pedidos realizados
    private int idPedido;
    private pizza pizzaEscolhida;
    private String tamanho;
    private String enderecoEntrega;
    private double valorTotal;

    public pedido(pizza pizzaEscolhida, String tamanho, String enderecoEntrega) {
        this.idPedido = ++contadorPedidos;
        this.pizzaEscolhida = pizzaEscolhida;
        this.tamanho = tamanho;
        this.enderecoEntrega = enderecoEntrega;
        this.valorTotal = pizzaEscolhida.getValor(); // Valor inicial do pedido (pode variar com o tamanho)
        if (tamanho.equalsIgnoreCase("Grande")) {
            this.valorTotal += 10; // Supondo que o tamanho grande tenha um acréscimo de 10
        } else if (tamanho.equalsIgnoreCase("Média")) {
            this.valorTotal += 5;  // Supondo que o tamanho médio tenha um acréscimo de 5
        }
    }

    public int getIdPedido() {
        return idPedido;
    }

    public pizza getPizzaEscolhida() {
        return pizzaEscolhida;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void exibirInformacoes() {
        System.out.println("ID do Pedido: " + idPedido);
        pizzaEscolhida.exibirInformacoes();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
        System.out.println("Valor Total: R$ " + valorTotal);
    }

    public void cancelarPedido() {
        System.out.println("Pedido " + idPedido + " cancelado.");
    }
}
