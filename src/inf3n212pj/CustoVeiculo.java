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
public class CustoVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        double custoFabrica, taxaimposto=0.45, taxadistribuidor=0.28, consumidor, imposto, distribuidor;
        
        System.out.println("Calculadora Veicular");
        System.out.println("Qual o Valor de fábrica do seu veículo: ");
        custoFabrica = leia.nextDouble();
        imposto =(custoFabrica * taxaimposto);
        System.out.printf("O Imposto deo veículo é de : %.2f", imposto);
        System.out.println("");
        distribuidor = (custoFabrica * taxadistribuidor);
        System.out.printf("A taxa do distribuidor é de : %.2f", distribuidor);
        System.out.println("");
        consumidor = custoFabrica + distribuidor + imposto;
        System.out.printf("o preço que chega ao consumidor é de : %.2f", consumidor);
        System.out.println("");
        
        
    }
    
}
