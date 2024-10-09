package questao05;

public class Pilha
{
	private int n;
	private char vetor[];
	private int topo;
	
	public Pilha()
	{
		n = 10;
		vetor = new char[n];
		topo = -1;
	}
	
	public Pilha(int tamanho)
	{
		n = tamanho;
		vetor = new char[tamanho];
		topo = -1;
	}
	
	public boolean vazia()
	{
		return topo == -1 ? true : false;
	}
	
	public boolean cheia()
	{
		return topo == n - 1 ? true : false;
	}
	
	public char pop()
	{
		char c = '\0';
		
		if (!this.vazia())
		{
			c = vetor[topo];
			
			//Decrementando o topo, o elemento � "removido"
			topo--;
		}
		else
		{
			//Impress�o para fins did�ticos
			System.out.println("Pilha vazia: pop n�o funcionou.");
		}
		
		return c;
	}
	
	public boolean push(char elemento)
	{
		if (!this.cheia())
		{
			vetor[++topo] = elemento;
			return true;
		}
		else
		{
			//Impress�o para fins did�ticos
			System.out.println("Pilha cheia: push n�o funcionou.\n");
			return false;
		}
	}
	
	public char retornaTopo()
	{
		char elemento = '\0';

		if(!this.vazia())
		{
			elemento = vetor[topo];         
		}
		else
		{
			System.out.println("Pilha vazia.");
		}

		return elemento;
	}
	
	public boolean verificaBalanceamento(String s) {
		
		if(s.isEmpty())
			return false;

		char elemento = '\0';
		
		for(int i = 0;i<s.length();i++) {
			
			elemento = s.charAt(i);
			
			if(elemento == '{' || elemento == '[' || elemento == '(')
				this.push(elemento);
			
			if(elemento == '}') {
				if(this.vazia())
					return false; // caso a pilha não contenha nenhum  parênteses, colchetes e chaves
				else {
					if(this.pop() != '{')
						return false;
				}
				
			}
			else if(elemento == ']') {
				if(this.vazia())
					return false; // caso a pilha não contenha nenhum  parênteses, colchetes e chaves
				else {
					if(this.pop() != '[')
						return false;
				}
				
			}
			else if(elemento == ')') {
				if(this.vazia())
					return false; // caso a pilha não contenha nenhum  parênteses, colchetes e chaves
				else {
					if(this.pop() != '(')
						return false;
				}
				
			}
		
		}		
		
		return this.vazia() ? true : false;
		
	}
}