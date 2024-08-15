/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_07_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_07_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = ler.nextInt();
        int par=0;
        int impar=0;
        for (int i=1; i < num; i++){
            System.out.print(i+" ");
            if(i%2==0){
                par++;
            }
            else if(i%2==1){
                impar++;
            }
        }
        System.out.println("\nForam contabilizados "+par+" números pares e "+impar+" números ímpares."); 
    }
}
