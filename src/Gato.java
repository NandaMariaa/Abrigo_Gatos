public class Gato {

    //Atributos
    String nome;
    Double peso;
    int idade;
    String cor;
    String pelagem;
    String raca;

    //Override
    @Override
    public String toString() {
        return "Gato [Nome: " + nome + ", Peso: " + peso +
         ", Idade: " + idade + ", Cor: " + cor + 
         ", Pelagem: " + pelagem + ", Raça: " + raca + "]";
    }

    //Método Construtor
    public Gato(String nome, Double peso, int idade, String cor, 
    String pelagem, String raca) {

        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.cor = cor;
        this.pelagem = pelagem;
        this.raca = raca;

    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

}
