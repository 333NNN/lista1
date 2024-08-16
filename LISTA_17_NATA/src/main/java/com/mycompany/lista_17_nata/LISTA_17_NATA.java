/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_17_nata;

import java.util.Scanner;
/**
 *
 * @author Nata e Julia
 */
public class LISTA_17_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = ler.nextLine();
        int vogais = 0;  
        
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                vogais = vogais + 1;
            }
            System.out.println(letra);
        }
        System.out.println("Existem " + vogais + " vogais na palavra.");
    }
}
