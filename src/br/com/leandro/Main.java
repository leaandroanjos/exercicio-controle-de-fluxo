package br.com.leandro;

public class Main {

    public static void main(String args[]){

        double media = CalculoMedia.getMedia();

        String resultado = ResultadoFinal.resultadoNota(media);
        System.out.println(resultado);

    }

}
