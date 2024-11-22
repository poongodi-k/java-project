public class Border{
	public static void main(String args[]){
        int boxSize = 5;
		for(int i=1; i<=boxSize; i++){

			for(int j=1; j<=boxSize; j++){
                
                if(i == 1 || j == 1 || i == boxSize || j == boxSize){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
				
                System.out.println();

				
}}}