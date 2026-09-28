public class patten{
  public static void main(String[] var0) {
    String str="479";
    String str2 ="";
    int len =str.length();
    for(int i=0;i<len;i++){
        char ch =str.charAt(i);
        if (ch=='9'){
            str2=str2+"c";

        }
        else{
            str2=str2+ch;
        }
       
         
       
    }
      System.out.println(str2);
    
}
}