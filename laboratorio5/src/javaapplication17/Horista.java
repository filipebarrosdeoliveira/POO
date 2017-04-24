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
public class Horista extends Funcionario {
    
    private double quantidadeHoras;
    private double valorHora;
    
    @Override
    public double calculaSalario () {
      
      return getQuantidadeHoras() * getValorHora();  
    }

    /**
     * @return the quantidadeHoras
     */
    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    /**
     * @param quantidadeHoras the quantidadeHoras to set
     */
    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    /**
     * @return the valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
