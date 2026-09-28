public class create
{
	public static void main(String[] args) {
	Student obj =new Student(); 
	System.out.println(obj.name);
	System.out.println(obj.roll);	
	obj.name="abhi";
	obj.roll=6;
	System.out.println(obj.name);
	System.out.println(obj.roll);
	}
}

class Student{
    String name;
    int roll;
    
    
}