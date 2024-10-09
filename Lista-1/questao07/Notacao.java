package questao07;

public class Notacao {
	PilhaGenerica<Character> operadores;
	PilhaGenerica<Integer> operandos;
	private String notacao;
	
	public Notacao(String s) {
		notacao = s;
		operadores = new PilhaGenerica<Character>(notacao.length());
		operandos = new PilhaGenerica<Integer>(notacao.length());
	}
	
	public boolean interpretaNotacao() {
		
		if(this.notacao.isEmpty())
			return false;
		
		char elemento = '\0';
		char operador = '\0';
		int operando1 = 0;
		int operando2 = 0;
		
		for(int i=0; i<this.notacao.length();i++) {
			elemento = notacao.charAt(i);
			
			
			if(elemento == ' ') 
				continue;
			
			if(elemento == '(') 
				continue;
			
			if(Character.isDigit(elemento)) 
				operandos.push(Character.getNumericValue(elemento));
			
			else if(elemento == '+' || elemento == '-' || elemento == '/' || elemento == '*')
				operadores.push(elemento);
			
			else if(elemento == ')') {
				
				if(operadores.vazia() || operandos.vazia())
					return false;

				operador = operadores.pop();
				operando1 = operandos.pop();
				operando2 = operandos.pop();
				
				int res = 0;
				
				switch(operador) {
				case '+':
					res = operando1 + operando2;
					break;
					
				case '-':
					res = operando1 - operando2;
					break;
					
				case '/':
					if(operando1==0 || operando2==0) {
						res = 0;
						break;
					}
					else {
						res = operando1 / operando2;
						break;
					}
					
				case '*':
					res = operando1 * operando2;
					break;
				}
				
				//System.out.println(operando1 + " + " + operando2 + " = " + res);
				
				operandos.push(res);
			
				
			}
			
			else 
				return false;
			
			
		}
		
		if(operandos.vazia()) return false;
		else return true;
	}
	
	public Integer resultado()
	{
	      return this.operandos.pop();
	}	
}
