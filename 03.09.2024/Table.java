public class Table{
    int num;
    int to;
    class Display{
        public void printTable(){
            for(int i = 1 ; i <= Table.this.to ; i++){
                System.out.println(i + "*" + Table.this.num + "=" + (i * Table.this.num));                
            }
        }
    }
    public static void main(String [] args){
        Table t = new Table();
        t.num = 5;
        t.to = 10;
        Table.Display d = t.new Display();
        d.printTable();
    }
}