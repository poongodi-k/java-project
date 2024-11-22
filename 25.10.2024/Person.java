import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
   
        public static void main(String [] args){
            String parent = "D:\\";
            String child = "poofile.txt";
            File file = new File(parent,child);
            FileOutputStream fos;
            try{
                fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                Person p1 = new Person("Poongodi",27);
                oos.writeObject(p1);
                System.out.println("Person object serialized successfully");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
