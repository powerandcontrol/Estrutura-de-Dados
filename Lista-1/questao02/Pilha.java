package questao02;

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
			
			//Decrementando o topo, o elemento é "removido"
			topo--;
		}
		else
		{
			//Impressão para fins didáticos
			System.out.println("Pilha vazia: pop não funcionou.");
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
			//Impressão para fins didáticos
			System.out.println("Pilha cheia: push não funcionou.\n");
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
	
	public boolean verificaString(String s) 
	{
		Pilha p = new Pilha(s.length());
		
		int len = s.length();
		char c;
		
		// AABCBBA 
		// A entrada precisa ser ímpar para ter um "meio"
		
		if(len%2!=1) 
			return false;
		
		
		for(int i=0;i<len;i++){

			if(i<len/2){

				if (s.charAt(i) != 'A' && s.charAt(i) != 'B')
					return false;

				else if(i == len/2 && s.charAt(i) != 'C')
					return false;

				else
					p.push(s.charAt(i));
			
			} else if (i>len/2){

				if (s.charAt(i) != 'A' && s.charAt(i) != 'B')
					return false;
				
				else
					c = p.pop();
				
				if (c!=s.charAt(i))
					return false;

			}
				
			}


			return true;
	}
	
	public boolean verificaCadeia(String s) {
		
		Pilha p = new Pilha(s.length());

		int len = s.length();
		char c;
		
		if(len%2!=1) 
			return false;
		
		boolean empilha = true;

        for (int i = 0; i < s.length(); i++) {
        	
        	c = s.charAt(i);
        	
        	if(c == 'A' || c == 'B') {
        		
        		if(empilha)
        			p.push(c);
        		
        		else {
        			if(c != p.pop())
        				return false;
        		}
        		
        	} else if(c =='C')
    			empilha = false;
        	
        	else if(c == 'D') {
        			if(p.vazia()) {
        				empilha = true;
        			}
        			else
        				return false;
        		}
        		else if(c != 'A' || c != 'B' || c != 'C' || c != 'D')
        			return false;
        		
        	}        	
      
		return true;
		
	}
	
}