public class Multiply{
    public static void main(String args[]){
        int mul[][] = {{2,3,4,5,6},{2,4}};
        for(int i=0;i<mul.length;i++){
            for(int j=0;j<mul[i].length;j++){
                System.out.println(i+","+j+":"+mul[i][j]);
            }
        }

    }
}