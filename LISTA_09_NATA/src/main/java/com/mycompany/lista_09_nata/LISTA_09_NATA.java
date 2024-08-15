/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_09_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_09_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Vamos descobrir se um número é primo!\n Digite um número: ");
        int num = ler.nextInt();
        boolean primo = true;
        
        if (num < 2){
            primo = false;
            System.out.println(num+" não é primo");
        }
        else {
            for (int i = 2; i < num/2; i++){
                if (num % i == 0) { 
                    primo = false;
                    break;
                }
            }
            if (primo){
                System.out.println(num+" é primo");
            }
            else {
                System.out.println(num+" não é primo");
            }
        }
    }
}
