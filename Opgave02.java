public class Opgave02{

	public Opgave02(int max){
		System.out.println("Opgave 2 - Lige numre:");
		printEvenNumbers(max);
	}

	private void printEvenNumbers(int number){
		for(int i=2;i<=number;i++){
			if(i%2==0){
				System.out.printf("{%d} ",i);
			}
		}
		System.out.println("");
	}
}
