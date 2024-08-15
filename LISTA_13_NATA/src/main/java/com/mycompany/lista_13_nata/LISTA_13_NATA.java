/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_13_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_13_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um ano de sua preferência: ");
        int ano = ler.nextInt();
        if (ano % 4 == 0) {
            System.out.println(ano+" é bissexto.");
        } 
        else {
            System.out.println(ano+" não é bissexto");
        }
    }
}
