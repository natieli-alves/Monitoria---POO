import java.util.Scanner;

class Consulta {
    private String nome;
    private String telefone;
    private String email;
    private String data;
    private String hora;

    public Consulta(String nome, String telefone, String email, String data, String hora) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.data = data;
        this.hora = hora;
    }

    public void alterarDadosPessoais(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void alterarData(String data) { this.data = data; }

    public void alterarHora(String hora) { this.hora = hora; }

    public void exibirConsulta() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
    }
}

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consulta consulta = null;
        int opcao;

        do {
            System.out.println("\n1- Criar Consulta");
            System.out.println("2- Alterar Dados Pessoais");
            System.out.println("3- Alterar Data");
            System.out.println("4- Alterar Hora");
            System.out.println("5- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Telefone: "); String telefone = sc.nextLine();
                    System.out.print("Email: "); String email = sc.nextLine();
                    System.out.print("Data (dd/mm/aaaa): "); String data = sc.nextLine();
                    System.out.print("Hora (hh:mm): "); String hora = sc.nextLine();
                    consulta = new Consulta(nome, telefone, email, data, hora);
                    break;
                case 2:
                    if(consulta != null){
                        System.out.print("Novo nome: "); nome = sc.nextLine();
                        System.out.print("Novo telefone: "); telefone = sc.nextLine();
                        System.out.print("Novo email: "); email = sc.nextLine();
                        consulta.alterarDadosPessoais(nome, telefone, email);
                    }
                    break;
                case 3:
                    if(consulta != null){
                        System.out.print("Nova data (dd/mm/aaaa): "); data = sc.nextLine();
                        consulta.alterarData(data);
                    }
                    break;
                case 4:
                    if(consulta != null){
                        System.out.print("Nova hora (hh:mm): "); hora = sc.nextLine();
                        consulta.alterarHora(hora);
                    }
                    break;
                case 5: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida.");
            }

            if(consulta != null) consulta.exibirConsulta();
        } while(opcao != 5);

        sc.close();
    }
}
