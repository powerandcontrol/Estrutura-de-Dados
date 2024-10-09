package questao04;

import java.util.Vector;

public class PilhaGenerica<T>
{
	private int n;
	private Vector<T> vetor;
	private int topo;
	
	public PilhaGenerica(int tamanho)
	{		
		n = tamanho;
		vetor = new Vector<T>(tamanho);
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
	
	public T pop()
	{
		T elemento;
		
		if (!this.vazia())
		{
			elemento = vetor.get(topo--);
			return elemento;
		}
		else
		{
			//Impress�o para fins did�ticos
			System.out.println("Pilha vazia: pop nao funcionou.");
			return null;
		}
	}
	
	public boolean push(T elemento)
	{
		if (!this.cheia())
		{
			vetor.add(++topo, elemento);
			return true;
		}
		else
		{
			//Impress�o para fins did�ticos
			System.out.println("Pilha cheia: push nao funcionou.\n");
			return false;
		}
	}
	
	public boolean retornaTopo(T elemento)
	{
	     if(!this.vazia()){
	        elemento = vetor.get(topo);         
	        return true;
	     }
	     else
	    	 return false;
	}	
	
	public boolean removerElemento(T elemento)
	{
		PilhaGenerica<T> pilhaAux = new PilhaGenerica<>(this.n);
		T c;
		
		boolean foiEncontrado = false;
	    
	    while (!foiEncontrado) {
	        c = this.pop();
	        
	        if (c.equals(elemento)) 
	            foiEncontrado = true; 
	        
	        else 
	            pilhaAux.push(c); 
	        
	    }

	    while (!pilhaAux.vazia()) {
	        this.push(pilhaAux.pop());
	    }
	    
	    return foiEncontrado;
	}
	
	public void imprimirElementos()
	{
		PilhaGenerica<T> pilhaAux = new PilhaGenerica<>(this.n);
	    T c;

		if(!this.vazia()) {
		    while (!this.vazia()) {
		        c = this.pop();
		        System.out.println(c); 
		        pilhaAux.push(c); 
		    }
		}
		
		 while (!pilhaAux.vazia()) {
		        this.push(pilhaAux.pop());
		    }
	}

}