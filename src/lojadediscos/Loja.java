package lojadediscos;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    List<Discos> estoque = new ArrayList<>();

    public void adicionarDisco(Discos disco) {
        estoque.add(disco);
    }
     
    public void listarDiscos() {
        System.out.println("Discos disponíveis na loja:");
        for (Discos disco : estoque) {
            disco.exibirDetalhes();
            System.out.println("----------------------");
        }
    }

    public void venderDisco(Cliente cliente, Discos disco) {
        if (estoque.contains(disco)) {
            cliente.comprarDisco(disco);
            estoque.remove(disco);
        } else {
            System.out.println("Disco não disponível.");
        }
    }
}