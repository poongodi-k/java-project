public class House{
    public static boolean openDoor(String password , int kitchenPassword){
        String doorPassword = "abcdefg";
        int kitchenId = 1234;
        if((password == doorPassword) & (kitchenPassword == kitchenId)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean pwd = openDoor("abcd" , 1234);
        if(pwd){
            System.out.println("The password and Kitchen Id matched, you can now enter the house");
        }
        else{
            System.out.println("Password or Kitchen Id mismatched,you are not a member of this house");
        }
    }
}