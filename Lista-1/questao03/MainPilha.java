package questao03;


import java.util.Scanner;

public class MainPilha
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		PilhaDupla pilha = new PilhaDupla();
	
		char opcao = '\0';
		
		while(opcao!='0') 
		{
			System.out.println("\n Menu: ");
			System.out.println("1- Push na Pilha 1: ");
			System.out.println("2- Push na Pilha 2: ");
			System.out.println("3- Pop na Pilha 2: ");
			System.out.println("4- Pop na Pilha 2: ");
			System.out.println("5- Listar Pilha Dupla: ");

			System.out.println("0- Sair");

			opcao = scanner.next().charAt(0);
			char item;
			
			switch(opcao) {
			case '1':
				System.out.print("Digite para inserir na pilha 1: ");
				item = scanner.next().charAt(0);
				pilha.pushPilha1(item);
				break;
				
			case '2':
				System.out.print("Digite para inserir na pilha 2: ");
				item = scanner.next().charAt(0);
				pilha.pushPilha2(item);
				break;
				
			case '3':
				item = pilha.popPilha1();
				if(item != '\0')
					System.out.println("Item "+item+" removido da Pilha 1");
				break;
				
			case '4':
				item = pilha.popPilha2();
				if(item != '\0')
					System.out.println("Item "+item+" removido da Pilha 2");
				break;
				
			case '5':
				pilha.listarPilhaDupla();
				break;
				
			case '0':
				break;
			}
			
			
			
		}

		System.out.print("\n");
		
		scanner.close();
	}
}
