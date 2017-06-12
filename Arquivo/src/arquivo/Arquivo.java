/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author aluno
 */
public class Arquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
  
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        String s = br.readLine();
        
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }
        
        br.close();
    }
    
}
