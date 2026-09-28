public class Xstarplus {
    public static void main(String [] args){
        int n=5;
        int m= 5;
       

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){


                if(i==j ){ 

                System.out.print("*"+" ");
                }

                
                else if(i+j==n+1) {
                    System.out.print("*"+" ");
                }
            

                
                else{ 
                    System.out.print("  ");
                }
            }

            System.out.println();

        }
    }
    
}
