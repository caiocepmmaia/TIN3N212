/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 181810115
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        System.out.println("Array está vazio?" + nomes.isEmpty());
        System.out.println("Quantos registros: " + nomes.size());
        
        nomes.add("Jair");
        System.out.println("Depois de add valor");
        System.out.println("Array está vazio?" + nomes.isEmpty());
        System.out.println("Quantos registros: " + nomes.size());
        
        System.out.println("Digite um nome: ");
        nomes.add(leia.next());
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        
        nomes.add(0, "Fernadão");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        
        nomes.add(3, "Kleber, O Chicletinho");
        System.out.println("Depois de add valor");
        System.out.println("Quantos Registros: " + nomes.size());
        System.out.println("Nome: " + nomes.toString());
        
        System.out.println("Index de Jair " + nomes.indexOf("Jair"));
        nomes.remove("Jair");
        System.out.println("Resultado depois de remover Jair");
        System.out.println("Quantos Registros: " + nomes.size());
        System.out.println("Nome: " + nomes.toString());
        
        nomes.add("D'alessandro");
        nomes.add("Rafael Sóbis");
        nomes.add("Carlitos");
        nomes.add("Uh Fabiano");
        System.out.println("Depois de add valor");
        System.out.println("Quantos Registros: " + nomes.size());
        System.out.println("Nome: " + nomes.toString());
        
        Collections.sort(nomes);
        System.out.println("Array Ordenado");
        System.out.println("Nomes" + nomes.toString());
    }
    
}
