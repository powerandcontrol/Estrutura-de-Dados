package questao05;


import java.util.Scanner;

public class MainPilha
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sequencia: ");
		String s = scanner.next();
		Pilha pilha = new Pilha(s.length());
		
		if(pilha.verificaBalanceamento(s))
			System.out.println("A sequencia esta balenceada");
		else
			System.out.println("A sequencia nao esta balanceada");
		
		scanner.close();
	}
}
