package teste1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TesteGit1 teste = new TesteGit1();
		
		teste.imprimirNome("luana");
		
		Idade testarIdade = new Idade();
		
		Boolean verificandoIdade = testarIdade.verificaMaioridade(16);
		
		System.out.println(verificandoIdade);
	}

}
