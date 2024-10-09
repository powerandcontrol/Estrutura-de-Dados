package questao03;

public class PilhaDupla
{
	private int n;
	private char vetor[];
	private int topo1, topo2;
	
	public PilhaDupla()
	{
		n = 10;
		vetor = new char[n];
		topo1 = -1;
		topo2 = n;
	}
	
	public PilhaDupla(int tamanho)
	{
		n = tamanho;
		vetor = new char[tamanho];
		topo1 = -1;
		topo2 = n;
	}
	
	/*
	public boolean vazia()
	{
		return (topo1 == -1 || topo2 == n) ? true : false;
	}
	
	public boolean cheia()
	{
		return (topo1 == n - 1  || topo2 == -1) ? true : false;
	}

	*/
	
	public void listarPilhaDupla()
	{
		if(!this.pilha1Vazia()) {
			System.out.println("\nPilha 01:");
			for(int i=0; i<=topo1;i++)
				System.out.println(vetor[i]);
		}
		else 
			System.out.println("\nPilha 01 Vazia");

		
		if(!this.pilha2Vazia()) {
			System.out.println("\nPilha 02:");
			for(int i=n-1; i>=topo2;i--)
				System.out.println(vetor[i]);
		}
		else 
			System.out.println("\nPilha 02 Vazia");

	}
	
	public boolean pilhaDuplaCheia()
	{
		return (topo1 + 1) == topo2 ? true : false;
	}
	
	public boolean pilha1Vazia()
	{
		return (topo1 == -1) ? true : false;
	}
	
	public boolean pilha2Vazia()
	{
		return (topo2 == n) ? true : false;
	}
	
	public boolean pilha1Cheia()
	{
		return (topo1 == n - 1) ? true : false;
	}
	
	public boolean pilha2Cheia()
	{
		return (topo2 == -1) ? true : false;
	}

	public char retornaTopo1()
	{
		char elemento = '\0';

		if(!this.pilha1Vazia())
		{
			elemento = vetor[topo1];         
		}
		else
		{
			System.out.println("Pilha 01 vazia.");
		}

		return elemento;
	}
	
	public char retornaTopo2()
	{
		char elemento = '\0';

		if(!this.pilha2Vazia())
		{
			elemento = vetor[topo2];         
		}
		else
		{
			System.out.println("Pilha 02 vazia.");
		}

		return elemento;
	}
	
	public char popPilha1()
	{
		char c = '\0';
		
		if (!this.pilha1Vazia())
		{
			c = vetor[topo1];
			
			topo1--;
		}
		else
		{
			//Impress�o para fins didaticos
			System.out.println("Pilha 01 vazia: pop nao funcionou.");
		}
		
		return c;
	}
	
	public char popPilha2()
	{
		char c = '\0';
		
		if (!this.pilha2Vazia())
		{
			c = vetor[topo2];
			
			topo2++;
		}
		else
		{
			//Impress�o para fins didaticos
			System.out.println("Pilha 02 vazia: pop nao funcionou.");
		}
		
		return c;
	}
	
	public boolean pushPilha1(char elemento)
	{
		if (!this.pilhaDuplaCheia())
		{
			vetor[++topo1] = elemento;
			return true;
		}
		else
		{
			//Impress�o para fins did�ticos
			System.out.println("Pilha 01 cheia: push nao funcionou.\n");
			return false;
		}
	}
	
	public boolean pushPilha2(char elemento)
	{
		if (!this.pilhaDuplaCheia())
		{
			vetor[--topo2] = elemento;
			return true;
		}
		else
		{
			//Impress�o para fins did�ticos
			System.out.println("Pilha 02 cheia: push nao funcionou.\n");
			return false;
		}
	}
	
}