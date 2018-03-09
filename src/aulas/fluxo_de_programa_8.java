package aulas;

public class fluxo_de_programa_8 {
 //clausula break rotulada
	int j=0, i=0;
 principal1: while(true){
	 for(i=0;i<1000; i++){
		 break principal1;
	 }
	 j++;
 }

