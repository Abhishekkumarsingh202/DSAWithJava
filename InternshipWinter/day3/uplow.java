public class uplow{
  public static void main(String[] var0) {
    String str="Raj-Sinha";
    String str2 ="";
    int len =str.length();
    for(int i=0;i<len;i++){
        char ch =str.charAt(i);
        if( (ch>='a' && ch<='z')){
            str2=str2+ ch;

        }
        

        }
    
    System.out.println(str2);
}


}
