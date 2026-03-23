package exemplos;

public class cartaoCredito extends pagamento{
	//Subclasse 1
	private String numeroCartao;

	public cartaoCredito(String titular, double valor, String numeroCartao) {
		super(titular, valor);
		this.numeroCartao = numeroCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	//Polimorfismo: Sobrescrita do Método processarPagamento
	@Override
	public void processarPagamento() {
		System.out.println("PROCESSANDO CARTÃO DE CRÉDITO");
		System.out.println("Titular: " + getTitular());// get pq está no private
		System.out.println("Valor: " + String.format("%.2f", getValor()));
		System.out.println("Cartão: **** **** **** " + 
				numeroCartao.substring(numeroCartao.length() -4));
		System.out.println("Taxa: R$" + String.format("%.2f", calcularTaxa()));
		System.out.println("Total: R$" + String.format("%.2f", getValor() + calcularTaxa()));
		System.out.println("Pagamento com cartão Aprovado");
	}
	//Polimorfismo
	@Override
	public double calcularTaxa() {
		return getValor() * 0.03;
	}
	
}
