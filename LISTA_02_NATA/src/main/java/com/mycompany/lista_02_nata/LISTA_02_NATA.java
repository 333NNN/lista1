/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_02_nata;

/**
 *
 * @author ncunha
 */
import java.util.Random;
import java.util.Scanner;

public class LISTA_02_NATA {

    public static void main(String[] args) {
        Random aleat = new Random();
        Scanner ler = new Scanner(System.in);
        int numAleat = aleat.nextInt(100)+1;
        
        System.out.println("Vamos brincar de advinhação!");
        System.out.println("O sistema gerou um número entre 1 e 100, e você deverá acertar qual é.");
        int numEscolha = 0;
        while (numAleat != numEscolha){
            System.out.print("Digite um número entre 1 e 100: ");
            numEscolha = ler.nextInt();
            if (numAleat == numEscolha) {
                System.out.println("Você acertou! Parabéns, o número escolhido pelo sistema foi "+ numAleat);
            break;
            }
            else if(numEscolha == 0){
                System.out.println(numAleat);
            }
            else if (numEscolha < numAleat - 20) {
                System.out.println("Está muito frio... O número gerado é muito maior");
            }
            else if (numEscolha < numAleat - 10) {
                System.out.println("Está frio... o número gerado é maior");
            } 
            else if (numEscolha < numAleat - 5) {
                System.out.println("Está esquentando... o número gerado é pouco maior");
            }
            else if (numEscolha < numAleat - 4 || numEscolha < numAleat - 3 || numEscolha < numAleat - 2 || numEscolha < numAleat){
                System.out.println("Está MUITO quente! O número é pouco maior"); 
            }
            else if (numEscolha > numAleat + 20) {
                System.out.println("Está muito frio... O número gerado é muito menor");
            }
            else if (numEscolha > numAleat + 10) {
                System.out.println("Está frio... O número gerado é menor");
            }
            else if (numEscolha > numAleat + 5) {
                System.out.println("Está esquentando... O número é pouco menor");
            } 
            else if (numEscolha > numAleat + 4 || numEscolha > numAleat + 3 || numEscolha > numAleat + 2 || numEscolha > numAleat){
                System.out.println("Está MUITO quente! O número é pouco menor");
            }
        }
    }
}
