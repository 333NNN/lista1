/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_18_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_18_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Pedágio BR-222\nDigite o tipo de veículo:\n1 - motocicleta\n2 - carro\n3 - caminhão");
        int tipoVeic = ler.nextInt();
        float preco = 0f, moto =  1.20f, carro = 2.50f, caminhao = 3.40f;
        
        if (tipoVeic == 1){
            preco = moto;
            System.out.printf("Valor do pedágio é: R$%.2f", preco);
        } 
        else if (tipoVeic == 2){
            preco = carro;
            System.out.printf("Valor do pedágio é: R$%.2f", preco);
        }
        else if (tipoVeic == 3){
            preco = caminhao;
            System.out.printf("Valor do pedágio é: R$%.2f", preco);
        }
        System.out.println("\nObrigado, volte sempre!");
    }
}
