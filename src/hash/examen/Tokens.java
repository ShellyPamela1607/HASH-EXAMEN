/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash.examen;

import java.util.StringTokenizer;

/**
 *
 * @author Shelly Pam
 */
public enum Tokens {
    PALABRAS_RESERVADAS("(IF|ELSE|FOR|PRINT|INT)"),
    CADENA_CARACTERES("[a-z]"),
    OPERADOR_ARITMETICO("[*|/|+|-]"),
    NUMERO("[0-9]"),
    OPERADOR_RELACIONAL("([>=|<=|>|<|=|,|{|}|[|]|(|)|;|..|])");

    
    /*StringTokenizer tokens=new StringTokenizer(cod);
	while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }*/
    public final String patron;
    Tokens(String s) {
        this.patron = s;

    }
}
