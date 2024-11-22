import java.util.Scanner;

public class TwoDim{
    public static void main(String[] args) {
        int value [][] = new int[5][3];
        Scanner scn = new Scanner(System.in);
            for(int i = 0 ; i < value.length ; i++){
                for(int j = 0 ; j < value[i].length ; j++){
                  System.out.print("Please give the input"+" "+i+","+j+":");
                  int input = scn.nextInt();
                  value[i][j] = input;}
                  System.out.println(value[i][j]);

                
                  


        


    

    }}}