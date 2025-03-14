import java.util.Scanner;

public class Menu {

    public static void iniciarMenu() throws Exception
    {
  
        //1)
        Scanner input = new Scanner(System.in);
        Vetor vetor = new Vetor (5);
        String estado = "0";
        boolean fechado = false;

        do {
            switch (estado) {

                case "0":   //Estado Inicial (0).
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("\nMenu de Opções");
                    System.out.println("\n1) Cadastrar Novo Gato\n2) Exibir Cadastros\n3) Pesquisar Cadastro\n4) Triagem Adoção");

                    estado = input.nextLine();
                    break;
                
                //2
                case "1": //Incluir Novo Cadastro
                
                    System.out.println("Informe os dados do gato:");
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Peso: ");
                    double peso = input.nextDouble();
                    System.out.print("Idade: ");
                    int idade = input.nextInt();
                    System.out.print("Cor: ");
                    String cor = input.nextLine();
                    System.out.print("Pelagem: ");
                    String pelagem = input.nextLine();
                    System.out.print("Raça: ");
                    String raca = input.nextLine();

                    Gato novoGato = new Gato(nome, peso, idade, cor, pelagem, raca);
                    vetor.adiciona(novoGato);
                    System.out.println("Gato adicionado com sucesso!");
                    System.out.println("Aperte 'Enter' para retornar ao menu princial.");
                    input.nextLine();
                    estado = "0";
                    break;

                //3)
                case "2": //Exibir vetor com todos os gatos cadastrados.
                    System.out.println("Cadastros:");
                    System.out.println(vetor);
                    System.out.println("Aperte 'Enter' para retornar ao menu princial.");
                    input.nextLine();
                    estado = "0";
                    break;
                
                //4)
                case "3": //Pesquisar gato por nome.
                    System.out.print("Digite o nome do gato para buscar: ");
                    String nomeGato = input.nextLine();
                    vetor.buscaPorNome(nomeGato);
                    System.out.println("Aperte 'Enter' para retornar ao menu princial.");
                    input.nextLine();
                    estado = "0";
                    break;

                //5
                case "4": //Retirar gato da Lista (Quando adotado).
                    System.out.print("Digite o nome do gato escolhido para a adoção.");
                    String gatoAdotado = input.nextLine();
                    vetor.adota(gatoAdotado);
                    System.out.println("Aperte 'Enter' para retornar ao menu princial.");
                    input.nextLine();
                    estado = "0";
                    break;

                //5)
                default: //estado sair
                    fechado = true;
                    input.close();
                    break;

            }
        }
        
        while(!fechado);

    }
    
}

