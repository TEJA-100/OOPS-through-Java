import java.util.Scanner;

class InvalidAgeException extends Exception
{
 InvalidAgeException(String Message)
 {
  super(Message);
 }
}
 
public class UserDefinedException
{
 public static void main(String[] agrs)
 {
   Scanner sc = new Scanner(System.in);
  try
 {
 
  int n=sc.nextInt();
  if(n<18)
  {
   throw new InvalidAgeException("not");
  }
  System.out.print("yes");
}

catch(Exception e)
{
  System.out.println("Not");
}

sc.close();
}}

  
  
