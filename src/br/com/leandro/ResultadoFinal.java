package br.com.leandro;

public class ResultadoFinal {

    public static String resultadoNota(double media){

        if (media >= 7){
            return "Aluno Aprovado";
        } else if (media >=5) {
            return "Aluno de Recuperação";
        } else {
            return "Aluno Reprovado";
        }

    }

}
