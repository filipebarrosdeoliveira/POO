/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nometelefone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author FilipeBarros
 */
public class NomeTelefone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Entre com o nome:");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Entre com o telefone");
        int telefone = sc.nextInt();
        
        
         Pattern pattern = Pattern.compile("[a-zA-Z]{3,3}-\\d{4,4}");
        Matcher matcher = pattern.matcher("ETE-1234");
 
        if( matcher.find() ){
            System.out.println("Encontrou");
        }else{
            System.out.println("Não encontrou");
        }
       
      
        boolean b = false;
        while( b = matcher.find() ){
            if( b ){
                System.out.println( matcher.group()+" - Posição: "+matcher.start() );
            }else{
                System.out.println("Não encontrou");
            }
        
    }
    
}
}