/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_04_nata;

import java.util.Scanner;


/**
 *
 * @author Nata e Julia
 */
public class LISTA_04_NATA {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("SISTEMA DE LOGIN\n Para iniciar, cadastre seu usuário: ");
        String user = ler.nextLine();
        String senha;
        
        while (true) {
            System.out.print("Cadastre sua senha de 6 dígitos: ");
            senha = ler.nextLine();
            if (senha.length() == 6) {
                break;
            } else {
                System.out.println("Senha inválida. A senha deve ter exatamente 6 dígitos.");
            }
        }
        int tentUser = 4;
        int tentSenha = 4;
        while (tentUser > 0 && tentSenha > 0){
            System.out.println("Para entrar no sistema, digite seu usuário: ");
            String checkUser = ler.nextLine();
            
            if (checkUser.equals(user)){
                System.out.println("Digite sua senha: ");
                String checkSenha = ler.nextLine();
                if (!checkSenha.equals(senha)){
                    tentSenha--;
                    System.out.println("Senha inválida. Você tem "+ tentSenha +" tentativas: ");                
                }
                else {
                    System.out.println("Login realizado com sucesso!");
                    break;
                }
            }
            else {
                tentUser--;
                System.out.println("Usuário inválido. Você tem "+ tentUser +" tentativas: ");
            }
            if (tentUser == 0 || tentSenha == 0){
                System.out.println("Usuário ou senha inválido(s). Sistema bloqueado\nEntre em contato com o suporte para desbloquear seu acesso.");
            }
        }
    }
}
