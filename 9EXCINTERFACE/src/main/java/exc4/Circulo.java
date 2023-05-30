/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exc4;

/**
 *
 * @author Nathan Graebin
 */
public class Circulo implements Redimensionavel {
    
    
    @Override
    public void redimensionar(double fator){
        double resultado;
        resultado = 3.14 * (fator * fator);
        
        System.out.println("O RAIO É DE :" + resultado);
        
    }
    
}
