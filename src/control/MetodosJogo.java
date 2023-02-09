package control;

import domain.Guerreiro;
import java.util.LinkedList;

public class MetodosJogo {
    
    public void jogo(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        if(!lado1.isEmpty() && !lado2.isEmpty()){
            int aleatorio = (int)((Math.random() * 20) + 1);
            
            Guerreiro guerreiro1 = lado1.get(0);
            Guerreiro guerreiro2 = lado2.get(0);
            
            verQuemAtacaPrimeiro(aleatorio,guerreiro1,guerreiro2,lado1,lado2);
            
            moverGuerreiroDaFilaEVerificar(guerreiro1,lado1);
            moverGuerreiroDaFilaEVerificar(guerreiro2,lado2);          
        } 
        //verificarVencedor(lado1,lado2);
    }    

    private void verQuemAtacaPrimeiro(int ordemDeAtaque, Guerreiro guerreiro1, Guerreiro guerreiro2, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        boolean permissao;
        if(ordemDeAtaque < 10){
            permissao = atacarCadaUm(guerreiro1,guerreiro2,lado1,lado2);
            if(permissao){
                atacarCadaUm(guerreiro2,guerreiro1,lado1,lado2);
            }
        }else{
            atacarCadaUm(guerreiro2,guerreiro1,lado1,lado2);
            atacarCadaUm(guerreiro1,guerreiro2,lado1,lado2);
        }
    }
    
    private boolean atacarCadaUm(Guerreiro guerreiroAtacante, Guerreiro guerreiroSofredor, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        boolean codigo = true;
        if(guerreiroAtacante.getEnergia() > 0){
            codigo = guerreiroAtacante.atacar(guerreiroSofredor,lado1,lado2);
        }
        return codigo;
    }
    
    private void moverGuerreiroDaFilaEVerificar(Guerreiro guerreiro,LinkedList<Guerreiro> fila){      
        fila.remove(guerreiro);
        if(guerreiro.getEnergia() > 0){
            fila.add(guerreiro);
        }
//        if(fila.isEmpty()){
//            System.out.println("ULTIMO GUERREIO MORTO: DADOS");
//            System.out.println();
//            System.out.println("NOME: "+guerreiro.getNome());
//            System.out.println("IDADE: "+guerreiro.getIdade());
//            System.out.println("PESO: "+guerreiro.getPeso());
//            System.out.println();
//        }
        verificarLista(fila);
    }
    
    private void verificarVencedor(LinkedList<Guerreiro> fila1, LinkedList<Guerreiro> fila2){
        if(fila1.isEmpty()){
            System.out.println("Gregos e Nordicos venceram.");
            System.out.println();
            System.out.println("GUERREIO VITORIOSO: DADOS");
            System.out.println("NOME: "+fila1.getLast().getNome());
            System.out.println("IDADE: "+fila1.getLast().getIdade());
            System.out.println("PESO: "+fila1.getLast().getPeso());
        }
        if(fila2.isEmpty()){
            System.out.println("Atlantes e Egipcios venceram.");
            System.out.println();
            System.out.println("GUERREIO VITORIOSO: DADOS");
            System.out.println("NOME: "+fila2.getLast().getNome());
            System.out.println("IDADE: "+fila2.getLast().getIdade());
            System.out.println("PESO: "+fila2.getLast().getPeso()); 
        }
    }
    
    public int[] somarPeso(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        int somas[] = new int[2];
        float peso,soma = 0,soma2 = 0;
        int i = lado1.size();
        int i2 = lado2.size();
        for(int cont = 0; cont < i; cont++){
            peso = lado1.get(cont).getPeso();
            soma += peso;
        }
        somas[0] = (int)soma;
        for(int cont = 0; cont < i2; cont++){
            peso = lado2.get(cont).getPeso();
            soma2 += peso;
        }
        somas[1] = (int)soma2;
        return somas;
    }
    
    public int maisVelho(LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        int i = lado1.size();
        int i2 = lado2.size();
        int y,maiorIdade = -1;
        for(int x = 0; x < i; x++){
            y = lado1.get(x).getIdade();
            if(y > maiorIdade){
                maiorIdade = y;
            }
        } 
        for(int x = 0; x < i2; x++){
            y = lado2.get(x).getIdade();
            if(y > maiorIdade){
                maiorIdade = y;
            }
        }
        return maiorIdade;
    }
    
    private void verificarLista(LinkedList<Guerreiro> fila){
        int tamanho = fila.size() - 1;
        for(int x = 0; tamanho >= 0 && x <= tamanho; x++){
            if(fila.get(x).getEnergia() <= 0){
                Guerreiro soldado = fila.get(x);
                fila.remove(soldado);
                tamanho = fila.size() - 1;
                x = 0;
            }
        }    
    }
}