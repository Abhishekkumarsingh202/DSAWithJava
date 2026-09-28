import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of cost price");
        int cost=sc.nextInt();
         Scanner vc=new Scanner(System.in);
        System.out.print("enter the value of sell price");
         int sell=vc.nextInt();
         if(cost<sell){
            System.out.println("profit");

         }
         else{
            System.out.println("loss");

         }
        
        if(cost==sell){
            System.out.println("no profit no loss");
        }
    }
    
}
