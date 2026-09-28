public class good{
  public static void main(String[] var0) {
    String str="TriSecT";
   String str1="";
// String str2="";
    int len =str.length();
    for(int i=0;i<len;i++){
        char ch =str.charAt(i);
        if( ch>='A' && ch<='Z'){
            str1= str1+":capital";
           System.out.println(ch+str1);

        }
            //System.out.println(ch+str1);


          if( ch>='a' && ch<='z'){
            //str2= str2+":small";
            System.out.println(ch+":small");

        
        }
        //System.out.println(ch+str2);

       //System.out.println(ch+str1);
    }
  }
}