public class Opgave04{

	public Opgave04(int first){
		System.out.println("Opgave 4 - Summen af en int:");
		System.out.println(sumDigits(first));
	}

	private int sumDigits(int number){
		int result = 0;
		
		while(number > 0) {
			result += number % 10;
			number /= 10;
		}
		
		return result;
	}
}
