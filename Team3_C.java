import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Team3_C {
	public static void main(String args[])throws IOException{
		Scanner scan = new Scanner(new File("C.in"));
		String vowels = "aeiou";
		while(true){
			String password = scan.next();
			if(password.equals("end"))
				break;
			boolean hasVowel= false;
			int vowelinRow = 0;
			int coninRow = 0;
			CharSequence c;
			for(int i = 0; i < password.length(); i++){
				c = new String(""+password.charAt(i));
				if(vowels.contains((c))){
					hasVowel = true;
					vowelinRow++;
					coninRow = 0;
				}
				else{
					vowelinRow=0;
					coninRow++;
				}
				if(i>=1){
					Character a = password.charAt(i);
					Character b = password.charAt(i-1);
					if(a=='e'|| a=='o'||a=='o'||a=='e'){
						
					}
					else if(a==b){
						hasVowel = false;
						break;
					}
				}
				
				if(vowelinRow>2 ||coninRow>2){
					break;
				}
			}
			if(vowelinRow>2 ||coninRow>2||hasVowel==false){
				System.out.println("<"+password+">" + " is not acceptable.");
			}
			else{
				System.out.println("<"+password+">" + " is acceptable.");
			}
		}
	}
}
