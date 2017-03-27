/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terreno;

import javax.swing.JOptionPane;

/**
 *
 * @author FilipeBarros
 */
public class Terreno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String terreno = JOptionPane.showInputDialog("Áre do terreno:");
        float areaTerreno = Float.parseFloat(terreno);
        String construida = JOptionPane.showInputDialog("Área construída:");
        float areaConstruida = Float.parseFloat(construida);
        
        
        double areaNao = areaTerreno*3.80 - areaConstruida*5;
        
        
        
        
        JOptionPane.showMessageDialog(null, areaNao+areaConstruida*5 );

        
        
    }
    
}
