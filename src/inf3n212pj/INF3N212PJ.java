/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;
//AREA DE IMPORT QUE EQUIVALE AO INCLUA NO PORTUGOL

import java.util.Scanner;


/**
 *
 * @author 181810115
 */
public class INF3N212PJ {// EQUIVALE AO PROGRAMA DO PORTUGOL
//EQUIVALE A AREA DE DECLARAÇÃO DE VARIAVEL GLOBAL

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//EQUIVALE A FUNÇÃO INICIO NO PORTUGOL
        // TODO code application logic here
        //EQUIVALE A AREA DE DECLARAÇÃO VARIAVEL LOCAL
        Scanner leia = new Scanner(System.in);//EQUIVALE AO LEIA DO PORTUGOL
        float nota1, nota2, nota3, nota4, media;
        
        System.out.println("--Notas Escolares--");//EQUIVALE AO ESCREVA DO PORTUGOL
        System.out.print("Informe a 1ª nota: ");
        nota1 = leia.nextFloat();
        System.out.print("Informe a 2ª nota: ");
        nota2 = leia.nextFloat();
        System.out.print("Informe a 3ª nota: ");
        nota3 = leia.nextFloat();
        System.out.print("Informe a 4ª nota: ");
        nota4 = leia.nextFloat();
        
        media =(nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Sua média é: " + media);
        System.out.printf("Sua média é: %.2f", media);
        System.out.println("");
        
    }

}
