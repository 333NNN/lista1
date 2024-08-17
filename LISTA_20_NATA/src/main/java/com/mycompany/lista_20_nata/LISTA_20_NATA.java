/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_20_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA_20_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Bem-vindo(a) à Loja Virtual!\nDigite o valor da compra: ");
        float valor = ler.nextFloat();
        boolean valid = true;
        float valorFinal = 0, porcentCartao = 1.5f/100, porcentVista = 10.0f/100, porcentDebito = 5.0f/100;
        
        while (valid){
            System.out.println("Digite a forma de pagamento:\n1 - Cartão de crédito\n2 - Dinheiro/Pix\n3 - Cartão débito");
            int formaPag = ler.nextInt();
            

            if (formaPag == 1){
                valorFinal = valor - (porcentCartao * valor);
                break;
            }
            else if (formaPag == 2){
                valorFinal = valor - (porcentVista * valor);
                break;
            }
            else if (formaPag == 3){
                valorFinal = valor - (porcentDebito * valor);
                break;
            }
            else {
                System.out.println("Forma de pagamento inválida.");
            }
        }
        System.out.printf("O valor final da compra é R$%.2f",valorFinal);
    }
}
