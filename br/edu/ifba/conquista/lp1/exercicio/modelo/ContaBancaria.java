package br.edu.ifba.conquista.lp1.exercicio.modelo;

public class ContaBancaria{

    private String numeroConta;

    public ContaBancaria(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void getNum(){
        System.out.println(numeroConta);
    }
}