package lojadediscos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Discos> dicosComprados = new ArrayList<>();

     public Cliente(String nome) {
         this.nome = nome;
     }
     
    public void comprarDisco(Discos disco) {
        dicosComprados.add(disco);
        System.out.println(nome + " comprou o disco: " + disco.titulo);
    }

    public void listarCompras() {
        System.out.println("Discos comprados por " + nome + ":");
        for (Discos disco : dicosComprados) {
            disco.exibirDetalhes();
            System.out.println("----------------------");
        }
    }
}