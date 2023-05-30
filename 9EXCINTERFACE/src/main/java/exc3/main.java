/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exc3;

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
        
        Armazenavel iniciar = new ArquivoCache();
        
        iniciar.salvar();
        iniciar.carregar();
        
    }
    
}
