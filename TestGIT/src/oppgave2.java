import java.util.Scanner;

public class oppgave2 {

	public static void main(String[] args) {
		// Bean machine
		
		//Lage scanner
		Scanner input = new Scanner(System.in);
		
		int slot_Number;
		
		int ball = Ball_Number();
		
		int slot = Slot_Number();
		int [] slots = new int[slot];
		
		for(int i = 0;i < ball;i++){
			slot_Number = direction(slot);
			
			for(int n = 0;n < slot;n++){
				if(slot_Number == n) {
					slots[n]++;
				}
			}
		}
		printDisplayBalls(slots);
	}

	private static void DisplayBalls(int ball, int[] slots) {
		// 
		
	}

	public static int Ball_Number () {
		//Lage scanner 
		Scanner input = new Scanner(System.in);

		//La brukeren bestemme antall baller.
		System.out.print("Enter the number of balls to drop");

		int balls = input.nextInt();

		//Return the value back to the main method
		return balls;
	}
	public static int Slot_Number () {
		//Lage scanner
		Scanner input = new Scanner(System.in);

		//La brukeren bestemme posisjon.
		System.out.print("Enter the number of slots to drop");

		int slots = input.nextInt();

		//Returnerer verdien over til hovedmetoden
		return slots;
}
	public static int direction(int slots){
		int direction;
		int right = 0;

		for(int i = 1; i <= slots; i++) {
			direction = (int)(Math.random() * 2);

			if(direction==0){
				System.out.print("L");
			}
			else{
				System.out.print("R");
				right++;
			}
		}
		System.out.println();


		return right;
    }

	public static void printDisplayBalls(int[] slots) {
		int maxSlotHeight = max(slots);
		int i, j;
		System.out.println();
		for (i = maxSlotHeight; i > 0; i--) {
			for (j = 0; j < slots.length; j++)
				if (slots[j] >= i)
					System.out.print(" O ");
				else
					System.out.print("   ");
			System.out.println();
		}

	}

	public static int max(int[] slots) {
		int result = slots[0];
		int i;
		for (i = 1; i < slots.length; i++)
			if (slots[i] > result)
				result = slots[i];
		return result;
	}
}
