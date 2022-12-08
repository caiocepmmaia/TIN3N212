/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 181810115
 */
public class CalcIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float imc, peso, altura;
        String classificacao;
        
        
        
        System.out.println("--Calculo IMC--");
        System.out.println("Insira o peso: ");
        peso = leia.nextFloat();
        System.out.println("Insira a alura: ");
        altura = leia.nextFloat();
        
        imc = peso / (altura * altura);
        
        System.out.println("O IMC é: " + imc);
        if (imc <= 18.8){
            classificacao ="Abaixo do Peso!";
        }else if(imc <= 24.9){
            classificacao = "Peso ideal!";
        }else if(imc <= 29.9){
            classificacao = "Levemente acima do peso!";
        }else if (imc <= 34.9){
            classificacao = "Obesidade grau I";
        }else if (imc <= 39.9){
            classificacao = "Obesidade grau III";
        }else{
            classificacao = "Obesidade Grau III";
        }
        System.out.println("Sua classificacão é: " + classificacao);

    }

}
