
public class TestaConta {
	public static void main(String[] args) {
		
		Conta contaDoWesley = new Conta(1029, 7263);
		Conta contaDoWesley1 = new Conta(1021, 7233);
		Conta contaDoWesley2 = new Conta(1059, 7763);
		
		contaDoWesley.setAgencia(456);
		contaDoWesley.setNumero(123);
		contaDoWesley.deposita(100);
		
		Cliente wesley = new Cliente();
		
		wesley.setNome("Wesley Junior de Souza");
		wesley.setCPF("12345678912");
		wesley.setEndereco("Rua 10");
		
		contaDoWesley.setTitular(wesley);
		
		System.out.println(contaDoWesley.getTitular().getNome());
		System.out.println(contaDoWesley.getTitular().getCPF());
		System.out.println(contaDoWesley.getTitular().getEndereco());
		System.out.println(contaDoWesley.getAgencia());
		System.out.println(contaDoWesley.getNumero());
		System.out.println(contaDoWesley.getSaldo());
		
		
		
		
	}

}
