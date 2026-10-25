import java.io.*; 
 
public class FileCount 
{ 
    public static void main(String[] args) 
    { 
        try 
        { 
            FileReader fr = new FileReader("sample.txt"); 
 
            BufferedReader br = new BufferedReader(fr); 
 
            int lineCount = 0; 
            int wordCount = 0; 
            int charCount = 0; 
 
            String line; 
 
            while ((line = br.readLine()) != null) 
            { 
                lineCount++; 
 
                charCount = charCount + line.length(); 
 
 
                line = line.trim(); 
 
                if (!line.equals("")) 
                { 
                    String words[] = line.split("\\s+"); 
 
                    wordCount = wordCount + words.length; 
                } 
            } 
 
            br.close(); 
 
            System.out.println("Number of Lines : " + lineCount); 
            System.out.println("Number of Words : " + wordCount); 
            System.out.println("Number of Characters : " + charCount); 
        } 
        catch (IOException e) 
        { 
            System.out.println("File operation failed."); 
        } 
    } 
} 