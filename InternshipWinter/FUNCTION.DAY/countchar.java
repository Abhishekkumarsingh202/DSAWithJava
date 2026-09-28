class countchar
{
static void masinnn(String b,char ch1) {
	String str1="good","g";
	int len=str1.length();
	int count=0;
   // int count1=0;
	for(int i=0;i<len;i++){
	    char ch =str1.charAt(i);
	    if (ch==ch1){
	        count++;
	        
	        
	    }
       // if (ch=='n'){
	        //count1++;

	    
	    }
	    System.out.println(count);
	
	}
	public static void main(String[] args){
	   masinnn("ggcg",'g');
	    
	}
	
}