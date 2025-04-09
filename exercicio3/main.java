public class main {
    public static void main(String[] args) {
        Banco conta1 = new Banco("313131", "Bernardo Ramos", 1000.0);
        Banco conta2 = new Banco("030303", "Claudia Ramos", 500.0);

        conta1.depositar(999.0);
        conta1.sacar(777.0);
        System.out.println("Saldo da conta de " + conta1.getNomeTitular() + ": R$" + conta1.getSaldo());

        conta2.sacar(700.0);
        conta2.depositar(300.0);
        System.out.println("Saldo da conta de " + conta2.getNomeTitular() + ": R$" + conta2.getSaldo());
    }
}