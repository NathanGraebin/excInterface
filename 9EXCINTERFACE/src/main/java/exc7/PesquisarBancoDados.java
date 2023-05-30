/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exc7;

/**
 *
 * @author Nathan Graebin
 */
public class PesquisarBancoDados implements Pesquisavel {

    @Override
    public void pesquisar(String dados) {

        String valor[] = {"um", "dois", "tres", "quatro", "cinco"};
        
        for (int i = 0; i < valor.length; i++) {
            if(valor[i] == dados){
                System.out.println("ENCONTRAMOS SEU DADO , ESTA NA POSIÇÃO " + i);
                i = valor.length;
            }
            else{
                System.out.println("DADO NÃO ENCONTRADO");
            }   
        }
    }
}
