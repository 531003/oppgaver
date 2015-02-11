import java.util.Scanner;

public class Oppgave4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, sum;
		
		System.out.println("Gi inn et tall : ");
		number = input.nextInt();
		sum = 1;
		for (int i = 2; i <= number; i++)
			sum = sum + i;
		
		System.out.print("Summen av tallene fra 1 til " + number + " er "+ sum);
	}

}
