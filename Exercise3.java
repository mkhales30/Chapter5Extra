
import java.io.*;
import java.util.*;
public class Exercise3 {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("poem2.txt");
            myWriter.write("We Real Cool\nGwendolyn Brooks\nI Know Why the Caged Bird Sings\nMaya Angelou\nHope is the Thing with Feathers\nEmily Dickinson\nThe Road Not Taken\nRobert Frost");
            myWriter.close();
            List<Poem> list=new ArrayList<>();
            File myObj = new File("poem2.txt");
            int l=0;
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String line1 = myReader.nextLine();
                String line2 = myReader.nextLine();
                Poem poem=new Poem();
                poem.setName(line1);
                poem.setPoet(line2);
                list.add(poem);
            }
            myReader.close();

            for(Poem poem:list)
                System.out.println(poem);
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
