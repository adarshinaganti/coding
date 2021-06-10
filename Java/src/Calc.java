import java.util.Scanner;

public class Calc{
    private static final Scanner sc = new Scanner(System.in);
    private static final double pi = 3.14;
    
    public static void square(int s){
        System.out.print("Enter side: ");
        s = sc.nextInt();
        int p = 4 * s;
        int a = s * s;
        System.out.println("Perimeter: " + p);
        System.out.println("Area: " + a);
    }

    public static void rect(int l, int b){
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();
        int p = 2 * (l + b);
        int a = l * b;
        System.out.println("Perimeter: " + p);
        System.out.println("Area: " + a);
    }
}