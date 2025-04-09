import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static ArrayList<produto> estoque = new ArrayList<>();

    public static void adicionarProduto(String nome, int codigo, double preco, int quantidade) {
        produto produto = new produto(nome, codigo, preco, quantidade);
        estoque.add(produto);
        System.out.println("Produto adicionado com sucesso.");
    }

    public static void atualizarProduto(int codigo, String nome, double preco, int quantidade) {
        for (produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidadeEmEstoque(quantidade);
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void removerProduto(int codigo) {
        for (produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                estoque.remove(produto);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void gerarRelatorio() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        double valorTotalEstoque = 0.0;
        System.out.println("Relatório de Estoque:");
        for (produto produto : estoque) {
            produto.exibirInformacoes();
            valorTotalEstoque += produto.getPreco() * produto.getQuantidadeEmEstoque();
            System.out.println("-------------------------------");
        }
        System.out.println("Valor Total do Estoque: R$ " + valorTotalEstoque);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Atualizar Produto");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Gerar Relatório de Estoque");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite a quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    adicionarProduto(nome, codigo, preco, quantidade);
                    break;
                case 2:
                    System.out.print("Digite o código do produto que deseja atualizar: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Digite o novo nome do produto: ");
                    nome = scanner.nextLine();
                    System.out.print("Digite o novo preço do produto: ");
                    preco = scanner.nextDouble();
                    System.out.print("Digite a nova quantidade em estoque: ");
                    quantidade = scanner.nextInt();
                    atualizarProduto(codigo, nome, preco, quantidade);
                    break;
                case 3:
                    System.out.print("Digite o código do produto que deseja remover: ");
                    codigo = scanner.nextInt();
                    removerProduto(codigo);
                    break;
                case 4:
                    gerarRelatorio();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
