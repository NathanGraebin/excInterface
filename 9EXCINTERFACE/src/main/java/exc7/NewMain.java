/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exc7;

import exc4.Redimensionavel;
import java.util.Scanner;

/**
 *
 * @author Nathan Graebin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        

        Pesquisavel pesquisar = new PesquisarBancoDados();
        String dados = "quatro";

        pesquisar.pesquisar(dados);

    }

}
