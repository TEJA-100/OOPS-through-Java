class Student
{
 int id;
 String name;
 String branch;


 Student()
 {
    id=0;
    name="not";
    branch="not";
 }

 Student(int sid)
 {
    id=100;
    name="not";
    branch="not";
 }



 Student(int sid, String sname, String sbranch)
 {
  id=sid;
  name=sname;
  branch=sbranch;
 }
 
void display()
{
 System.out.println(id);
 System.out.println(name);
System.out.println(branch);
   
}
}


public class ConstructorOverloading
{
   public static void main(String[] args)
   {
    Student s1= new Student();
    Student s2= new Student(100);
    Student s3= new Student(102,"sai","a");
    s1.display();
    s2.display();
    s3.display();
   }

   
}