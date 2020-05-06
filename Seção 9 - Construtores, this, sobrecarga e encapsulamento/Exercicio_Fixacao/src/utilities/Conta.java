package utilities;

public class Conta {
	
	
	private int id;
	private String nome;
	private double saldo;
	
	public Conta (int id, String nome, double saldo){
		this.id = id;
		this.nome = nome;
		depositar(saldo);
	}
	
	public Conta (int id, String nome){
		this.id = id;
		this.nome = nome;
		
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -=valor+5;
	}

	public String toString() {
		return "Account " + 
				getId() + 
				", Holder: " +
				getNome() + 
				", Balance: $ " + 
				String.format("%.2f", saldo);
	}
}
