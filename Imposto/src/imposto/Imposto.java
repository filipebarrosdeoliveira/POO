/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imposto;

import static javafx.scene.input.KeyCode.O;
import javax.swing.JOptionPane;

/**
 *
 * @author FilipeBarros
 */
public class Imposto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog("Valor:");
        int valor = Integer.parseInt(entrada);
        
        String code = JOptionPane.showInputDialog("Código:");
        int codigo = Integer.parseInt(entrada);
      
        switch(codigo) {
            case 1: JOptionPane.showMessageDialog(null, "O valor é ="  + (valor + 0.10) );
            break;
            case 2: JOptionPane.showMessageDialog(null, "O valor é ="  + (valor + 0.25) );
            break;
            case 3: JOptionPane.showMessageDialog(null, "O valor é ="  + (valor + 0.30) );
            break;
            case 4: JOptionPane.showMessageDialog(null, "O valor é ="  + (valor + 0.50) );
            break;
        }
        
        if(valor >= 1000 && valor <= 5000){
            JOptionPane.showMessageDialog(null, "O valor é ="  + (valor + 0.01) );
         }
        if(valor >= 5001 && valor <= 10000){
            JOptionPane.showMessageDialog(null, "O valor é ="  + (valor + 0.02) );
         }
        if(valor >= 10001){
            JOptionPane.showMessageDialog(null, "O valor é ="  + (valor + 0.03) );
         }
        
    }
    
}
