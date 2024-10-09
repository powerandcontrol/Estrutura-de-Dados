
package questao08;

public class Pilha
{
	private int n;
	private int vetor[];
	private int topo;
	
	public Pilha()
	{
		n = 10;
		vetor = new int[n];
		topo = -1;
	}
	
	public Pilha(int N)
	{
		n = N;
		vetor = new int[n];
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
	
	public int pop()
	{
		int c = -1;
		
		if (!this.vazia())
		{
			c = vetor[topo];
			
			//Decrementando o topo, o elemento  "removido"
			topo--;
		}
		else
		{
			//Impressao para fins didaticos
			System.out.println("Pilha vazia: pop nao funcionou.");
		}
		
		return c;
	}
	
	public boolean push(int elemento)
	{
		if (!this.cheia())
		{
			vetor[++topo] = elemento;
			return true;
		}
		else
		{
			//Impressao para fins didaticos
			System.out.println("Pilha cheia: push nao funcionou.\n");
			return false;
		}
	}
	
	public int retornaTopo()
	{
		int elemento = -1;

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
	/*
    public void subsequencias() {      
    	
        for (int i = 1; i <= this.n; i++) {
            for (int j = i; j <= this.n; j++) {
                this.push(j); 
                imprimirPilha(); 
            }

            while (!this.vazia()) {
                this.pop();
            }
        }
    }

    private void imprimirPilha() {
        for (int k = 0; k <= topo; k++) {
            System.out.print(vetor[k] + " ");
        }
        System.out.println();

    }*/
    
    public void paresUnicos() {
    	 for (int i = 1; i <= this.n; i++)
    		 this.push(i);
    	 
    	 int a = 0, b = 0;
    	 
    	 while(!this.vazia()) {
    		 a = this.pop();
    		 
    		 if(a==1)
    			 break;
    		 
    		 b = this.pop();
    		 
    		 if(a>b && a!=b) {
    			 System.out.println("("+a+","+b+")");
    		 	 this.push(b);
    		 }
    		 
    		 
    	 }
    	 

    }
	
	
}