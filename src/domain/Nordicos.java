package domain;

import domain.Guerreiro;

public abstract class Nordicos extends Guerreiro{

    public Nordicos(String nome, int idade, float peso) {
        super(nome, idade, peso);
    } 
}
/*
    Nórdicos podem ter mais que 100 pontos de energia.
*/