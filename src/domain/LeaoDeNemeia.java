package domain;

import java.util.LinkedList;

public class LeaoDeNemeia extends Gregos{

    public LeaoDeNemeia(String nome, int idade, float peso) {
        super(nome, idade, peso);
    }

    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        this.gerarDano(lado2, 0, 30);
        this.gerarDano(lado2, 1, 15);
        this.gerarDano(lado2, 2, 5);
        guerreiro.verificaSeMorreu(guerreiro, lado2);
        return true;
    }

    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila){
        
    }
   
    private void gerarDano(LinkedList<Guerreiro> fila, int indice, int dano){
        int ind = fila.size();
        if(ind > indice){
            fila.get(indice).receberDano(dano);
        }
    }
    
    @Override
    public String toString() {
        return "Leao_De_Nemeia";
    }
}
/*
    Leão da Nemeia: um leão muito forte e com rugido poderoso. Seu ataque é um grande
    rugido que não afeta apenas o adversário sendo atacado, mas também seu sucessor e quem
    sucedê-lo. Esse rugido afeta em 30 pontos de energia o adversário atacado, em 15 quem
    estiver atrás dele na fila e em 5 quem estiver na terceira posição. 
*/