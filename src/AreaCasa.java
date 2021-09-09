import java.util.Scanner;

public class AreaCasa {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String nome, desejo = "S";
		double largura, comprimento, areaComodo = 0, areaTotal = 0;

		while (desejo.equals("S") || desejo.equals("s")) {

			System.out.println("Qual é o nome do cômodo?");
			nome = leitor.next();
			System.out.println("Qual a largura?");
			largura = leitor.nextDouble();
			System.out.println("Qual o comprimento?");
			comprimento = leitor.nextDouble();

			areaComodo = largura * comprimento;

			System.out.println("A largura do(a) " + nome + " é: " + areaComodo + " metros quadrados.");

			System.out.println("Você deseja incluir mais cômodos? (S ou N)");
			desejo = leitor.next();
			System.out.println();
			areaTotal = areaComodo + areaTotal;
		}
		leitor.close();

		System.out.println("-------------------------------------------------------------------");
		System.out.println("A área total dos cômodos listados é: " + areaTotal + " metros quadrados.");
	}

}