/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_12_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_12_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("--== SISTEMA ELEITORAL ==--");
        int cand1=0, cand2=0, cand3=0, nulo=0;
        
        for(int i=0;i<10;i++){
            System.out.println("Escolha o número referente ao candidato\n1 - Candidato A\n2 - Candidato B\n3 - Candidato C\nVoto: ");   
            int voto = ler.nextInt();
            if (voto == 1){
                cand1 = cand1+1;
            }
            else if (voto == 2){
                cand2 = cand2+1;
            }
            else if (voto == 3){
                cand3 = cand3+1;
            }
            else {
                System.out.println("Seu voto foi anulado");
                nulo = nulo+1;
            }
        }
        int parc = cand1 + cand2 + cand3;
        int total = parc + nulo;
        System.out.println("\n--== RESULTADO ==--\nForam "+parc+" voto(s) válido(s) e "+nulo+" voto(s) nulo(s), totalizando "+total+" votos");
        System.out.println("Candidato A: "+cand1);
        System.out.println("Candidato B: "+cand2);
        System.out.println("Candidato C: "+cand3);
        
        if (cand1> cand2 && cand1 > cand3){
            System.out.println("\nCandidato A venceu com "+cand1+" votos!");
        }
        else if (cand2 > cand1 && cand2 > cand3){
            System.out.println("\nCandidato B venceu com "+cand2+" votos!");
        }
        else if (cand3 > cand1 && cand3 > cand2){
            System.out.println("\nCandidato C venceu com "+cand3+" votos!");
        }
        else if (cand1==cand2||cand2==cand3||cand1==cand3){
            System.out.println("\nSerá realizado um segundo turno em breve");
        }
    }
}
