import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Tabela.criar();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU CRUD ===");
            System.out.println("1 - Inserir usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Atualizar usuário");
            System.out.println("4 - Deletar usuário");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            int opc = sc.nextInt();
            sc.nextLine(); 

            if (opc == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();

                UsuarioDAO.inserir(nome, idade);
            }

            else if (opc == 2) {
                UsuarioDAO.listar();
            }

            else if (opc == 3) {
                System.out.print("ID do usuário: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Novo nome: ");
                String nome = sc.nextLine();

                System.out.print("Nova idade: ");
                int idade = sc.nextInt();

                UsuarioDAO.atualizar(id, nome, idade);
            }

            else if (opc == 4) {
                System.out.print("ID para deletar: ");
                int id = sc.nextInt();

                UsuarioDAO.deletar(id);
            }

            else if (opc == 5) {
                System.out.println("Encerrando...");
                break;
            }

            else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
