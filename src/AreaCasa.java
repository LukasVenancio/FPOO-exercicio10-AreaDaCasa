import java.util.Scanner;

public class AreaCasa {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String nome, desejo = "S";
		double largura, comprimento, areaComodo = 0, areaTotal = 0;

		while (desejo.equals("S") || desejo.equals("s")) {

			System.out.println("Qual � o nome do c�modo?");
			nome = leitor.next();
			System.out.println("Qual a largura?");
			largura = leitor.nextDouble();
			System.out.println("Qual o comprimento?");
			comprimento = leitor.nextDouble();

			areaComodo = largura * comprimento;

			System.out.println("A largura do(a) " + nome + " �: " + areaComodo + " metros quadrados.");

			System.out.println("Voc� deseja incluir mais c�modos? (S ou N)");
			desejo = leitor.next();
			System.out.println();
			areaTotal = areaComodo + areaTotal;
		}
		leitor.close();

		System.out.println("-------------------------------------------------------------------");
		System.out.println("A �rea total dos c�modos listados �: " + areaTotal + " metros quadrados.");
	}

}