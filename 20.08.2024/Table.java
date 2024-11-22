public class Table{
    int startValue;
    int endValue;
    int num;
    public void printTable(int startValue,int endValue,int num){
        for(int i = startValue ; i <= endValue ; i++){
            System.out.println(i + "*" + num + "=" + (i*num));
    }
    System.out.println("------------------------------------------");
}
    public static void main(String[] args) {
        Table table4 = new Table();
        table4.printTable(1,10,4);
        Table table5 = new Table();
        table5.printTable(1,25,5);
    }
}