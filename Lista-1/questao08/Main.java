package questao08;

import java.util.Scanner;


public class Main
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = 5;
		
		Pilha pilha = new Pilha(n);
		
		//pilha.paresUnicos();
		
		pilha.paresUnicos();
		
		
		scanner.close();
	}
}
