import java.util.InputMismatchException;
import java.util.Scanner;



public class Oppgave3 {

	public static void main(String[] args) {
		char [][] brett = new char [3][3];
		int spiller = 0;
		
		while(uavgjort(brett) == false || harVunnet(brett) == false) {
			printBrett(brett);
			plassereMarkor(brett, getInput(brett, 'X'), 'X');
			if(uavgjort(brett) == true || harVunnet(brett) == true)
				break;
			spiller++;
			printBrett(brett);
			plassereMarkor(brett, getInput(brett, 'O'), 'O');
			if(uavgjort(brett) == true || harVunnet(brett) == true)
				break;
			spiller++;
		}
		
		printBrett(brett);
		if(harVunnet(brett))
			System.out.printf("Spiller %c har vunnet!", spiller % 2 == 0 ? 'X' : 'O');
		else
			System.out.println("Spillet er uavgjort!");
		
	}
	
	public static void printBrett(char[][] brett) {
		for(int i = 0; i < brett.length; i++) {
				System.out.println("-------------");
				System.out.printf("| %c | %c | %c |\n", brett[i][0], brett[i][1], brett[i][2]);
		}
		System.out.println("-------------");
	}
	
	public static int[] getInput(char[][] brett, char bruker) {
		Scanner scan = new Scanner(System.in);
		int[] koordinater = new int[2];
		int temp = 0;
		
		while (temp < 1 || temp > 3) {
			System.out.printf("Skriv inn radnummer (1, 2 eller 3) for spiller %c: ", bruker);
		try {
				temp = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.next();
			}
		}
		koordinater[0] = temp-1;
		temp = 0;
		
		while (temp < 1 || temp > 3) {
		System.out.printf("Skriv inn kolonnenummer (1, 2 eller 3) for spiller %c: ", bruker);
		try {
				temp = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.next();
			}	
		koordinater[1] = temp-1;
		}
		
		return koordinater;
	}
	
	public static void plassereMarkor(char [][] brett, int [] kord, char spiller){
		while(brett[kord[0]][kord[1]] != '\u0000')
			kord = getInput(brett, spiller);
		
		brett[kord[0]][kord[1]] = spiller;
	}
	
	public static boolean uavgjort(char[][] brett) {
		boolean[] rader = new boolean[3];
		
		for(int i =0; i < brett.length; i++)
			if(brett[i][0] != '\u0000' && brett[i][1] != '\u0000' && brett[i][2] != '\u0000')
				rader[i] = true;
		if(rader[0] && rader[1] && rader[2])
			return true;
		return false;
	}
	
	public static boolean harVunnet(char[][] brett) {
		for(int i =0; i < brett.length; i++)
			if(brett[i][0] != '\u0000' && brett[i][0] == brett[i][1] && brett[i][0] == brett[i][2])
				return true;
		for(int i =0; i < brett.length; i++)
			if(brett[0][i] != '\u0000' && brett[0][i] == brett[1][i] && brett[0][i]== brett[2][i])
				return true;
		if(brett[0][0] != '\u0000' && brett[0][0] == brett[1][1] && brett[0][0]== brett[2][2])
			return true;
		if(brett[0][2] != '\u0000' && brett[0][2] == brett[1][1] && brett[0][2]== brett[2][0])
			return true;
		
		return false;
	}
		
}