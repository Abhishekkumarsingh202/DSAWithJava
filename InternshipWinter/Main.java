
		String str = "public class Main
{
	public static void main(String[] args) {tRiSect";
		int len =str.length();
		int uppercasecount = 0;
		for(int i=0;i<len;i++){
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z'){
				uppercasecount =uppercasecount +1;

		}

	}
System.out.println(uppercasecount);
	}}
