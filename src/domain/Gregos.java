package domain;



public abstract class Gregos extends Guerreiro {

    public Gregos(String nome, int idade, float peso) {
        super(nome, idade, peso);
    }
    /*
        Com a sobre escrita do metodo setEnergia eu garanto que o Guerreiro Grego
        nao vai ultrapassar o limite de 100 pontos de energia.
    */
    @Override
    public void setEnergia(int energia){
        if(energia > 100){
            super.setEnergia(100);
        }else{
            super.setEnergia(energia);
        }
    }   
}
/*
    Todos os guerreiros gregos “nascem” com 100 pontos de energia e nunca ultrapassam esse valor
    (mesmo com técnicas de recuperação).
*/