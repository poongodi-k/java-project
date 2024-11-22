public class Television{
    String brandName;
    String displayType;
    String dimension;
    String resolution;
    double price;
    boolean emiOption;
    int warranty;
    public void displayTvSize(){
        System.out.println1("The display details of selected television are given below:");
        System.out.println("Display type:" + " " + this.displayType +"\n"+ "Dimension:" + " " + this.dimension + "\n" + "Resolution:" + " " + this.resolution);
    }
    public void displayPrice(){
        System.out.println("The price details of selected television is:");
        System.out.println("Price:" + " " + this.price);
    }
    public void productDetails(){
        System.out.println("The product details of selected television are given below:");
        System.out.println("Brand Name:" + " " + this.brandName + "\n" + "Display type:" + " " + this.displayType + "\n" + "Dimension:" + " " + this.dimension + "\n" + "Resolution:" + " " + this.resolution + "\n" + "Price:" + " " + this.price + "\n" + "EMI option:" + " " + this.emiOption + "\n" + "Warranty:" + " " + this.warranty + " " + "years");
    }
    public static void main(String args[]){
        Television t1 = new Television();
        t1.brandName = "Samsung";
        t1.displayType = "QLED";
        t1.dimension = "55 inches";
        t1.resolution = "3840 * 2160 pixels";
        t1.price = 48500.00;
        t1.emiOption = true;
        t1.warranty = 5;
        t1.displayTvSize();
        System.out.println("-------------------------------------------------------------------------------------");
        t1.displayPrice();
        System.out.println("-------------------------------------------------------------------------------------");
        t1.productDetails();
        
        

    }


        
    
}