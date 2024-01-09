package br.com.leandro;

import java.util.Scanner;

public class CalculoMedia {

    public static double getMedia(){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = s.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = s.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = s.nextDouble();
        System.out.println("Digite a quarta nota");
        double nota4 = s.nextDouble();

        return (nota1 + nota2 + nota3 + nota4)/4;

    }

}
