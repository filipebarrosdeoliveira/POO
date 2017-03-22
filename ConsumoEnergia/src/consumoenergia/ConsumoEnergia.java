/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumoenergia;

import java.util.Scanner;

/**
 *
 * @author FilipeBarros
 */
public class ConsumoEnergia {

  
    
    public static void main(String[] args) {
       
        
        
        System.out.println("Entre com o Quilowatts");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        
        System.out.println("Entre com o Quilowatts Hora");
    
        int y = sc.nextInt();
        
        int z = (int) ((x * y) * 0.1) ;
        
        System.out.println("O valor com desconto será de:" +z);
        
        
    }
    
}
