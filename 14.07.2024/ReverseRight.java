public class ReverseRight{
	public static void main(String args[]){
		int boxSize = 5;
		for(int i=1; i<=boxSize; i++){
			for(int j=5; j>=1; j--){
                if(i>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
			}
				System.out.println();
				
}}}