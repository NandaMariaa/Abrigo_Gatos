public class Vetor {

     //Lista de Atributos
     public  Object [] elementos;
     public int tamanho;
 
     // Vetor
     public Vetor (int capacidade) {

         this.elementos = new Object [capacidade];
         this.tamanho = 0;

     }
 
     //Método para adicionar um Objeto da classe Gato como um novo elemento dentro do Vetor.
     public void adiciona (Object elemento) throws Exception {
 
         this.aumentaCapacidade ();
         this.elementos [this.tamanho] = elemento;
         this.tamanho ++;
 
     }

     //Método para aumentar a capacidade do vetor conforme a clase "adiciona" insere novos objetos nele.
     private void aumentaCapacidade() {
 
        if (this.tamanho == this. elementos.length) {
            Object [] elementosNovos = new Object[this.elementos.length * 2];
             for (int i=0; i < this.elementos.length; i++) {
                elementosNovos [i] = this.elementos [i];
            }
             this.elementos=elementosNovos;
        }

     }

     //Utilização da nota Override para personalizar a exibição dos elementos do vetor.
     @Override
     public String toString () {
 
         StringBuilder s = new StringBuilder ();
         s.append ("");
 
         for (int i = 0; i < this.tamanho -1; i++) {
             s.append(this.elementos[i]);
             s.append("\n");
         }
 
         if (this.tamanho > 0) {
             s.append(this.elementos[this.tamanho - 1]);
         }
 
         s.append("");
         return s.toString();
 
        }
 
     //
     public int tamanho () {
         return this.tamanho;
     }

     //Método para retirar o gato que foi adotado da lista do vetor com base em seu nome.

     public boolean adota (String nome) {

        for (int i = 0; i < tamanho; i++) {

            if (((Gato) elementos[i]).getNome().equals(nome)) {

            for (int j = i; j < tamanho - 1; j++) {
                elementos[j] = elementos[j + 1];
            }

            elementos[tamanho - 1] = null;
            tamanho--;
            
            System.out.println(nome + " ganhou um novo lar!");
            return true; 
         }

        }

        System.out.println("Este nome não consta entre nossos gatos!");
        return false; 
    
    }

    //Método para remover um dos objetos do vetor (Um dos gatos) com base na posição que ele ocupa na lista.
    public void remove (int posicao) throws Exception {
 
        if(posicao >=0 && posicao < tamanho) {

            for ( int i = posicao; i < this.tamanho-1; i ++) {

                this.elementos[i] = this.elementos[i+1];
            }

            this.elementos[tamanho] = null;
            this.tamanho--;

        } else {

            throw new Exception ("Posição Inválida");

        }

     }

     //Buscar as informações de um gato específico com base em seu nome.
     public Object buscaPorNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (((Gato) elementos[i]).getNome().equals(nome)) {
                System.out.println("Gato encontrado: " + elementos[i]);
                return elementos[i];
            }
        }
        System.out.println("Nenhum gato com o nome '" + nome + "' foi encontrado.");
        return null;
    }
    
}
