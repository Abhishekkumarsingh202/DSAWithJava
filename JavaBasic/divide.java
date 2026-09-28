import java.util.Scanner;
public class divide {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of n");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("divided by 5");

        }
        else
        
            System.out.println("not");
        
    }
    
    
}
