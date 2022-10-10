package classes;

public class Refrigerante {

	private double valor;
	private TipoRefrigerante tipo;
	private int quantidade;
	public Refrigerante( double valor, TipoRefrigerante tipo, int quantidade) {
		this.valor = valor;
		this.tipo = tipo;
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		 this.quantidade = quantidade;
	}
	
	public TipoRefrigerante gettipo() {
		return tipo;
	}
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
