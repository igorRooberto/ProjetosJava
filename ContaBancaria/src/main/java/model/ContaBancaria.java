package model;

public class ContaBancaria {

    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String numeroConta, String nomeTitular){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }else{
            System.out.println("Erro o valor deve ser maior que zero!");
        }
    }

    public void sacar(double valor){
        if(valor > 0){
            if(saldo >= valor){
                saldo -= valor;
                System.out.println("O saque de "+valor+ " foi realizado com sucesso!");
            }else{
                System.out.println("Erro valor maior que o saldo, saque um quantidade igual ou menor!");
            }
        }else{
            System.out.println("Erro valor menor que zero,insira um valor positivo!");
        }
    }

    public void verificarSaldo(){
        System.out.println("Nome do titular: "+nomeTitular);
        System.out.println("Numéro da Conta: "+numeroConta);
        System.out.println("Saldo: "+saldo);
    }


}
