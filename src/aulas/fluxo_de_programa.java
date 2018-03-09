package aulas;

public class fluxo_de_programa {
	public static void main (String [] args){
		int idade = 20;
		if (idade<=12){
			System.out.println("CRIANÇA");
		}
		if (idade>12 && idade<=19){
			System.out.println("ADOLESCENTE");
		}
	if(idade > 19 && idade<=60){
		System.out.println("ADULTO");
	}
	if(idade > 60){
		System.out.println("IDOSO");
	}
	}
}
