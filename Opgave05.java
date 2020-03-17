public class Opgave05{

	public Opgave05(String text){
		reverseVertical(text);
	}

	private void reverseVertical(String s){
		for(int i = s.length()-1;i>=0;--i){
			System.out.println(s.charAt(i));
		}
	}
}
