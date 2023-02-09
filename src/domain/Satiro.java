package domain;

import java.util.LinkedList;

public class Satiro extends Atlantes{

    public Satiro(String nome, int idade, float peso) {
        super(nome, idade, peso);
    }

    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        int dano = 5;
        int ind = lado1.size() - 1 ;
        for(int x = 0; x <= ind; x++){
            lado1.get(x).receberDano(dano);
        }
        return true;
    }

    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila){
        
    }
    
    @Override
    public String toString() {
        return "Satiro";
    }
}
/*
    Sátiro: são guerreiros que utilizam lanças para atacar a distância. Quando atacam tiram
    apenas 5 pontos de energia, entretanto acertam todos os guerreiros da fila adversária. 
*/