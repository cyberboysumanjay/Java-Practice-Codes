import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		long num=s.nextLong();
		long remainder=0,binary=0,base=1;
		while (num > 0)
		{
			remainder = num % 2;
			binary = binary + remainder * base;
			num = num / 2;
			base = base * 10;
		}

		System.out.println(binary);
	}
}
