
public class TestaEscopo {
	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 13;
		int QuantidadePessoas = 2;
		
		// boolean acompanhado = QuantidadePessoas >= 2;
		boolean acompanhado;
		
		if(QuantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		System.out.println("Valor acompanhado = " + acompanhado);
		
		if (idade >= 18 || acompanhado) {

			System.out.println("Você tem mais que 18 anos ou está acompanhado!");
			System.out.println("Seja bem vindo");

		} else {

		System.out.println("Infelizmente você não pode entrar!");
			
		}
	}
}
