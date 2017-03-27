/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import javax.swing.JOptionPane;

/**
 *
 * @author FilipeBarros
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String peso = JOptionPane.showInputDialog("Peso:");
        float pesoImc = Float.parseFloat(peso);
        String altura = JOptionPane.showInputDialog("Altura:");
        float alturaImc = Float.parseFloat(altura);
        
        JOptionPane.showMessageDialog(null, "IMC ="  + pesoImc/(alturaImc*alturaImc) );

        
        
        
        
    }
    
}
