/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostorenda;

import javax.swing.JOptionPane;

/**
 *
 * @author FilipeBarros
 */
public class ImpostoRenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String hora = JOptionPane.showInputDialog("Horas Trabalhadas:");
        int horasTrabalhadas = Integer.parseInt(hora);
        
        String salario = JOptionPane.showInputDialog("Código:");
        int salarioHora = Integer.parseInt(salario);
        
        String dependentes = JOptionPane.showInputDialog("Valor:");
        int numeroDependentes = Integer.parseInt(dependentes);
        
        
        float salarioBruto,INSS,IR,salarioLiquido;
        
        salarioBruto = horasTrabalhadas * salarioHora + (50 * numeroDependentes);
        
        if (salarioBruto <= 1000) {
            INSS = (float) (salarioBruto * 8.5/100);
        }
        if (salarioBruto > 1000) {
            INSS = (float) (salarioBruto * 9/100);
        }
        
        if (salarioBruto <= 500) {
            IR = 0;
        }
        if (salarioBruto > 500 && salarioBruto <= 1000) {
           IR = salarioBruto * 5/100;
        }
        if (salarioBruto > 1000) {
            IR = salarioBruto *7/100;
        }
        
     
        
        
    }
    
}
