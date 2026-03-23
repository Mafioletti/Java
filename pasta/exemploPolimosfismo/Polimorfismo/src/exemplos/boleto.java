package exemplos;

public class boleto extends pagamento{
	//Subclasse 3
	private String codigoBarras;

	public boleto(String titular, double valor, String codigoBarras) {
		super(titular, valor);
		this.codigoBarras = codigoBarras;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("PROCESSANDO CARTÃO DE CRÉDITO");
		System.out.println("Titular: " + getTitular());// get pq está no private
		System.out.println("Valor: " + String.format("%.2f", getValor()));
		System.out.println("Boleto: " + codigoBarras);
		System.out.println("Taxa: R$" + String.format("%.2f", calcularTaxa()));
		System.out.println("Total: R$" + String.format("%.2f", getValor() + calcularTaxa()));
		System.out.println("Boleto Gerado !\nVencimento: 3 dias");
	}
	
	@Override
	public double calcularTaxa() {
		return 2.50;//taxa fixa de R$ 2,50 
	}
}
