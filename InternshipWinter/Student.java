class Student() {
    int id;
    String name;

    Student(){
        id = 0;
        name = " not Assigned";
        
    }
    Student(int i,String n){
        id = i;
        name = n;
        
    }
    Student(Student s){
        id = s.id;
        name = s.name;
        
    }
    void display(){
        System.out.println("iD"+id+"name"+name);
        
    }
}
public class main{
    public static void main (String[] args){
        Student s1= new Student();
        Student s2 = new Student(101,"alice");
        Student s3= new Student(s2);
        s1.display();
        s2.display();
        s3.display();
    }
}