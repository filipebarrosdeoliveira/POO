/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author aluno
 */
public class Administrador extends Funcionario {
 
    double salarioMensal;
    
      public double getSalrio () {
        return salarioMensal;
    }
    
   public void setSalario (double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
