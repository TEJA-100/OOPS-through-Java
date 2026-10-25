import java.util.Scanner;

public class Armstrong
{
 public static void main(String[] args)
 {  
  int num, temp, sum=0;
  int dig, ct=0;

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter ur no");
  num=sc.nextInt();

  temp=num;
   
  while(temp>0)
  {
   ct++;
   temp=temp/10;
  }
  
  temp=num;
 
  while(temp>0)
  { 
   dig = temp%10;
   sum=sum+(int) Math.pow(dig,ct);
   temp=temp/10;
   }

 if(num == sum)
 {
  System.out.println("Yes");
  }
 else
 {
  System.out.println("no");
  }
 sc.close();
}
}
  
   


   
   