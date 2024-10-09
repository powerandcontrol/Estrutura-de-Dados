package questao04;

import java.util.Scanner;

import pilhagenerica_teste.PilhaGenerica;

public class MainPilha {
    public static void main(String[] args) {

    	PilhaGenerica<Integer> pilha = new PilhaGenerica<>(20);

        for (int i = 1; i <= 20; i++) {
            pilha.push(i);
        }

        System.out.println("Elementos da pilha após inserção:");
        pilha.imprimirElementos();

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número entre 1 e 20 para remover da pilha: ");
        int n = scanner.nextInt();

        if (pilha.removerElemento(n)) {
            System.out.println("Número " + n + " removido com sucesso.");
        } else {
            System.out.println("Número " + n + " não encontrado na pilha.");
        }

        System.out.println("\nElementos da pilha após a remoção:");
        pilha.imprimirElementos();

        scanner.close();
    }
}
