import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado;

            switch (operacao) {
                case '+':
                    resultado = calculadora.soma(num1, num2);
                    break;
                case '-':
                    resultado = calculadora.subtracao(num1, num2);
                    break;
                case '*':
                    resultado = calculadora.multiplicacao(num1, num2);
                    break;
                case '/':
                    resultado = calculadora.divisao(num1, num2);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    scanner.close();
                    return;
            }

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
