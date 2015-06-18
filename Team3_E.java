import java.util.*;
import java.io.*;
import java.text.*;

public class Team3_E {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(new File("E.in"));
		DecimalFormat x = new DecimalFormat(".000");
		while (sc.hasNextLine()) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double s = (a + b + c) / 2.0;
			double i = ((s - a) * (s - b) * (s - c));
			double r = Math.sqrt(i / s);
			double z = Math.sqrt(s * i);
			double R = (a * b * c) / (4 * z);
			System.out.println("The radius of the round table is: " + x.format(r)
					+ " and the radius of the floor plan is " + x.format(R));
		}
	}
}
