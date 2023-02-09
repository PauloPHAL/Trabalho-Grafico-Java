package domain;

import java.util.LinkedList;

public class MortoVivo extends Mumia{

    public MortoVivo(String nome, int idade, float peso){
        super(nome, idade, peso);
    }

    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        int dano = 5;
        lado1.get(0).receberDano(dano);
        return true;
    }

    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila){
        
    }

    @Override
    public String toString() {
        return "Morto_Vivo";
    }
    
    
}
/*
    Morto-Vivo ataca com com apenas 5 de dano.
*/