import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Team3_F {
	public static void main(String args[])throws IOException{
		Scanner scan = new Scanner(new File("F.in"));
		int set = 0;
		while(true){
			int moved = 0;
			set++;
			int stacks = scan.nextInt();
			if(stacks==0){
				break;
			}
			int size = 0;
			int[]height = new int[stacks];
			for(int i = 0; i < height.length; i++){
				height[i] = scan.nextInt();
				size+=height[i];
			}
			size/=stacks;
			for(int i = 0; i < height.length; i++){
				if(height[i]<size){
					moved+=(size-height[i]);
				}
			}
			System.out.println("Set #"+set);
			System.out.println("The minimum number of moves is "+moved+".");
			System.out.println();
		}
	}
}
