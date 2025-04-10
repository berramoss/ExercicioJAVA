import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    private static List<pizza> menuPizzas = new ArrayList<>();
    private static List<pedido> pedidosRealizados = new ArrayList<>();

    public static void main(String[] args) {
        inicializarMenuPizzas();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Pizzaria - Sistema de Pedidos ---");
            System.out.println("1 - Fazer Pedido");
            System.out.println("2 - Adicionar Nova Pizza");
            System.out.println("3 - Relatório de Pedidos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    fazerPedido(scanner);
                    break;
                case 2:
                    adicionarNovaPizza(scanner);
                    break;
                case 3:
                    relatorioPedidos();
                    break;
                case 4:
                    System.out.println("Saindo... Obrigado por usar o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void inicializarMenuPizzas() {
        menuPizzas.add(new pizza("Camarão", 90.00, Arrays.asList("Molho de tomate", "Mussarela", "Camarão")));
        menuPizzas.add(new pizza("Calabresa", 40.00, Arrays.asList("Molho de tomate", "Mussarela", "Calabresa")));
        menuPizzas.add(new pizza("Frango com Catupiry", 40.00, Arrays.asList("Molho de tomate", "Frango desfiado", "Catupiry")));
    }

    private static void fazerPedido(Scanner scanner) {
        System.out.println("\nEscolha uma pizza:");
        for (int i = 0; i < menuPizzas.size(); i++) {
            System.out.print(i + 1 + " - ");
            menuPizzas.get(i).exibirInformacoes();
        }

        System.out.print("Escolha o número da pizza: ");
        int opcaoPizza = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer
        pizza pizzaEscolhida = menuPizzas.get(opcaoPizza - 1);

        System.out.print("Escolha o tamanho (Pequena, Média, Grande): ");
        String tamanho = scanner.nextLine();

        System.out.print("Digite o endereço de entrega: ");
        String endereco = scanner.nextLine();

        pedido pedido = new pedido(pizzaEscolhida, tamanho, endereco);
        pedidosRealizados.add(pedido);

        System.out.println("\nPedido realizado com sucesso!");
        pedido.exibirInformacoes();
    }

    private static void adicionarNovaPizza(Scanner scanner) {
        System.out.print("Digite o nome da nova pizza: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor da nova pizza: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer

        System.out.println("Digite os ingredientes da pizza (separados por vírgula): ");
        String ingredientesStr = scanner.nextLine();
        List<String> ingredientes = Arrays.asList(ingredientesStr.split(","));

        pizza novaPizza = new pizza(nome, valor, ingredientes);
        menuPizzas.add(novaPizza);

        System.out.println("Nova pizza adicionada ao menu!");
    }
    1
    private static void relatorioPedidos() {
        if (pedidosRealizados.isEmpty()) {
            System.out.println("Nenhum pedido realizado.");
        } else {
            double valorTotalPedidos = 0;
            System.out.println("\n--- Relatório de Pedidos ---");
            for (pedido pedido : pedidosRealizados) {
                pedido.exibirInformacoes();
                valorTotalPedidos += pedido.getValorTotal();
                System.out.println("-------------------------------");
            }
            double mediaPedidos = valorTotalPedidos / pedidosRealizados.size();
            System.out.println("Número total de pedidos: " + pedidosRealizados.size());
            System.out.println("Valor total dos pedidos: R$ " + valorTotalPedidos);
            System.out.println("Média de valor dos pedidos: R$ " + mediaPedidos);
        }
    }
}
