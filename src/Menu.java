import java.util.Scanner;

public class Menu {

    static char[] numChar = "1234567890.".toCharArray();

	private static boolean formatoNumerico(String s) {
		char lista[] = s.toCharArray();
		for(char c : lista) {
			for(char n : numChar) {
				if(c == n) {
					return true;
				}
			}
		}
		return false;
	}

	public static void iniciarMenu() throws Exception {
		// 1)
		Scanner input = new Scanner(System.in);
		Vetor vetor = new Vetor(5);
		String estado = "0";
		boolean fechado = false;

		do {
			switch (estado) {

				case "0": // Estado Inicial (0).
					System.out.print("\033[H\033[2J");
					System.out.flush();

					System.out.println("\nMenu de Opções");
					System.out.println(
							"\n1) Cadastrar Novo Gato\n2) Exibir Cadastros\n3) Pesquisar Cadastro\n4) Triagem Adoção \n5) Excluir Cadastro");

					estado = input.nextLine();

                    break;

				case "1": // Incluir Novo Cadastro
					String aux = "";	

					System.out.println("Informe os dados do gato:");

					do {
						System.out.print("Nome: ");
						aux = input.nextLine();
					}
					while(formatoNumerico(aux));
					String nome = aux;
					
					do {
						System.out.print("Peso: ");
						aux = input.nextLine();
					}
					while(!formatoNumerico(aux));
					double peso = Double.parseDouble(aux);
                    

					do {
						System.out.print("Idade: ");
						aux = input.nextLine();
					}
					while(!formatoNumerico(aux));
					int idade = (int) Double.parseDouble(aux);

					do {
						System.out.print("Cor: ");
						aux = input.nextLine();
					}
					while(formatoNumerico(aux));
					String cor = aux;

					do {
						System.out.print("Pelagem: ");
						aux = input.nextLine();
					}
					while(formatoNumerico(aux));
					String pelagem = aux;

					do {
						System.out.print("Raça: ");
						aux = input.nextLine();
					}
					while(formatoNumerico(aux));
					String raca = aux;

					Gato novoGato = new Gato(nome, peso, idade, cor, pelagem, raca);
					vetor.adiciona(novoGato);
					System.out.println("Gato adicionado com sucesso!");
					System.out.println("Aperte 'Enter' para retornar ao menu princial.");
					input.nextLine();
					estado = "0";
					break;

				case "2": // Exibir vetor com todos os gatos cadastrados.
					System.out.println("Cadastros:");
					System.out.println(vetor);
					System.out.println("Aperte 'Enter' para retornar ao menu princial.");
					input.nextLine();
					estado = "0";
					break;

				case "3": // Pesquisar gato por nome.
					System.out.print("Digite o nome do gato para buscar: ");
					String nomeGato = input.nextLine();
					vetor.buscaPorNome(nomeGato);
					System.out.println("Aperte 'Enter' para retornar ao menu princial.");
					input.nextLine();
					estado = "0";
					break;

				case "4": // Retirar gato da Lista (Quando adotado).
					System.out.print("Digite o nome do gato escolhido para a adoção.");
					String gatoAdotado = input.nextLine();
					vetor.adota(gatoAdotado);
					System.out.println("Aperte 'Enter' para retornar ao menu princial.");
					input.nextLine();
					estado = "0";
					break;

                case "5": // Excluir cadastro (Excluir).
                System.out.print("Digite o número do cadastro que deseja excluir: ");
                int posicao = input.nextInt();
                vetor.remove(posicao);
                System.out.println("Aperte 'Enter' para retornar ao menu princial.");
                input.nextLine();
                estado = "0";
                break;

				default: // estado sair
					fechado = true;
					input.close();
					break;

			}
		}

		while (!fechado);

	}
    
}

