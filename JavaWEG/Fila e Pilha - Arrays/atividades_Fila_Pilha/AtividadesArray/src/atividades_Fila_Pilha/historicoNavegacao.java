package atividades_Fila_Pilha;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class historicoNavegacao {

	public static void main(String[] args) {
		Deque <Integer> pilha = new ArrayDeque<>();
			Scanner sc = new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("==MENU==");
			System.out.println("1. Acessar Página");
			System.out.println("2. Voltar");
			System.out.println("3. Pagina Atual");
			System.out.println("4. Histórico");
			System.out.println("5. Sair");
			System.out.println("");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Página a ser acessada: ");
				pilha.push(sc.nextInt());
				break;
			case 2:
				if(pilha.isEmpty()) {
					System.out.println("Não está em nenhuma página");
				} else {
					System.out.println("Voltando Página !");
					pilha.pop();
					}
					break;
			case 3:
				if(pilha.isEmpty()) {
					System.out.println("Não está em nenhuma página");
				} else {
					System.out.println("Página Atual: ");
					System.out.println(pilha.peek());
				}
				break;
			case 4:
				if(pilha.isEmpty()) {
					System.out.println("Histórico vazio");
				} else {
					System.out.println("Histórico atual: ");
					System.out.println(pilha);
				}
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida");
		}
			
		}while(opcao != 5);
	}
}
