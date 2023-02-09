package domain;

import java.util.LinkedList;

public class Anubita extends Egipcios{

    public Anubita(String nome, int idade, float peso) {
        super(nome, idade, peso);
    }

    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        int dano = 15;
        int indice = lado1.size();
        indice--;
        lado1.get(0).receberDano(dano);
        lado1.get(indice).receberDano(dano);
        return true;
    }

    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila) {
        
    }

    @Override
    public String toString() {
        return "Anubita";
    }
    
    
}
/*
    Anubita: possui ataque de 15 pontos de energia, mas ataca 2 vezes. Ataca o primeiro
    guerreiro e depois salta para o final da fila e ataca o último guerreiro da fila adversária. 
*/