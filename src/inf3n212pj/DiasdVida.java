/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author 181810115
 */
public class DiasdVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int idade, ano=365;
        
        System.out.println("--Calcuco Dias Vividos--");
        System.out.println("Em que ano você nasceu: ");
        idade = 2022 - leia.nextInt();
        System.out.println("Sua idade é de: "+ idade);
        System.out.println("Você tem "+ (idade * ano) + " dias de vida");
        
        LocalDate dtNasc, dtAtual = LocalDate.now();
        
        
    }
    
}
