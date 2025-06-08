import java.util.Scanner;
public class SampleCheckout {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);



	System.out.println("What is the the customer's Name?: ");
	String customerName = input.nextLine();

	
	String allItems = "";
	double subtotalallitems = 0;

	while(true) {

	System.out.println("What did the user buy?: ");
	String item = input.nextLine();

	System.out.println("How many pieces?: ");
	int quantity = input.nextInt();

	System.out.println("How many per unit?: ");
	double price = input.nextDouble():
	
	// mulitiply quantity * per price to get the total price of all the item

	double total = quantity * price;
	
	subtotalAllItems = subtotalAllItems + total;
	
	allItems = allItems + item + " x" + quantity + " =" + total + "\n";

	System.out.println("Add more item? (yes or no)");
	String more = input.nextLine();

	if (more.equals("no") || more.equals("No") || more.equals("NO")) {
	break;

	}


}

	System.out.println("What is your name cashier?");
	String cashierName = input.nextLine();

	System.out.println("How much discount will he get?:");
	double discountPercent = input.nextDouble();

	double discount = subtotalAllItems * discountPercent / 100;

	double vat = subtotalAllItems * 7.5 / 100;  //(VAT stands for value added tax)

	double totalAmount = subtotalAllItems - discount + vat;

	
	System.out.println("How much did the customer give you?");
	double amountPaid = input.nextDouble();

	double balance = amountPaid - totalAmount;

	System.out.println




























































}
}