package desafioDioBanco;

public class Main {
	
	public static void main(String[] args) {
		Cliente cleber = new Cliente();
		cleber.setNome("Cleber");
		
		Conta cc = new ContaCorrente(cleber);
		Conta poupanca = new ContaPoupanca(cleber);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		poupanca.transferir(25, cc);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
