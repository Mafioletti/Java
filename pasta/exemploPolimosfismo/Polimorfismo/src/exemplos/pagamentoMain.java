package exemplos;
import java.util.*;

public class pagamentoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String enter;

		
		ArrayList<pagamento> pagamentos = new ArrayList<>();
		
		int opcao;
		
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1. Pagar com cartão de crédito");
			System.out.println("2. Pagar com PIX");
			System.out.println("3. Pagar com boleto");
			System.out.println("4. Listar todos os pagamentos");
			System.out.println("5. Calcular total das taxas");
			System.out.println("0. Sair");
			
			System.out.println("Escolha uma opcão");
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
				case 1:
					System.out.println("Pagamento com CARTÃO");
					System.out.println("Titular: ");
					String titularCartao = sc.nextLine();
					
					System.out.println("Valor: ");
					double valorCartao = sc.nextDouble();
					sc.nextLine();
					
					System.out.println("Número do cartão: ");
					String numeroCartao = sc.nextLine();
					
					//classe pai - Tipo pai e Objeto classe filha
					pagamento pagCartao = new cartaoCredito(titularCartao, valorCartao, numeroCartao);
					pagCartao.processarPagamento();
					pagamentos.add(pagCartao);
					System.out.println("Digite ENTER para continuar");
					enter = sc.nextLine();
					break;
					
				case 2:
					System.out.println("Pagamento com PIX");
					System.out.println("Titular: ");
					String titularPIX = sc.nextLine();
					
					System.out.println("Valor: ");
					double valorPIX = sc.nextDouble();
					sc.nextLine();
					
					System.out.println("Número do cartão: ");
					String chaveDoPix = sc.nextLine();
					
					//classe pai - Tipo pai e Objeto classe filha
					pagamento pagPix = new pix(titularPIX, valorPIX, chaveDoPix );
					pagPix.processarPagamento();
					pagamentos.add(pagPix);
					break;
				case 3:
					System.out.println("\n--- PAGAMENTO COM BOLETO ---");
                    System.out.print("Nome do titular: ");
                    String titularBoleto = sc.nextLine();
                    
                    System.out.print("Valor: R$ ");
                    double valorBoleto = sc.nextDouble();
                    sc.nextLine();
                    
                    System.out.print("Código de barras: ");
                    String codigoBarras = sc.nextLine();
                    
                    // POLIMORFISMO: Tipo Pagamento, objeto Boleto
                    pagamento pagBoleto = new boleto(titularBoleto, valorBoleto, codigoBarras);
                    pagBoleto.processarPagamento(); // ← Chama método de Boleto!
                    pagamentos.add(pagBoleto);
                    break;
				case 4: 
                    if (pagamentos.isEmpty()) {
                        System.out.println("\nNenhum pagamento realizado ainda!");
                    } else {
                        System.out.println("\n═══ TODOS OS PAGAMENTOS ═══");
                        for (int i = 0; i < pagamentos.size(); i++) {
                            System.out.println("\n--- Pagamento #" + (i + 1) + " ---");
                            // POLIMORFISMO EM AÇÃO!
                            // Cada objeto chama SUA versão do método!
                            pagamentos.get(i).processarPagamento();
                        }
                    }
                    break;
				case 5: 
                    if (pagamentos.isEmpty()) {
                        System.out.println("\nNenhum pagamento realizado ainda!");
                    } else {
                        double totalTaxas = 0;
                        System.out.println("\n═══ TAXAS POR PAGAMENTO ═══");
                        for (int i = 0; i < pagamentos.size(); i++) {
                            // POLIMORFISMO EM AÇÃO!
                            // Cada classe calcula sua taxa de forma diferente!
                            double taxa = pagamentos.get(i).calcularTaxa();
                            totalTaxas += taxa;
                            System.out.println("Pagamento #" + (i + 1) + ": R$ " + 
                                             String.format("%.2f", taxa));
                        }
                        System.out.println("\nTOTAL DE TAXAS: R$ " + 
                                         String.format("%.2f", totalTaxas));
                    }
                    break;
				case 0:
	                   
                    System.out.println("Sistema encerrado!");
                    break;
                
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
			
		}while(opcao != 0);
	}
}
