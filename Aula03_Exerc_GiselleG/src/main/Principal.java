package main;

import classes.Conta;

public class Principal {

	    public static void main(String[] args) {
	        // Criando a primeira conta
	        Conta conta1 = new Conta("Giselle Garcia", 10000.0);
	        System.out.println("Conta de " + conta1.titular + " criada com saldo de R$" + conta1.saldo + "\n");
	        conta1.depositar(250.0);
	        conta1.sacar(150.0);
	        System.out.println("\n--------------------------------\n");

	        // Criando a segunda conta
	        Conta conta2 = new Conta("Gata Nairobi.", 10000.0);
	        System.out.println("Conta de " + conta2.titular + " criada com saldo de R$" + conta2.saldo);
	        conta2.sacar(600.0);
	        conta2.depositar(300.0);
	        System.out.println("\n--------------------------------\n");
	    }

	
}

