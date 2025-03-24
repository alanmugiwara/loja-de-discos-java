package lojadediscos;

public class CD extends Discos {
    int duracao;

     public CD(String titulo, String artista, int ano, String genero, double preco, int duracao) {
         super(titulo, artista, ano, genero, preco);
         this.duracao = duracao;
     }
     
     @Override
     public void exibirDetalhes() {
         super.exibirDetalhes();
         System.out.println("Duração: " + duracao + " min");
     }
}







