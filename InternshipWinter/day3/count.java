public class count{
  public static void main(String[] var0) {
    String str="hjhjh";
   int  count =0;
    int len =str.length();
    for(int i=0;i<len;i++){
        char ch =str.charAt(i);
        if( ch=='z'){
            count++;

        }
        

        }
    
    System.out.println(count);
}


}

