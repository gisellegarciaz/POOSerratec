package classes;

public class Conta {
	
	public String titular;
	public double saldo;

	    public Conta(String titular, double saldoInicial) {
	        this.titular = titular;
	        this.saldo = saldoInicial;
	    }

	    public void depositar(double valor) {
	        this.saldo += valor;
	        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
	    }

	    public void sacar(double valor) {
	        if (this.saldo >= valor) {
	            this.saldo -= valor;
	            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
	        } else {
	            System.out.println("Saldo insuficiente para realizar o saque.");
	        }
	    }
}