import java.util.Scanner;

public class OperadorEComNumero {

	public static void main(String[] args) {
		/*Fa�a um programa que verifique se o usu�rio digitado � igual a 'administrador' e se a senha digitada � igual a '123'*/
		Scanner leitor = new Scanner(System.in);
		String usuario;
		int senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username:");
		usuario = leitor.next();
		System.out.println("Por favor, digite sua senha:");
		senha = leitor.nextInt();	
		//Aqui � preciso criar um if que verifique as duas condi��es para o login ser bem sucedido
		//equalsIgnoreCase ele ignora se o compo de compara��o tem letras maiusculas ou nao
		if (usuario.equalsIgnoreCase("administrador") && senha == 123) {
			System.out.println("login realizado com sucesso");
		} else {
			System.out.println("Usu�rio e senha incorreto");
		}
		
		
		leitor.close();

	}

}
