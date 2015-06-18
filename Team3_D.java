import java.io.*;
import java.util.*;
import java.text.*;
public class Team3_D
{
    public static void main (String args[]) throws IOException
    {
  Scanner sc = new Scanner(new File("D.in"));
  //Scanner sc = new Scanner(new File("test_d.txt"));
    while(sc.hasNextLine()){
    String s = sc.nextLine();
    if(s.equals("0:00"))
    {break;}
    else{
     DecimalFormat x=new DecimalFormat("0.000");
    //String [] ar =new String[2];
    String [] ar=s.split(":");
    int h= Integer.valueOf(ar[0]);
    int m= Integer.valueOf(ar[1]);
    double ha=(h*30)+((m*.5)%30);
    int ma= m*6;
    double diff=Math.abs((ha-ma)%360);
    if(diff>180)
    {diff=360-diff;}
    System.out.println(x.format(diff));
   }
  } 
 }
}
