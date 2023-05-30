/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exc4;

import java.util.Scanner;

/**
 *
 * @author Nathan Graebin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        Redimensionavel iniciarRed = new Circulo();
        
        System.out.println("INFORME O FATOR");
        double fator = Ler.nextDouble();
        
        iniciarRed.redimensionar(fator);
        

    }

}
