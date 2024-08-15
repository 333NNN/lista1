/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_15_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_15_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("CÁLCULO DE FATORIAL\nPara começar, digite um número: ");
        int num = ler.nextInt();
        int fatorial = 1;
        
        for (int i=1; i<=num; i++){
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
