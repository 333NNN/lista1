/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_19_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA_19_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Cálculo de Potências");
        System.out.println("Digite o número base do cálculo: ");
        double base = ler.nextDouble();
        System.out.println("Digite o número do expoente: ");
        double expo = ler.nextDouble();
        double result = 1;
        
        for (int i = 0; i < expo; i++){
            result *= base;
        }
        
        System.out.println("O resultado é: "+result);
    }
}
