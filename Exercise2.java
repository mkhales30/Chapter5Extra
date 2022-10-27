import java.io.*;
public class Exercise2
{
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("poems.txt");
            Poem poem1=new Poem();
            poem1.setName("We Real Cool");
            poem1.setPoet("Gwendolyn Brooks");

            Poem poem2=new Poem();
            poem2.setName("I Know Why the Caged Bird Sings");
            poem2.setPoet("Maya Angelou");

            Poem poem3=new Poem();
            poem3.setName("The Road Not Taken");
            poem3.setPoet("Robert Frost");

            myWriter.write(poem1.getName()+"\n");
            myWriter.write(poem1.getPoet()+"\n");

            myWriter.write(poem2.getName()+"\n");
            myWriter.write(poem2.getPoet()+"\n");

            myWriter.write(poem3.getName()+"\n");
            myWriter.write(poem3.getPoet()+"\n");

            myWriter.close();


        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
