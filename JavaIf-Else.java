import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>=1 && n<=100){
            if(n%2!=0){
                System.out.println("Weird");
            }else if(n>=2 && n<=5 && n%2==0){
                    System.out.println("Not Weird");
            }else if(n>=6 && n<=20 && n%2==0)
            {
                    System.out.println("Weird");
            }else{
                if(n>20 && n%2==0)
                {
                    System.out.println("Not Weird");
                }
            }
        }
    }
}