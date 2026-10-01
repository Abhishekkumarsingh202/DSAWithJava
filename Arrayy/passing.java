public class passing {
    public static void main(String[] args){
        int []x={10,23,45,45};
        System.out.println(x[3]);
        change(x);
        System.out.println(x[3]);

    }
    public static void change(int[] y){//pass by reference 
        y[3]=89;
    }

}
