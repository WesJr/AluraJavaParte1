
public class TestaGerente {
	public static void main(String[] args) {
		
		Gerente thiago = new Gerente();
		
		thiago.setNome("Tiago");
		thiago.setCpf("873873837837");
		thiago.setSalario(30000.0);
		
		System.out.println(thiago.getNome());
		System.out.println(thiago.getCpf());
		System.out.println(thiago.getSalario());
		
		thiago.setSenha(1234);
		boolean autenticou = thiago.autentica(1234);
		
		System.out.println(autenticou);
	}
}
