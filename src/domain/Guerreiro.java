package domain;

import java.util.LinkedList;

public abstract class Guerreiro{
    private int energia = 100;
    private final String nome;
    private final int idade;
    private final float peso;
    
    public Guerreiro(String nome, int idade, float peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public void recuperarVida(int valor){
        this.setEnergia(this.energia + valor);
    }
       
    public void receberDano(int valor){
        this.setEnergia(this.energia - valor);
    }

    @Override
    public String toString() {
        return " ";
    }
  
    public abstract void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila);
    
    public abstract boolean atacar(Guerreiro guerreiro, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2);  
}