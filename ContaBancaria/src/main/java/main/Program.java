package main;

import model.ContaBancaria;

public class Program {

    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria("12345", "Igor");

        cb1.verificarSaldo();

        cb1.depositar(400.0);

        System.out.println();

        cb1.verificarSaldo();

        System.out.println();

        cb1.sacar(400.0);

        cb1.verificarSaldo();



    }
}
