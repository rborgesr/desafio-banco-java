
public class Main {
	public static void main(String[] args) {
		
		Cliente rafael = new Cliente();
		rafael.setNome("Rafael");
		
		Conta cc = new ContaCorrente(rafael);
		Conta poupanca = new ContaPoupanca(rafael);
		
		Cliente clayton = new Cliente();
		clayton.setNome("Clayton");
		
		Conta cc2 = new ContaCorrente(clayton);
		Conta poupanca2 = new ContaPoupanca(clayton);
		

		
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		System.out.println("-------------------");
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
		
		
	}
}
