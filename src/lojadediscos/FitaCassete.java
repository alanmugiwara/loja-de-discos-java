package lojadediscos;

public class FitaCassete extends Discos {
    int duracao;

     public FitaCassete(String titulo, String artista, int ano, String genero, double preco, int duracao) {
         super(titulo, artista, ano, genero, preco);
         this.duracao = duracao;
     }
     
     @Override
     public void exibirDetalhes() {
         super.exibirDetalhes();
         System.out.println("Dura~ao: " + duracao + " min");
     }
}