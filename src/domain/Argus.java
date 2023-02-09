package domain;

import java.util.LinkedList;

public class Argus extends Atlantes{

    public Argus(String nome, int idade, float peso){
        super(nome, idade, peso);
        super.setEnergia(60);
    }

    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        int dano = guerreiro.getEnergia();
        lado1.get(0).receberDano(dano);
        return true;
    }

    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila) {
        
    }    
    
    @Override
    public String toString() {
        return "Argus";
    }
}
/*
    Argus: guerreiro atlante monstruoso, ele ataca com uma bolha de ácido que mata o inimigo
    imediatamente independente da energia do inimigo. Argus também é frágil e sua energia
    começa em 60 pontos.
*/