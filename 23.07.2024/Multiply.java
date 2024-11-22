public class Multiply{
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int b [] = {1,2,3,4,5};
        int k [] = new int [a.length];
        for (int i = 0 ; i < a.length ; i++){
           k[i] = a[i] * b[i];
        }
        System.out.print("The product of two arrays :" + " ");
        for (int i = 0 ; i < k.length ; i++){
            System.out.print(k[i] + " ");
        }
    }
}