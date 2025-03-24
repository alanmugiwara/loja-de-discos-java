package lojadediscos;

public class Vinil extends Discos {
    int diametro;

    public Vinil(String titulo, String artista, int ano, String genero, double preco, int diametro) {
        super(titulo, artista, ano, genero, preco);
        this.diametro = diametro;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Diâmetro: " + diametro + " polegadas");
    }
}
