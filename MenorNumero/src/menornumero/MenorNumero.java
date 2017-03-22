/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menornumero;

import java.util.Scanner;

/**
 *
 * @author FilipeBarros
 */
public class MenorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Entre com o primeiro número");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        
        System.out.println("Entre com o segundo numero");
        int y = sc.nextInt();
        
        if(x>y) {
              System.out.println("O maior número é" +x);
        }
        else 
              System.out.println("O maior número é" +y);
        
        
            
    }
    
}
