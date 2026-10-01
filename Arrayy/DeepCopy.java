import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args){
        int[]arr={56,55,5,66,};
        int[]y=Arrays.copyOf(arr,arr.length);
        y[3]=89;
        System.out.println(arr[3]);
        System.out.println(y[3]);

    }
    
}
