package dao;

import domain.Satiro;
import domain.Prometeano;
import domain.Mumia;
import domain.Argus;
import domain.Anubita;
import domain.Valquiria;
import domain.LoboDeFenris;
import domain.LeaoDeNemeia;
import domain.Hidra;
import domain.Ciclope;
import domain.Guerreiro;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class ManipulaArquivo {
    
    public void salvarLado1(Guerreiro soldado, LinkedList<Guerreiro> lado1){
        try{
            FileInputStream arq = new FileInputStream("Lado11.txt");
            try (Scanner scan = new Scanner(arq)){
                while (scan.hasNext()){
                    int tipo = scan.nextInt();
                    String nome = scan.next();
                    int idade = scan.nextInt();
                    float peso = scan.nextFloat();
                    switch(tipo){
                        case 1:
                            soldado = new Ciclope(nome,idade,peso);
                            lado1.add(soldado);
                            break;
                        case 2:
                            soldado = new LeaoDeNemeia(nome,idade,peso);
                            lado1.add(soldado);
                            break;
                        case 3:
                            soldado = new Hidra(nome,idade,peso);
                            lado1.add(soldado);
                            break;
                        case 4:
                            soldado = new Valquiria(nome,idade,peso);
                            lado1.add(soldado);
                            break;
                        case 5:
                            soldado = new LoboDeFenris(nome,idade,peso);
                            lado1.add(soldado);
                            break;
                        default:
                            break;
                    }
                }
            }
        }catch(FileNotFoundException erro){
            System.out.println("Arquivo nao encontrado!");
        } 
    }
    
    public void salvarLado2(Guerreiro soldado, LinkedList<Guerreiro> lado2){
        try{
            FileInputStream arq = new FileInputStream("Lado22.txt");
            try (Scanner scan = new Scanner(arq)){
                while (scan.hasNext()){
                    int tipo = scan.nextInt();
                    String nome = scan.next();
                    int idade = scan.nextInt();
                    float peso = scan.nextFloat();
                    switch(tipo){
                        case 1:
                            soldado = new Prometeano(nome,idade,peso);
                            lado2.add(soldado);
                            break;
                        case 2:
                            soldado = new Satiro(nome,idade,peso);
                            lado2.add(soldado);
                            break;
                        case 3:
                            soldado = new Argus(nome,idade,peso);
                            lado2.add(soldado);
                            break;
                        case 4:
                            soldado = new Anubita(nome,idade,peso);
                            lado2.add(soldado);
                            break;
                        case 5:
                            soldado = new Mumia(nome,idade,peso);
                            lado2.add(soldado);
                            break;
                        default:
                            break;
                    }
                }
            }
        }catch(FileNotFoundException erro){
            System.out.println("Arquivo nao encontrado!");
        }       
    } 
}