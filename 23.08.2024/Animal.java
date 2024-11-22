public class Animal{
    public void sound(){
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks.");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Cat meows.");
    }
}
