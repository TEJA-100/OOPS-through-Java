class Student
{
 int id;
 String name;
 String branch;

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


public class Constructor
{
   public static void main(String[] args)
   {
    Student s1= new Student(101,"Teja","e");
    Student s2= new Student(102,"sai","a");
    s1.display();
    s2.display();
   }

   
}