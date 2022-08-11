package entities;

public class Carro {

	private int ano;
	private String modelo;
	private String cor;
	private String tipo;
	private char cambio;
	private String combustivel;
	private int valor;
	private String km;
	
	public Carro () {
		
	}
	public Carro(int ano, String modelo, String cor, String tipo, char cambio, String combustivel, int valor, String km) {
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
		this.tipo = tipo;
		this.combustivel = combustivel;
		this.valor = valor;
		this.km = km;
	}
		
			
	public int getAno() {
		return ano;
	}
	public void setAno(int i) {
		this.ano = i;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public char getCambio() {
		return cambio;
	}
	public void setCambio(char cambio) {
		this.cambio = cambio;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	

}
