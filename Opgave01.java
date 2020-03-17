public class Opgave01{

	public Opgave01(int first, int second, int third){
		System.out.println("Opgave 1 - Mindste værdi:");
		System.out.println(min(first,second,third));
	}

	private int min(int first, int second, int third){
		return Math.min(Math.min(first,second),third);
	}
}
