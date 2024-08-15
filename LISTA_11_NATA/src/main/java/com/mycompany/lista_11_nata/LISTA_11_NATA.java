/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_11_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_11_NATA {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("CONVERSÃO DE TEMPERATURA");
        System.out.println("Digite a opção de temperatura que deseja:\nC - converter para Celsius(°C)\nF - converter para Fahrenheit(°F)");
        String unidTemp = ler.nextLine();
        System.out.print("Digite a temperatura a ser convertida: ");
        float temp = ler.nextFloat();
        
        if (unidTemp.equals("f") || unidTemp.equals("F")){
             float tempConvert = (float) ((temp-32)/1.8);
             System.out.println("A temperatura é "+tempConvert+"°F");
        }
        else if (unidTemp.equals("c") || unidTemp.equals("C")){
            float tempConvert = (float) ((temp * 1.8)+32);
            System.out.println("A temperatura é "+tempConvert+"°C");
        }
    }
}
