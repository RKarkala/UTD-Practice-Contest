import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Team3_A {
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(new File("A.in"));
		int P = scan.nextInt();
		for (int l = 0; l < P; l++) {
			int N = scan.nextInt();
			int startval = scan.nextInt();
			int values = 1;
			int x = 0;
			int y = 0;
			String directions = scan.next();
			int[][] area = new int[N][N];
			for (int q = 0; q < N; q++) {
				for (int i = 0; i < N; i++) {
					area[q][i] = values;
					if (area[q][i] == startval) {
						x = q;
						y = i;
					}
					values++;
				}
			}
			
			int[] ways = new int[directions.length()];
			for (int i = 0; i < directions.length(); i++) {
				switch (directions.charAt(i)) {
				case 'N':
					ways[i] = 1;
					break;
				case 'S':
					ways[i] = 2;
					break;
				case 'E':
					ways[i] = 3;
					break;
				case 'W':
					ways[i] = 4;
					break;
				default:
					break;
				}
			}
			for (int i = 0; i < ways.length; i++) {
				if (ways[i] == 1) {
					x--;
				}
				else if (ways[i] == 2) {
					x++;
				}
				else if (ways[i] == 3) {
					y++;
				}
				else if (ways[i] == 4) {
					y--;
				}
				if(x<0){
					x= N-1;
				}
				if(x>=N){
					x= 0;
				}
				if(y<0){
					y= N-1;
				}
				if(y>=N){
					y= 0;
				}
				
			}
			System.out.println(area[x][y]);
		}


	}
}
