/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_05_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_05_NATA {

    public static void main(String[] args) {
        System.out.println("###+++~~~TABUADA~~~+++###\nPara começar, digite um número entre 1 e 10: ");
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        for (int i = 1; i<11;i++){
            System.out.println(num +" x "+ i +" = "+ num*i);
        }
    }
}
