package Atv1;

public class classeCliente {
	
	private String nome;
	private String endereco;
	private int idade;
	private String email;
	private String nacionalidade;
	
	public classeCliente(String nome, String endereco, int idade, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.email = email;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void mostrarinfo() {
		System.out.println("\n"+nome+" mora na Rua: "+endereco+" tem "+idade+" ano(S) e seu endereço de email é: "+email+" e nasceu no "+nacionalidade);
	}
	
	

}
