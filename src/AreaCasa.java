import java.util.Scanner;

public class AreaCasa {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String nome, desejo = "S";
		double largura, comprimento, areaComodo = 0, areaTotal;
		
		
		while(desejo.equals("S") || desejo.equals("s")) {
		
		System.out.println("Qual � o nome do c�modo?");
		nome = leitor.next();
		System.out.println("Qual a largura?");
		largura = leitor.nextDouble();
		System.out.println("Qual o comprimento?");
		comprimento = leitor.nextDouble();
		
		areaComodo = largura * comprimento;
		
		
		System.out.println("A largura do(a) " + nome + " �: " + areaComodo);
		
		System.out.println("Voc� deseja incluir mais c�modos?");
		desejo = leitor.next();
		System.out.println();
	 areaTotal = areaComodo + areaComodo;
		}
		
		
		System.out.println(areaComodo);
	
	}

}
