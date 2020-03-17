import java.util.Scanner;
import java.util.Arrays;
public class Opgave07{

	public Opgave07(int names){
		System.out.println(shortestName(names));
	}

	private String shortestName(int name){
		String[] names = new String[name];
		Scanner ms = new Scanner(System.in);

		for(int i=1;i<=name;i++){
			System.out.print("Name #"+i+": ");
			String newName = ms.nextLine();
			names[i-1]=newName;
		}
		return Arrays.toString(names);
	}
}
