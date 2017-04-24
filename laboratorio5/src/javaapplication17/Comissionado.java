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
public class Comissionado extends Funcionario {
    
    private double salarioMensal;
    private double totalVendas;
    private double porcentagem;
    
    public double calculaSalario () {
      
        return getSalarioMensal() + getTotalVendas() * getPorcentagem() ;
    }

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
     * @return the totalVendas
     */
    public double getTotalVendas() {
        return totalVendas;
    }

    /**
     * @param totalVendas the totalVendas to set
     */
    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    /**
     * @return the porcentagem
     */
    public double getPorcentagem() {
        return porcentagem;
    }

    /**
     * @param porcentagem the porcentagem to set
     */
    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
    
}
