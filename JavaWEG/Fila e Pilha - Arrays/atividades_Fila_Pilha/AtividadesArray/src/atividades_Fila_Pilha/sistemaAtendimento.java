package atividades_Fila_Pilha;
import java.util.Queue;
import java.nio.file.spi.FileSystemProvider;
import java.util.LinkedList;
import java.util.Scanner;

public class sistemaAtendimento {

	public static void main(String[] args) {
		Queue <String> fila = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("==MENU==");
			System.out.println("1. Add paciente");
			System.out.println("2. Atender Paciente");
			System.out.println("3. Ver próximo paciente");
			System.out.println("4. Mostrar fila");
			System.out.println("5. Sair");
			System.out.println("");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do paciente: ");
				String nomePaciente = sc.next();
				fila.add(nomePaciente);
				break;
			case 2:
				System.out.println("Paciente Atendido!");
				fila.poll();
				break;
			case 3:
				if(fila.isEmpty()) {
					System.out.println("Não tem ninguém na fila");
				} else {
					System.out.println("O próximo da fila é: ");
					System.out.println(fila.peek());
				}
				break;
			case 4:
				if(fila.isEmpty()) {
					System.out.println("Não tem ninguém na fila");
				} else {
					System.out.println("Fila atual: ");
					System.out.println(fila);
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
