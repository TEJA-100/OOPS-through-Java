import java.util.Scanner;
import java.util.Arrays;


public class Anagram
{
 public static void main(String[] args)
 {
  String s1,s2;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the string 1:");
  s1=sc.nextLine();
  System.out.println("Enter the string 2:");
  s2=sc.nextLine();
   
  s1=s1.toLowerCase();
  s2=s2.toLowerCase();
 
 if(s1.length() != s2.length())
 {
  System.out.println("Not");
  }
 
else
 {
  char arr1[]= s1.toCharArray();
  char arr2[]= s2.toCharArray();
  Arrays.sort(arr1);
  Arrays.sort(arr2);

  if(Arrays.equals(arr1,arr2))
   {
    System.out.println("Yes");
    }
  else
   { 
    System.out.println("No");
    }
 }
sc.close();
}
}
 


 
  
