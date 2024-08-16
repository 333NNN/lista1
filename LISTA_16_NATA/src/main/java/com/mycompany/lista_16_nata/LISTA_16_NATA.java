/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_16_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_16_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = ler.nextLine();
        
        boolean ehPalindromo = true;
        
        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }
        
        if (ehPalindromo) {
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        } 
        else {
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }
    }
}