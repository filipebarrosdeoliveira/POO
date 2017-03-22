/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaaluno;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FilipeBarros
 */
public class MediaAluno {

    /**
     * Programa que calcula a média de um aluno em uma escola
     * @param args
     */
   
    
    public static void main(String[] args) {
        
        System.out.println("Entre com P1");
        Scanner sc = new Scanner (System.in);
        int P1 = sc.nextInt();
        System.out.println("Entre com P2");
        int P2 = sc.nextInt();
        System.out.println("Entre com P3");
        int P3 = sc.nextInt();
        System.out.println("Entre com NT");
        int NT = sc.nextInt();
       
        System.out.println("Média do Aluno:" + ((P1*0.2+P2*0.3+P3*0.5)*0.85+NT*0.15));
        
     }
    
}
