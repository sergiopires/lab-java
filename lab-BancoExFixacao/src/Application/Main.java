package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		String name;
		int conta;
		String temDeposito ;
		double deposito;
		double valor;
		Conta account;
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter account number:");
		conta = Integer.parseInt(sc.nextLine());	
		
		System.out.println("Enter account holder");
		name = sc.nextLine();		
			
		System.out.println("Is there an initial deposit (y/n)?");
		temDeposito =  sc.nextLine();		
			
		if(temDeposito.equals("y")) {
			
			System.out.println("Enter initial deposit value:");
			deposito = sc.nextDouble();
			
			account = new Conta(conta, name,deposito);
			 
		} 
		else {account = new Conta(conta, name);}
		System.out.println(account);
		
		System.out.println("Enter a deposit value: ");
	    deposito = sc.nextDouble();
	    account.Deposito(deposito);
		System.out.println("Updated account data: " + account);
		
		 System.out.println("Enter a withdraw");
		 valor = sc.nextDouble();
		 account.Saque(valor);
		 System.out.println("Updated account data: " + account);		 
		 
		 
		sc.close();

	}

}
