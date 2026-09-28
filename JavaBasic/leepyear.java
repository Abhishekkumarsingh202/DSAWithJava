import java.util.Scanner;
public class leepyear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n");
        int n=sc.nextInt();
        if((n%4==0)&&(n%100!=0)||(n%400==0)){
            System.out .println("leep year");

        }
else{
    System.out.println("not leep year");
}
    }
    
}
