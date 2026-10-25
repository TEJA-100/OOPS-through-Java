interface Sports 
{ 
    void sportsMarks(); 
} 
 
interface Academics 
{ 
    void academicMarks(); 
} 
 
class Student implements Sports, Academics 
{ 
    public void sportsMarks() 
    { 
        System.out.println("Sports Marks = 85"); 
    } 
 
    public void academicMarks() 
    { 
        System.out.println("Academic Marks = 92"); 
    } 
 
    void totalMarks() 
 
    { 
        int total = 85 + 92; 
 
        System.out.println("Total Marks = " + total); 
    } 
} 
 
public class MultipleInheritanceDemo 
{ 
    public static void main(String[] args) 
    { 
        Student s = new Student(); 
 
        s.sportsMarks(); 
 
        s.academicMarks(); 
 
        s.totalMarks(); 
    } 
} 