package questao07;

import java.util.Scanner;
 
public class MainPilha
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entre com uma frase: ");
		String s = scanner.nextLine();
		Notacao notacao = new Notacao(s);
		
		if(notacao.interpretaNotacao())
			System.out.println(s+ " = "+ notacao.resultado());
		else
			System.out.print("Notação inválida");


		scanner.close();
	}
}
