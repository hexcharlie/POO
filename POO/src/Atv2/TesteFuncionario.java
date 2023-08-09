package Atv2;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario[] nome = new Funcionario[2];
		
		nome[0] = new Funcionario("Maria",25,"Gerente",2000.80,10);
		nome[1] = new Funcionario("José",32,"CEO",50000,25);		
		
		
		for(Funcionario roda:nome) {
			  roda.mostrarinf();
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		for(Funcionario roda:nome) {
			roda.aplicarAumento();
			roda.mostrarinf();
			
		}

	}

}
