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
public class Gerente extends Funcionario{
    
    private double salarioMensal;
    private double bonificacao;

    /**
     * @return the salarioMensal
     */
    public double getSalarioMensal() {
        return salarioMensal;
    }

    /**
     * @param salarioMensal the salarioMensal to set
     */
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    /**
     * @return the bonificacao
     */
    public double getBonificacao() {
        return bonificacao;
    }

    /**
     * @param bonificacao the bonificacao to set
     */
    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
    
  
    
}
