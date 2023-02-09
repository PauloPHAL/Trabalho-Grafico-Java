package domain;

import java.util.LinkedList;

public class Valquiria extends Nordicos{

    public Valquiria(String nome, int idade, float peso) {
        super(nome, idade, peso);
    }

    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        int dano = 20;
        lado2.get(0).receberDano(dano);
        this.verificarIndice(lado1, 1, 20);
        guerreiro.verificaSeMorreu(guerreiro, lado2);
        return true;
    }

    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila){
        
    }

    private void verificarIndice(LinkedList<Guerreiro> fila, int indice, int vida){
        int ind = fila.size() - 1;
        if(ind > indice ){
            fila.get(indice).recuperarVida(vida);
        }
    }
    
    @Override
    public String toString() {
        return "Valquiria";
    }
}
/*
    Valquíria: é uma espécie de amazona montada num cavalo branco. Possuem poder de cura e
    seu ataque retira 20 pontos de energia. Após atacar, o aliado que estiver após ela, na fila,
    recupera 20 pontos de energia.
*/