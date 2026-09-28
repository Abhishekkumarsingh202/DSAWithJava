public class reverse {
    public static void main(String[] args){
        int n= 87654;
        int r=0;
       
        while(n!=0){
        r=r*10;
        r=r+(n%10);
        n=n/10;
        }
        
    System.out.println(r);
       
    }
}
