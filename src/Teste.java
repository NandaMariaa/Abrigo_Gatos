public class Teste {
    public static void main(String[] args) throws Exception {

        // exemplo 1
        Vetor vetor = new Vetor (5);

        Gato g1 = new Gato("Maggie", 4.4, 10, "Preta/Amarelo", "Curta", "ND");
        Gato g2 = new Gato("Antonia", 1.2, 0, "Cinza", "Curta", "ND");
        Gato g3 = new Gato("Betania", 3.2, 3, "Laranja", "Média", "ND");
        Gato g4 = new Gato("Pantera", 4.0, 15, "Preta", "Curta", "ND");
        Gato g5 = new Gato("Oswaldo", 5.0, 3, "Cinza/Preto", "Curta", "Siames");
        Gato g6 = new Gato("Beatriz", 2.5, 0, "Branco/Preto", "Curta", "ND");

        vetor.adiciona(g1);
        vetor.adiciona(g2);
        vetor.adiciona(g3);
        vetor.adiciona(g4);
        vetor.adiciona(g5);
        vetor.adiciona(g6);

        //exemplo 2
        //System.out.println(vetor);

        //vetor.adota("Maggie");
        //System.out.println(vetor);

        //vetor.adota("Nina");

        //exemplo 3
        //vetor.buscaPorNome("Pantera");
        //vetor.buscaPorNome("Nina");

        //exemplo 4
        System.out.println(vetor);

    }
}
