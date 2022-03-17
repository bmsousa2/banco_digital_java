package desafio_dio_branco;

public class Main {

	public static void main(String[] args) {
		
		Cliente bruno = new Cliente();
		bruno.setNome("Bruno");
		
		Conta cc = new ContaCorrente(bruno);
		Conta poupanca = new ContaCorrente(bruno);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

	

}
