public class oddinverted {
     public static void main(String[] args){
        int n=5;
        int a=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){
                System.out.print( " ");

            }
            for(int k=1;k<=i;k++){
                if(i%2==0){

                
                System.out.print((char)(k+64));
                }
                else{
                    System.out.print(i);
                }


            }
            a--;
            System.out.println( );
        }

    
    

    
}
}