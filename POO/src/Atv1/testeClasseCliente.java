package Atv1;

public class testeClasseCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classeCliente nome1 = new classeCliente("Pedro Pascal","Rua Daddy, 119",48,"pedro@gmail.com","Chile");
		classeCliente nome2 = new classeCliente("Oscar Isaac","Rua Daddy, 223",44,"oscar@gmail.com","Guatemala");
		
		System.out.println("\nDados do cliente 1: ");
		nome1.mostrarinfo();
		System.out.println("\nDados do cliente 2: ");
		nome2.mostrarinfo();
		
	}

}
