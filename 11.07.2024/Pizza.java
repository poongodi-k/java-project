public class Pizza{
	public static void main(String args[]){
			System.out.println("Welcome to Sumi Pizza shop");
			System.out.println("You can enjoy 3 types of pizza here");
			System.out.println("Small pizza for 20 Rs");
			System.out.println("Medium pizza for 40 Rs");
			System.out.println("Large pizza for 60 Rs");
			System.out.println("Press 1 for Small pizza , 2 for Medium pizza and 3 for Large pizza");
				byte smallPizza = 20;
				byte mediumPizza = 40;
				byte largePizza = 60;
				byte option = 3;
	if(option == 1){
			System.out.println("You selected small pizza, how many pizza do you need and do you need extra toppings?");
				byte quantity = 3;
				float totalAmount = quantity * smallPizza;
				byte extraToppings = 20;
				float extraAmount = totalAmount + extraToppings;
				boolean toppings = true;
		
		if(toppings == true){
			System.out.println("The amount of" + quantity + "small pizza is" + extraAmount + "Rs");
				float userAmount = 100f;
			if(userAmount > extraAmount){
				System.out.println("your balance is Rs" + (userAmount - extraAmount) + "Enjoy your dish");}
			else if(userAmount < extraAmount){
				System.out.println("Please give the balance amount Rs" + (extraAmount - userAmount));}
			else if(userAmount == extraAmount){
				System.out.println("Enjoy your dish");}	}
		else if(toppings == false){
			System.out.println("The amount of" + quantity + "small pizza is" + totalAmount + "Rs");
				float userAmount = 100f;
			if(userAmount > totalAmount){
				System.out.println("your balance is Rs" + (userAmount - totalAmount) + "Enjoy your dish");}
			else if(userAmount < totalAmount){
				System.out.println("Please give the balance amount Rs" + (totalAmount - userAmount));}
			else if(userAmount == totalAmount){
				System.out.println("Enjoy your dish");}}}


	else if(option == 2){
			System.out.println("You selected medium pizza, how many pizza do you need and do you need extra toppings?");
				byte quantity = 3;
				float totalAmount = quantity * mediumPizza;
				byte extraToppings = 20;
				float extraAmount = totalAmount + extraToppings;
				boolean toppings = true;
		
		if(toppings == true){
			System.out.println("The amount of" + quantity + "medium pizza is" + extraAmount + "Rs");
				float userAmount = 100f;
			if(userAmount > extraAmount){
				System.out.println("your balance is Rs" + (userAmount - extraAmount) + "Enjoy your dish");}
			else if(userAmount < extraAmount){
				System.out.println("Please give the balance amount Rs" + (extraAmount - userAmount));}
			else if(userAmount == extraAmount){
				System.out.println("Enjoy your dish");}	}
		else if(toppings == false){
			System.out.println("The amount of" + quantity + "medium pizza is" + totalAmount + "Rs");
				float userAmount = 100f;
			if(userAmount > totalAmount){
				System.out.println("your balance is Rs" + (userAmount - totalAmount) + "Enjoy your dish");}
			else if(userAmount < totalAmount){
				System.out.println("Please give the balance amount Rs" + (totalAmount - userAmount));}
			else if(userAmount == totalAmount){
				System.out.println("Enjoy your dish");}}}

	else if(option == 3){
			System.out.println("You selected large pizza, how many pizza do you need and do you need extra toppings?");
				byte quantity = 3;
				float totalAmount = quantity * largePizza;
				byte extraToppings = 20;
				float extraAmount = totalAmount + extraToppings;
				boolean toppings = true;
		
		if(toppings == true){
			System.out.println("The amount of" + quantity + "large pizza is" + extraAmount + "Rs");
				float userAmount = 500f;
			if(userAmount > extraAmount){
				System.out.println("your balance is Rs" + (userAmount - extraAmount) + "Enjoy your dish");}
			else if(userAmount < extraAmount){
				System.out.println("Please give the balance amount Rs" + (extraAmount - userAmount));}
			else if(userAmount == extraAmount){
				System.out.println("Enjoy your dish");}	}
		else if(toppings == false){
			System.out.println("The amount of" + quantity + "large pizza is" + totalAmount + "Rs");
				float userAmount = 500f;
			if(userAmount > totalAmount){
				System.out.println("your balance is Rs" + (userAmount - totalAmount) + "Enjoy your dish");}
			else if(userAmount < totalAmount){
				System.out.println("Please give the balance amount Rs" + (totalAmount - userAmount));}
			else if(userAmount == totalAmount){
				System.out.println("Enjoy your dish");}}}
	else{
			System.out.println("Thank you visit again");}








	





}

}