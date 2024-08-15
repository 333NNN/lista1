/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_08_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_08_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("SISTEMA DE LOGIN");
        String senha;
        while (true) {
            System.out.print("Cadastre sua senha de 8 dígitos: ");
            senha = ler.nextLine();
            if (senha.length() == 8) {
                break;
            }
            else {
                System.out.println("Senha inválida. A senha deve ter exatamente 8 dígitos.");
            }
        }
        
        int tentSenha = 4;
        while (tentSenha > 0){
            System.out.println("Para entrar no sistema, digite sua senha: ");
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
        if (tentSenha == 0){
            System.out.println("Usuário ou senha inválido(s). Sistema bloqueado\nEntre em contato com o suporte para desbloquear seu acesso.");
        }
    }
}
