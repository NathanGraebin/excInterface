/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exc9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nathan Graebin
 */
public class ValidadorEmail implements Validavel {

    @Override
    public void validar(String email) {
        boolean validador;

        if ("nathan@nathan.com" == email) {
            validador = true;
            
            System.out.println("EMAIL ENCONTRADO");
        }
        
        else{
        validador = false;
        
        System.out.println("EMAIL NAO ENCONTRADO");
        }

    }
}
