public class Array{
    public static void main(String[] args) {
        int[] table2 = {2,4,6,8,10,12,14,16,18,20,22,24};
        int[] table3 = {3,6,9,12,15,18,21,24,27,30,33,36};
        int[] table4 = {4,8,12,16,20,24,28,32,36,40,44,48};
        int[] table5 = {5,10,15,20,25,30,35,40,45,50,55,60};
        int[] result1 = new int[table2.length];
        int[] result2 = new int[table4.length];
        for(int i=0; i<table2.length; i++){
            result1[i] = table2[i] + table3[i];
        }
        for(int i=0; i<table4.length; i++){
            result2[i] = table4[i] + table5[i];
        }
        System.out.print("Result array of adding table2 and table3 :" + " ");
        for(int i=0; i<table2.length; i++){
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        System.out.print("Result array of adding table4 and table5 :" + " ");
        for(int i=0; i<table4.length; i++){
            System.out.print(result2[i] + " ");
        }
        }
        }
