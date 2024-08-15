/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_03_nata;

/**
 *
 * @author ncunha
 */
import java.util.Scanner;
public class LISTA_03_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean operacao = true;
        System.out.println("++==_CALCULADORA_==++");
        
        while (operacao == true) {
            System.out.print("Digite o primeiro número da operação: ");
            int num1 = ler.nextInt();
            System.out.print("Digite o segundo número da operação: ");
            int num2 = ler.nextInt();
            ler.nextLine();
            System.out.println("Digite o operador a ser usado, utilizando os sinais:\n + para ADIÇÃO\n - para SUBTRAÇÃO\n * para MULTIPLICAÇÃO\n / para DIVISÃO ");
            System.out.print("Operador: ");
            String operador = ler.nextLine();
        
            if (operador.equals("+")){
                System.out.println(num1 +" + "+ num2 +" = "+ (num1+num2));
            }
            else if (operador.equals("-")){
                System.out.println(num1 +" - "+ num2 + " = " + (num1-num2));
            }
            else if (operador.equals("*")){
                System.out.println(num1 +" * "+ num2 + " = " + (num1*num2));
            }
            else if (operador.equals("/")){
                if (num2 != 0){
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                }
                else {
                    System.out.println("Erro: não é possível a divisão por zero.");
                }
            }
            else {
                System.out.println("Operador inválido. Tente novamente.");
            }
            System.out.println("Deseja realizar outra operação? S/N");
            String cont = ler.nextLine();
            
            if (cont.equals("S") || cont.equals("s")){
                System.out.println("Continuando...");
            }
            else if (cont.equals("N") || cont.equals("n")){
                operacao = false;
            }
        }
    }
}
