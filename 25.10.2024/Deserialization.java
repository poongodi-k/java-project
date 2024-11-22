import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization{
    public static void main(String [] args){
        String parent = "D:\\";
        String child = "poofile.txt";
        File file = new File(parent,child);
        FileInputStream fis;
        try{
            fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person obj = (Person) ois.readObject();
            System.out.println("Student name is" + " " + obj.name + "\n" + "Student age is" + " " + obj.age);

        }
        catch(IOException e){
            e.printStackTrace();
        }
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
        
    }
}