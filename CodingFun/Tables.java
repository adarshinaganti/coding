import java.util.Scanner;

public class Tables{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		for(int i = 1; i <= 10; i++){
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}
}