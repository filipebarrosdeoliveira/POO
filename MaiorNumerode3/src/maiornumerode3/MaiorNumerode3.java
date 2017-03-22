/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiornumerode3;

import java.util.Scanner;

/**
 *
 * @author FilipeBarros
 */
public class MaiorNumerode3 {


    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o primeiro número");
        int x = sc.nextInt();
        
        System.out.println("Entre com o primeiro segundo");
        int y = sc.nextInt();
        
        System.out.println("Entre com o primeiro terceiro");
        int z = sc.nextInt();
        
        
        if(x>y && x>z) {
            System.out.println(x);
            
        }
        
        if(y>x && y>z) {
            System.out.println(y);
        }
        
        if(z>y && z>x) {
            System.out.println(z);
        }
    }
    
}
