import java.util.Scanner;
public class Saudacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String nome;
		System.out.println("Insira o nome!");
		nome = leitor.next();
		System.out.println("O nome digitado foi " + nome);
		leitor.close();

	}

}
