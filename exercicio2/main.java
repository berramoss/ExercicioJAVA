public class main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Player1", "Bernardo Ramos", 1999);
        Livro livro2 = new Livro("Player2", "Bernardo Ramos", 2000);
        Livro livro3 = new Livro("Player3", "Bernardo Ramos", 2001);

        livro1.exibirInfo();
        livro2.exibirInfo();
        livro3.exibirInfo();
    }
}
