package exercicio2;

import java.util.Random;

public class Conta{
	private static int numeroConta;
	private Cliente titular;
	private double saldo;
	private static int contador;
	
	
	//construtor1
    //public Conta(int numeroConta) {
    //	this.numeroConta = numeroConta;
    //}
	//construtor2
    public Conta(Cliente titular) {
    	this.titular = titular;
    	contador = contador + 1;
    }
    
    public static int getContador() {
    	return contador;
    }
    
    //construtor 3
    //public Conta(Cliente titular, int numeroConta) {
    //	this.titular = titular;
    //	this.numeroConta = numeroConta;
    	
    //}
  	public double getSaldo() {
		return this.saldo;
	}
	
	/*public void setNumeroConta( int conta) {		
		this.numeroConta = conta;
	}*/
	
	public static int getNumeroConta() {
		Random geraConta = new Random();
		numeroConta = geraConta.nextInt(1000);
		return numeroConta;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean transferir(Conta contaDestino, double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}

}
