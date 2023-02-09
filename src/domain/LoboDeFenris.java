package domain;

import java.util.LinkedList;

public class LoboDeFenris extends Nordicos{

    public LoboDeFenris(String nome, int idade, float peso) {
        super(nome, idade, peso);
    }

    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        int lobosProximos = 0,x = 1,dano = 40;
        while(lado1.size() > x && lado1.get(x) instanceof LoboDeFenris){
            x++;
            lobosProximos++;
        }         
        dano += (dano*0.2)*lobosProximos;
        lado2.get(0).receberDano(dano);  
        guerreiro.verificaSeMorreu(guerreiro, lado2);
        return true;
    }

    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila){
        
    }   
    
    @Override
    public String toString() {
        return "Lobo_De_Fenris";
    }
}
/*
    Lobo de Fenris: são lobos gigantes ferozes. Seu ataque é de 40 pontos de energia. Entretanto
    seu ataque aumenta em 20% para cada Lobo de Fenris que estiver atrás dele. Ou seja, se
    houverem 2 lobos na sequência na fila, o Lobo atual ganha mais 16 pontos de ataque (8 para
    cada lobo) totalizando 56 pontos de ataque. 
*/