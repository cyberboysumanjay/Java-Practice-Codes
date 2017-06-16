import java.util.Scanner;


public class numberPattern1 {
	//public static void main(String args[]) { int var1 = 5; int var2 = 6; if ((var2 = 1) == var1) System.out.print(var2); else System.out.print(var2 + 1); }
	//public static void main(String[] args) { int a = 10, b = 20, c = 100; if(a <= b || c <= b) { System.out.println("hello"); } else if(a <= b || a <= c) { System.out.println("hi"); } else { System.out.println("hey"); } }
	public static void main(String[] args) { int a = 10, b = 20, c = 100; if(a <= b && b != 20) { System.out.println("hello"); } else if(c >= a && c >= b) { System.out.println("hi"); } else { System.out.println("hey"); } }
}
