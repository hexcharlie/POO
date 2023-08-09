package Atv2;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	private double aumento;
	
	public Funcionario(String nome, int idade, String cargo, double salario, double aumento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.aumento = aumento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getAumento() {
		return aumento;
	}

	public void setAumento(double aumento) {
		this.aumento = aumento;
	}
	
	public void aplicarAumento() {
	    double adicao = salario * (aumento / 100);
	    salario += adicao;
	}
	
	public void mostrarinf() {
		System.out.println("\nNome:"+nome+"\nIdade: "+idade+"\nCargo: "+cargo+"\nSalario: "+salario+"\nAumento: "+aumento);
	}
	 

}
