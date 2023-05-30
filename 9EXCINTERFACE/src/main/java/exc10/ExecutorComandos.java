/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exc10;

import java.util.Scanner;

/**
 *
 * @author Nathan Graebin
 */
public class ExecutorComandos implements Executavel {

    Scanner Ler = new Scanner(System.in);

    @Override
    public void executar() {

        System.out.println("INFORME O QUE VOCÊ QUER FAZER");
        System.out.println("[1] DESENHAR");
        System.out.println("[2] ABRIR");
        System.out.println("[3] FECHAR");
        String escolha = Ler.nextLine();
        
        String DESENHAR = "DESENHAR";
        String ABRIR = "ABRIR";;
        String FECHAR = "FECHAR";;
        
        if (escolha == DESENHAR) {
            System.out.println("DESENHANDO");
        } else if (escolha == ABRIR) {
            System.out.println("ABRINDO");
        } else if (escolha == FECHAR) {
            System.out.println("FECHANDO");

        } else {
            System.out.println("NENNHUMA ESCOLHA CORRETA");
        }

    }
}
