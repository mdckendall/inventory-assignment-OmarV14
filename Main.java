import java.util.ArrayList;
import java.util.Scanner;

class Inventory(String a, String b, int x) {
  
  ArrayList<Object> inv = new ArrayList<Object>();
  

}

class Main {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int userInput;
    String name;
    String sku;
    int price;
    
    System.out.println("Press 1 to add an item.");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");
    userInput = sc.nextInt();
    
    do {
      if (userInput == 1) {
        sc.nextLine();
        System.out.println("Enter the name:");
        name = sc.nextLine();

        System.out.println("Enter the serial number:");
        sku = sc.nextLine();

        System.out.println("Enter the value in dollars (whole number):");
        price = sc.nextInt();

        x = new Inventory(name, sku, price);
        inv.add(x);
        System.out.println(Inventory);
        

      }
      else if(userInput == 2) {
        sc.nextLine();
        System.out.println("Enter the serial number of the item to delete:");
      }
      else if(userInput == 3) {
        sc.nextLine();
        System.out.println("Enter the serial number of the item to change:");
        sku = sc.nextLine();

        System.out.println("Enter the new name:");
        name = sc.nextLine();

        System.out.println("Enter the new value in dollars (whole number):");
        price = sc.nextInt();
        
      }
      else if(userInput == 4) {
        System.out.println(Inventory);
      }
      else {
        return;
      }
      
    System.out.println("Press 1 to add an item.");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");
      userInput = sc.nextInt();
    } while(userInput >= 1 || userInput <= 4 && !(userInput == 5));
	}
}