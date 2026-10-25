class Student
{
 int id;
 String name;
 void getStudent(int sid,String sname)
 {
  id=sid;
  name=sname;
  }
  void displayStud()
  {
   System.out.println(id);
   System.out.println(name);
  }
}

class Marks extends Student
{
 int m1,m2,m3,t;
 double p;
 void getMarks(int ma1,int ma2,int ma3)
 {
  m1=ma1;
  m2=ma2;
  m3=ma3;
  }

  void displayMarks()
  {
   System.out.println(m1);
   System.out.println(m2);
   System.out.println(m3);
  }
}

 class Result extends Marks{
 void calResult()
 {
  t=m1+m2+m3;
  p=t/3.0;
 }
  
 void displayRes()
 {
  System.out.println(t);
   System.out.println(p);
}
  
}


public class MultiIn
{
 public static void main(String[] args)
 {
  Result r=new Result();
  r.getStudent(100,"Sai");
  r.getMarks(90,85,90);
  r.calResult();
  r.displayStud();
  r.displayMarks();
  r.displayRes();
}
}


