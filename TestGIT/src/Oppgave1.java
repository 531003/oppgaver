//Oppgave 1: 

public class Oppgave1 {

	public static void main(String[] args) {
        //Her skriver vi inn koden for array og hva vi skal få ut
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 0, 0 };
		System.out.println("Forskjell største / minste = "
				+ arrayInfo(arr, 8, 1));
		System.out.println("Sum = " + arrayInfo(arr, 8, 2));
		System.out.println("Snitt = " + arrayInfo(arr, 8, 3));
       
	}
	
	public static double arrayInfo (int array[], int elements, int answers){
		double result = 0; 
		switch (answers) {
		case 1:
			
			int checkMin = 10;
			int checkMax = 0;
			
			for (int i = 0; i < elements; i++) {
				
				if (checkMin > array[i]) 
				checkMin = array[i];
				if (checkMax < array[i])
				checkMax = array[i];
			}
			
			result = checkMax - checkMin;
			
			break;
			
		case 2:
			//Sjekker summen av alle tallene i arrayet
			for (int i = 0; i < elements; i++) {
				result += array[i];
				
			}
			
			break;
			
		case 3:
			// Vi finner gjennomsnittet, summerer alt og deler på elementene
			double sum = 0;
			for (int i = 0; i < elements; i++) {
				sum += array[i];
			}
			
			result = sum / elements;
	
			break;

		default:
			break;
		}
		return result;
		
	
	}
}
