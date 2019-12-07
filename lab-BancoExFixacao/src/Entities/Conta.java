package Entities;

public class Conta {
	private int conta;
	private String nome;
	private double saldo;
	
	private final double taxa = 5.00;
	
	public int getConta() {
		return conta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(int conta, String nome, double valorInicial) {
		super();
		this.conta = conta;
		this.nome = nome;
		Deposito(valorInicial);
	}
	
	public Conta(int conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;		
	}
	
	public void Deposito(double valor) {		
		this.saldo += valor;		
	}
	
	public void Saque(double valor) {
		double saldo = getSaldo();
		 saldo -=  valor + taxa;		 
		 this.saldo = saldo;
	}
	
	public String toString() {
	 return	 "Account data: Account " 
	+ getConta() 
	+ " Holder: " 
	+ getNome() 
	+ ", Balance: "
	+  String.format("%.2f", saldo)	; 
	}

}
