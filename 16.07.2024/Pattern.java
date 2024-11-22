import java.util.Scanner;

public class Pattern{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("choose a pattern to print:");
        System.out.println("1.Triangle");
        System.out.println("2.Rectangle");
        System.out.println("3.Outer box");
        int choice = scn.nextInt();
        int size = 5;
        int rows = 5;
        int columns = 10;
        switch(choice){
            case 1 :
                    System.out.println("Pattern for Triangle is");
                    for(int i = 1 ; i<=size ; i++){
                    for(int j = 1 ; j<=i ; j++){
                        System.out.print("* ");
                    }
                        System.out.println();
                    }
                    break;

            case 2 :
                    System.out.println("Pattern for Rectangle is");
                    for(int i = 1 ; i<=rows ; i++){
                    for(int j = 1 ; j<=columns ; j++){
                        System.out.print("* ");
                    }
                        System.out.println();
                    }
                    break;

            case 3 :
                    System.out.println("Pattern for Outerbox is");
                    for(int i = 1 ; i<=size ; i++){
                    for(int j = 1 ; j<=size ; j++){
                        if(i == 1 || j == 1 || i == size || j == size){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                    }     
                    break;
                    
            default :
                    System.out.println("Pattern for X is");
                    for(int i = 1 ; i<=size ; i++){
                    for(int j = 1 ; j<=size ; j++){
                        if(i == j || (i+j) == size+1){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                    }
                }
    }
}