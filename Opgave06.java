public class Opgave06{

	public Opgave06(String text){
		repeat(text);
	}

	private void repeat(String s){
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s);
		}
	}
}
