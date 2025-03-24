package lojadediscos;

public class Discos {
     String titulo;
     String artista;
     int ano;
     String genero;
     double preco;
     
     public Discos(String titulo, String artista, int ano, String genero, double preco) {
         this.titulo = titulo;
         this.artista = artista;
         this.ano = ano;
         this.genero = genero;
         this.preco = preco;         
     }
     
     public void exibirDetalhes() {
         System.out.println("Título: " + titulo);
         System.out.println("Artista: " + artista);
         System.out.println("Ano: " + ano);
         System.out.println("Gênero: " + genero);
         System.out.println("Preço: R$ " + preco );
         
     }
}