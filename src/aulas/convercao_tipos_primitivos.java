package aulas;

public class convercao_tipos_primitivos {
	public static void main (String [] args){
		double d = 1.99d;
		int i = (int) d; //recebe o valor 1
		
		short s = 15;
		long x = s;  	//convers�o widening
		long y =(long) s; //n�ao � necess�rio
		
		
	}
}
