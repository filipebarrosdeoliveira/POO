/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasemana;

import java.util.Scanner;

/**
 *
 * @author FilipeBarros
 */
public class DiaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Entre com o numero");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        switch (x) {
            case 1: System.out.println("Domingo");
            break;
            case 2: System.out.println("Segunda");
            break;
            case 3: System.out.println("Terça");
            break;
            case 4: System.out.println("Quarta");
            break;
            case 5: System.out.println("Quinta");
            break;
            case 6: System.out.println("Sexta");
            break; 
            case 7: System.out.println("Sabado");
            break;  
            
        }
        
    }
    
}
