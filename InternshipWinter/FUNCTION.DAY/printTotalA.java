Class printTotalA{
    static int getcount(String str1){
    int count=0;
    for(int i=0;i<str1.length();i++){
        count++;
    }

return count;
    }
static void total(String[]myList){
    for(int i=0;i<myList.length;i++){
        int count=getCount(myList[i]);
        System.out.println(count);

    }
}
public static void main (String[] args){
    string[] arr ={"a","bcd","aba"};
    totalA(arr);
} 

}