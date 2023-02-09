package domain;

import java.util.LinkedList;

public class Ciclope extends Gregos{

    public Ciclope(String nome, int idade, float peso){
        super(nome, idade, peso);
    }

    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        int dano = 40;        
        lado2.get(0).receberDano(dano);       
        guerreiro.verificaSeMorreu(guerreiro, lado2);
        return false;
    }

    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila) {
        
    }       
    
    @Override
    public String toString() {
        return "Ciclope";
    }
}
/*
    Ciclope: um gigante de um olho só. Promove um ataque que retira 40 pontos de energia e
    depois “joga” o adversário para o final de sua fila (na prática se for o primeiro a atacar não
    vai permitir que o adversário ataque, se for o segundo, esse efeito não terá qualquer impacto
    no que refere a dano ao adversário).    
*/