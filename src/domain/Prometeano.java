package domain;

import java.util.LinkedList;

public class Prometeano extends Atlantes{
    
    private int energiaOriginal = 100;
    
    public Prometeano(String nome, int idade, float peso) {
        super(nome, idade, peso);
    }
    
    public Prometeano(String nome, int idade, float peso, int novaVida) {
        super(nome, idade, peso);
        super.setEnergia(novaVida);
        this.energiaOriginal = novaVida;
    }
    
    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        int dano = 10;
        lado1.get(0).receberDano(dano);
        return true;
    }

    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila){
        if(guerreiro.getEnergia() <= 0){
            int idade = guerreiro.getIdade();
            int novaVida = (this.energiaOriginal / 2);
            float peso = guerreiro.getPeso();
            String nome = guerreiro.getNome();
            if(this.energiaOriginal != 1){
                guerreiro = new Prometeano(nome,idade,peso,novaVida);               
                fila.add(guerreiro);
                guerreiro = new Prometeano(nome,idade,peso,novaVida);
                fila.add(guerreiro);
            }
        }
    } 
    
    @Override
    public String toString() {
        return "Prometeano";
    }
}
/*
    Prometeano: são guerreiros de barro que se dividem em 2 quando morrem (cada um com
    50% da energia original do prometeano e ambos colocados no final da fila do prometeano
    original). Quando um prometeano chega a 1 ponto de energia, quando morre ele
    efetivamente é eliminado. O ataque de um prometeano é de 10 unidades de energia. Peso e
    idade passam do prometado morto para seus descendentes. 
*/