public class eee{
  public static void main(String[] var0) {
    String str="code";
    String str2 ="";
    int len =str.length();
    for(int i=0;i<len;i++){
        char ch =str.charAt(i);
        if (ch=='d'){
            str2=str2+"dd";

        }
        //  System.out.println(str2);
         
        else {
            str2=str2+ch;

        }
    }
      System.out.println(str2);
    
}
}