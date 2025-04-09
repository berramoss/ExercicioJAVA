public class main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Bernardo", 1500, 3);

        jogador1.exibirInformacoes();

        jogador1.aumentarPontuacao(500);
        jogador1.subirNivel();

        System.out.println("\nApós atualizações:");
        jogador1.exibirInformacoes();
    }
}
