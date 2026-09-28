public class rombus {
     public static void main(String[] args){
        int n=5;
        int a=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){
                System.out.print( " ");

            }
            for(int k=1;k<=i;k++){
                System.out.print("*");


            }
            for(int p=i;p<=n-1;p++){
                System.out.print("*");

            }
           a--;
            System.out.println( );
        }

    
}

    
}
