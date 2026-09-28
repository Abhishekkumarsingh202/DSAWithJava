import java.util.Scanner;
public class Cvolume {
   // import java.util.Scanner;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of radius");
        double r= sc.nextDouble();
        double volume=4/3*3.141592*r*r;
        System.out.println("the volume of circle   :"+ volume);


    }
    
}
