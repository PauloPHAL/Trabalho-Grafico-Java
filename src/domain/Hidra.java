package domain;

import java.util.LinkedList;

public class Hidra extends Gregos{
    
    private int cabecas = 0;
    
    public Hidra(String nome, int idade, float peso) {
        super(nome, idade, peso);
    }

    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        int dano = 50;
        int vida = 10;      
        dano += (this.cabecas * 10);
        lado2.get(0).receberDano(dano);
        if(lado2.get(0).getEnergia() <= 0){
            this.cabecas++;
            if(lado1.get(0).getEnergia() < 100){
                lado1.get(0).recuperarVida(vida);
            }
        }
        guerreiro.verificaSeMorreu(guerreiro, lado2);
        return true;
    }
    
    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila){
        
    }    

    @Override
    public String toString() {
        return "Hidra"; 
    }

        
}
/*
    Hidra: parece um dinossauro aquático, ganha uma cabeça para cada inimigo que mata. Seu
    ataque inicial é de 50 pontos de energia, mas ganha mais 10 pontos de ataque para cada
    cabeça nova gerada, além de mais 10 pontos de recuperação de energia para si mesmo (se a
    hidra não tiver sido atacada ainda, ou seja, tiver os 100 pontos de energia, nada acontece).
*/