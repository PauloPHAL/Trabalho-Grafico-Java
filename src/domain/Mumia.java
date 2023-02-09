package domain;

import domain.MortoVivo;
import domain.Anubita;
import java.util.LinkedList;

public class Mumia extends Egipcios{

    public Mumia(String nome, int idade, float peso) {
        super(nome, idade, peso);
    }

    @Override
    public boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2) {
        int dano = 50;
        lado1.get(0).receberDano(dano);
        if(lado1.get(0).getEnergia() <= 0){
            int idade = lado1.get(0).getIdade();
            float peso = lado1.get(0).getPeso();
            String nome = lado1.get(0).getNome();
            guerreiro = new MortoVivo(nome,idade,peso);
            lado2.add(guerreiro);
        }
        return true;
    }

    @Override
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila){
        if(guerreiro.getEnergia() <= 0){
            Guerreiro soldado = null;
            String nome = guerreiro.getNome();
            this.criarAnubitasVingadores(soldado,fila,nome);
            this.criarAnubitasVingadores(soldado,fila,nome);
            this.criarAnubitasVingadores(soldado,fila,nome);
            this.criarAnubitasVingadores(soldado,fila,nome);
        }
    }
    
    private void criarAnubitasVingadores(Guerreiro soldado, LinkedList<Guerreiro> fila, String nome){
        soldado = new Anubita(nome,0,60);
        fila.add(soldado);
    }
    
    @Override
    public String toString() {
        return "Mumia";
    }
}
/*
    Múmia: são antigos faraós mortos. Possuem ataque de 50 pontos de energia. Quando mata
    um adversário gera um morto vivo e acrescenta em sua fila. Esse morto vivo possui ataque
    de 5 pontos de energia e começa com 100 pontos de energia (assim como a maioria dos
    guerreiros). Quando uma Múmia morre ela invoca 4 Anubitas para vinga-la (sendo
    colocadas no final da fila de seus aliados). O morto-vivo “nasce” com o nome, idade e peso
    do guerreiro adversário morto. Já os Anubitas vingadores “nascem” com o nome da múmia
    morta, idade = 0 e peso = 60.
*/