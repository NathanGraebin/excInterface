/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exc2;

/**
 *
 * @author Nathan Graebin
 */
public class BubbleSort implements Ordenavel {

    @Override
    public void ordenar(int[] numeros) {

        boolean houveTroca = true;

        while (houveTroca) {
            houveTroca = false;

            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    houveTroca = true;
                }
            }

        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + " " + i + " =" + numeros[i]);

        }

    }

}
