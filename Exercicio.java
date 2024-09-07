/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leitura//
        Scanner leia = new Scanner  (System.in) ;
        
        /*Entrada de dados*/
        double valor;
        double vdesconto;
        double vjuros;
        
        /*Processamento*/
        
        //Entrada de dados manual//
        System.out.println("**** WINKS!! ****"); //Nome da loja//
        System.out.println("Digite o valor da compra: "); //Mostrar na tela//
        valor = leia.nextInt(); //Fazer a leitura do valor//
        System.out.println("Digite a porcentagem dos desconto: ");
        int pdesconto = leia.nextInt(); //Fazer aa leitura do desconto//
        System.out.println("Digite a porcentagem do juros: ");
        int pjuros = leia.nextInt(); //Fazer a leitura de juros//
        
        vdesconto = valor *pdesconto; //Calculo do desconto//
        vjuros = valor * pjuros; //Calculo de juros//
        
        /*Saída*/
        System.out.println("Compra com desconto " + vdesconto);
        System.out.println("Compra com juros " + vjuros);
    }
    
}
