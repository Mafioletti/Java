package exemplos;

public class pix extends pagamento{
	//subclasse 2
	private String chavePix;

	public pix(String titular, double valor, String chavePix) {
		super(titular, valor);
		this.chavePix = chavePix;
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("PROCESSANDO CARTÃO DE CRÉDITO");
		System.out.println("Titular: " + getTitular());// get pq está no private
		System.out.println("Valor: " + String.format("%.2f", getValor()));
		System.out.println("Chave PIX: "+ chavePix);
		System.out.println("Taxa: R$" + String.format("%.2f", calcularTaxa()));
		System.out.println("Total: R$" + String.format("%.2f", getValor() + calcularTaxa()));
		System.out.println("Tranferência PIX realizada");
	}
	
	@Override
	public double calcularTaxa() {
		return 0.0; // pix sem taxa
	}
}
