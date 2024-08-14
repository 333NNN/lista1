/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_01_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA_01_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe a primeira nota: ");
            float primeiraNota = ler.nextInt();
        System.out.print("Informe a segunda nota: ");
            float segundaNota = ler.nextInt();
        System.out.print("Informe a terceira nota: ");
            float terceiraNota = ler.nextInt();
            float notaFinal = (primeiraNota + segundaNota + terceiraNota)/3;
            System.out.println("Sua média é: "+ notaFinal);
        if (notaFinal >=7) {
            System.out.println("Aprovado!");
        }
        else if (notaFinal >= 5) {
            System.out.println("Recuperação");
        }
        else if (notaFinal < 5) {
            System.out.println("Reprovado");
        }
    }
}
