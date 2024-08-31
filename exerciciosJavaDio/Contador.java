package exerciciosJavaDio;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args)  {
		
		try{
			Scanner contadores = new Scanner(System.in);
		
	      	int parametro1,parametro2;
		
	    	System.out.print("Digite o primeiro numero: ");
		    parametro1 = contadores.nextInt();

            System.out.print("Digite o segundo numero: ");
		    parametro2 = contadores.nextInt();
		
			contar(parametro1, parametro2);
			
			
		}catch(ParametrosInvalidosException e) {
			System.out.print("Parametro invalido");
		}
		

	}
	
	public static void contar(int parametro1,int parametro2) throws ParametrosInvalidosException {
		if (parametro1 > parametro2) {
			throw new ParametrosInvalidosException();
		}

	  int contador = 0;
		
		for (int i = parametro1 ; i <= parametro2; i++) {
			int contagem =  contador++ ;
			
			System.out.println("Imprimindo o numero " + contagem);
		}
		
		
		
	}

}
