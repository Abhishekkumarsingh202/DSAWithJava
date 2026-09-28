import java.util.Scanner;
import java.util.Array;

class reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter "+ n + "element");

        //int[] arr = {1, 2, 3, 4, 5};
        int sum =0;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int j=0;j<arr.length;j++){
            sum=sum + arr[j];
        }

System.out.print(sum);
    }
}
