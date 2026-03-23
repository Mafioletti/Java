package exemplos;

public class pagamento {
	private String titular;
	private double valor;
	
	public pagamento(String titular, double valor) {
		this.titular = titular;
		this.valor = valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	// Método - Subclasses vão sobrescrever
	
	public void processarPagamento() {
		System.out.println("PROCESSANDO PAGAMENTO");
		System.out.println("Titular: " + titular);
		System.out.println("Valor: " + String.format("%.2f", valor));
		System.out.println("Pagamento Processado!");
	}
	
	//Método - subclasses vão sobrescrever
	public double calcularTaxa() {
		return valor * 0.02;
	}
	
	public void exibirDados() {
		System.out.println("Titular: " + titular);
		System.out.println("Valor: "+ String.format("%.2f", valor));
	}
}
