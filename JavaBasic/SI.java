import java.util.Scanner;
public class SI {
   // import java.util.Scanner;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your first number");
        double r= sc.nextDouble();
        System.out.print("enter your second number");
        double s= sc.nextDouble();
        System.out.print("enter your third number");
        double t= sc.nextDouble();
        double si= (r*s*t)/100;


        
        System.out.println("the simple interest "+si);


    }
}
