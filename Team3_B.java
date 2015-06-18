import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Team3_B {
	public static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
	
	public static long gcd(long a, long b) {
		if (a < b) {
			long temp = a;
			a = b;
			b = temp;
		}
		
		while (b != 0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		
		return a;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner cin = new Scanner(new File("B.in"));
		int p = cin.nextInt();
		cin.nextLine();
		while (p-- > 0) {
			int n = cin.nextInt();
			cin.nextLine();
			long answer = 1;
			for (int i = 0; i < n; i++) {
				answer = lcm(answer, cin.nextLong());
			}
			System.out.println(answer);
		}
	}
}
