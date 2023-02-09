//Paulo Henrique Araújo Loss
//Interface Grafica
package control;

import dao.ManipulaArquivo;
import domain.Guerreiro;
import java.util.LinkedList;
import windows.*;

public class Trabalho{
    
    public static void main(String[] args){
        Guerreiro soldado = null;
        ManipulaArquivo salvamento = new ManipulaArquivo();
        
        LinkedList<Guerreiro> lado1 = new LinkedList();
        LinkedList<Guerreiro> lado2 = new LinkedList();
        
        salvamento.salvarLado1(soldado,lado1);
        salvamento.salvarLado2(soldado,lado2);

        Principal jogo = new Principal(lado1,lado2);
        jogo.setVisible(true);
    } 
}