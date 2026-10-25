import java.io.*; 
 
import java.util.Scanner; 
 
public class FileEO 
{ 
    public static void main(String[] args) 
    { 
        try 
        { 
            Scanner sc = new Scanner(System.in); 
 
            FileWriter evenFile = new FileWriter("Even.txt"); 
            FileWriter oddFile = new FileWriter("Odd.txt"); 
 
            BufferedWriter bwEven = new BufferedWriter(evenFile); 
            BufferedWriter bwOdd = new BufferedWriter(oddFile); 
 
            System.out.print("Enter the number of elements: "); 
 
            int n = sc.nextInt(); 
 
 
            System.out.println("Enter the numbers:"); 
 
            for (int i = 1; i <= n; i++) 
            { 
                int num = sc.nextInt(); 
 
                if (num % 2 == 0) 
                { 
                    bwEven.write(num + " "); 
                } 
                else 
                { 
                    bwOdd.write(num + " "); 
                } 
            } 
 
            bwEven.close(); 
            bwOdd.close(); 
 
            sc.close(); 
 
            System.out.println("Even numbers stored in Even.txt"); 
            System.out.println("Odd numbers stored in Odd.txt"); 
        } 
        catch (IOException e) 
        { 
            System.out.println("File operation failed."); 
        } 
    } 
} 