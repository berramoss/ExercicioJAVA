public class main {
    public static void main(String[] args) {
        agenda minhaAgenda = new agenda();

        contato contato1 = new contato("Bernardo Ramos", "3131-3131");
        contato contato2 = new contato("Claudia Ramos", "9898-9898");
        contato contato3 = new contato("Gustavo Ramos", "6969-6969");

        minhaAgenda.adicionarContato(contato1);
        minhaAgenda.adicionarContato(contato2);
        minhaAgenda.adicionarContato(contato3);

        System.out.println("Todos os contatos na agenda:");
        minhaAgenda.exibirContatos();

        System.out.println("\nBuscando por contato com o nome 'Claudia Ramos':");
        contato contatoBuscado = minhaAgenda.buscarContatoPorNome("Claudia Ramos");
        if (contatoBuscado != null) {
            contatoBuscado.exibirInformacoes();
        } else {
            System.out.println("Contato não encontrado.");
        }

        System.out.println("\nRemovendo o contato 'Gustavo Ramos':");
        minhaAgenda.removerContato("Gustavo Ramos");

        System.out.println("\nContatos após remoção:");
        minhaAgenda.exibirContatos();
    }
}
