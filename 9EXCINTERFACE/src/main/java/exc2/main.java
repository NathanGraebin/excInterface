/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exc2;

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
        
        int numeros[] = new int[10];
        
        Ordenavel ordenarBubble = new BubbleSort();
        
        System.out.println("INFORME 10 NUMEROS");
        for (int i = 0; i < 10; i++) {
            numeros[i] = Ler.nextInt();
        
        }
        ordenarBubble.ordenar(numeros);
        
    }
    
}
