class Addi
{
 int add(int a, int b)
 {
  return a+b;
 }
 int add(int a, int b, int c)
 {
  return a+b+c;
 }
 
 double add( double a, double b, double c)
 {
  return a+b+c;
  }
}






public class MethodOverL
{
 public static void main(String[] args)
 {
  Addi obj=new Addi();
  System.out.println(" sum a and b: " + obj.add(10,20));
  System.out.println(" sum a and b, c: " + obj.add(10,20,30));
  System.out.println(" sum a and b,c: " + obj.add(10.0,20.0,30.0));

}
}