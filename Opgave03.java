public class Opgave03{

	public Opgave03(int first, int second, int third){
		System.out.println("Opgave 3 - Mindst absolute værdi:");
		System.out.println(smallestAbsVal(first,second,third));
	}

	private int smallestAbsVal(int first, int second, int third){
		return Math.min(Math.min(Math.abs(first),Math.abs(second)),Math.abs(third));
	}
}
