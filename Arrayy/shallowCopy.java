public class shallowCopy {
    public static void main(String[] args){
        int[]arr={12,45,66,34,34};
        int[]x=arr;
        x[2]=78;
        System.out.println(arr[2]);
        System.out.println(x[2]);
    }
    
}
