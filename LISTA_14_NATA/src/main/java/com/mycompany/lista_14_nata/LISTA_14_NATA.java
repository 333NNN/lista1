/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_14_nata;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Nata e Julia
 */
public class LISTA_14_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleat = new Random();
        System.out.println("JOGO DO PAR OU ÍMPAR");
        int opc;
        while(true){
        System.out.println("Escolha a opção que deseja:\n1 - ímpar\n2 - par");
        opc = ler.nextInt();
            if(opc == 1 || opc == 2){
                break;
            }
        }
        System.out.println("Digite um número entre 1 e 10: ");
        int num1 = ler.nextInt();
        System.out.println("O computador está escolhendo um número...");
        int num2 = aleat.nextInt(11);
        System.out.println("Jogador escolheu "+num1+"\nComputador escolheu "+num2);
        
         int soma = num1 + num2;
        System.out.println("A soma dos números é " + soma);
        
        if (soma % 2 == 0) {
            System.out.println("A soma é Par!");
            
            if (opc == 2) {
                System.out.println("Jogador venceu!");
            } 
            else {
                System.out.println("Computador venceu!");
            }
        } 
        else {
            System.out.println("A soma é Ímpar!");
            if (opc == 1) {
                System.out.println("Jogador venceu!");
            } 
            else {
                System.out.println("Computador venceu!");
            }
        }
    }
}
