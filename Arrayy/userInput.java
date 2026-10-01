import java.util.Scanner;
public class userInput {
    public static void main(String[] args){

    
    Scanner sc=new Scanner(System.in);
    System.out.print("enter array size");
    int n=sc.nextInt();
    int[] arr = new int[n];
    
    System.out.print("enter the size of array");
    for(int i=0;i<=n;i++){
        arr[i]=sc.nextInt();
        for(int j=1;j<n;j++){
            System.out.println(arr[j]);
        }
    }
}


    
}
