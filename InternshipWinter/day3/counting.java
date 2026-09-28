public class counting{
  public static void main(String[] var0) {
    String str="mayday";
   int  count =0;
   int count2=0;
    int len =str.length();
    for(int i=0;i<len;i++){
        char ch =str.charAt(i);
        if( ch=='x'){
            count++;

        }
        if(ch=='y'){
            count2=count2+1;

        }

        }
    
    
        System.out.println("x#"+count);
         System.out.println("y#"+count2);
}


}
