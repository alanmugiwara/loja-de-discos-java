package lojadediscos;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        CD cd1 = new CD("Nevermind", "Nirvana", 1991, "Grunge", 79.90, 42);
        Vinil vinil1 = new Vinil("The Dark Side of the Moon", "Pink Floyd", 1973, "Rock", 199.90, 12);
        FitaCassete fita1 = new FitaCassete("Thriller", "Michael Jackson", 1982, "Pop", 49.90, 45);

        loja.adicionarDisco(cd1);
        loja.adicionarDisco(vinil1);
        loja.adicionarDisco(fita1);

        loja.listarDiscos();

        Cliente cliente = new Cliente("Alan");
        loja.venderDisco(cliente, cd1);
        cliente.listarCompras();
    }
}
