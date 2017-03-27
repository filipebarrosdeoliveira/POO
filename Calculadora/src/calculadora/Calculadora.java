/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author FilipeBarros
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String variavel1 = JOptionPane.showInputDialog("Entre com o número:");
        float x = Float.parseFloat(variavel1);
       String variavel2 = JOptionPane.showInputDialog("Entre com o segundo número:");
        float y = Float.parseFloat(variavel2);
       String entrada = JOptionPane.showInputDialog("Operação:");
        
        
        float z = 0;
        switch (entrada) {
            case "+": JOptionPane.showMessageDialog(null, + (z = x + y));
            break;
            case "-":JOptionPane.showMessageDialog(null, + (z = x - y));
            break;        
            case "*":JOptionPane.showMessageDialog(null,+ (z = x * y));
            break;
            case "/":JOptionPane.showMessageDialog(null, + (z = x / y));
            break;
        }
        
    }
    
    
}
