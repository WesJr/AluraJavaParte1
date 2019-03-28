
public class TesteFuncionario {
	
	public static void main(String[] args) {
		 
		Funcionario wesley = new Funcionario();
		
		wesley.setNome("Wesley Junior de Souza");
		wesley.setCpf("222222222-1");
		wesley.setSalario(1000.0);
		
		System.out.println(wesley.getNome());
		System.out.println(wesley.getBonificacao());
	}

}
