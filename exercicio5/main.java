public class main {
    public static void main(String[] args) {
        carro carro1 = new carro("Mercedes", "Meca cereja", 2020, "BER-3131");

        carro1.exibirInformacoes();

        carro1.acelerar(150);

        carro1.frear(70);

        carro1.exibirInformacoes();

        carro1.frear(40);

        carro1.exibirInformacoes();
    }
}
