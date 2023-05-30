/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exc3;

import java.util.Scanner;

/**
 *
 * @author Nathan Graebin
 */
public class ArquivoCache implements Armazenavel {
    String nome;
    int id;
    Scanner Ler = new Scanner(System.in);
    
    public ArquivoCache(String nome, int id){
        this.nome = nome;
        this.id = id;
    
    }
    
    public ArquivoCache(){}
    
    
    
    public void salvar(){
        System.out.println("INFORME O NOME");
        this.nome = Ler.next();
        
        System.out.println("INFORME O ID");
        this.id = Ler.nextInt();
    
    }
    
    public void carregar(){
        System.out.println("CARREGANDO DADOS");
        System.out.println("NOME :" + this.nome);
        System.out.println("NOME :" + this.id);
    
    }
    
}
