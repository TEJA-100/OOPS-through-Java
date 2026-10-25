import java.util.Scanner;

public class Fibanacci
{
 public static void main(String[] args)
 {
  
  int n;
  int A=0, B=1, res;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no");
  
  n=sc.nextInt();
 
  if(n==0)
  {
    System.out.println(0);
  }
  else if(n==0)
  {
    System.out.println(1);
  }

  else
   {
    System.out.print(A + " " +B+ " ");
    for(int i =2; i<n;i++)
    { 
     res=A+B;
     System.out.print(res+ " ");
     A=B;
     B=res;
     }
    }
     
    sc.close();
  } 

}
  
  
  
  