import java.io.*;
import java.util.*;
public class Exercise1
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("Book1.csv");
        Scanner sc = new Scanner(file);
        String s[]=new String[2];
        int min=9999,max=0,sum=0;
        while (sc.hasNextLine())
        {
            s=sc.nextLine().split(",");
            sum=sum+Integer.parseInt(s[1]);
            if(Integer.parseInt(s[1])<min)
                min=Integer.parseInt(s[1]);
            if(Integer.parseInt(s[1])>max)
                max=Integer.parseInt(s[1]);
        }
        int avg=(sum+min+max)/3; 
        FileWriter fw=new FileWriter("stats.txt"); 
        fw.write("The sum of the numbers is: "+sum+"\n");
        fw.write("The lowest number is: "+min+"\n");
        fw.write("The highest number is: "+max+"\n"); 
        fw.write("The average of the numbers is: "+avg+"\n"); 
        fw.close();
    }
}
