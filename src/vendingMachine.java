import java.util.Scanner;
public class vendingMachine {
    public static void main(String[] args) {
    int b = 5;
        while (b != 0) {
     b = vendify();
        }
    }
    public static int vendify() {
       int productBought = -3;
       while (productBought<=0||productBought>=5){
        Scanner can = new Scanner(System.in);
        System.out.println("Products:");
        System.out.println("1. Hostage - $200");
        System.out.println("2. Arms - $500");
        System.out.println("3. ICMBs - $35000");
        System.out.println("4. Missile Launcher & Silo - $15000");
        System.out.println("5. Private Militia - $20000");
        System.out.println("Enter 1-5 for a product, or 0 to exit vending machine");
        productBought = can.nextInt();}

       switch (productBought) {

           case 1:
              int d = payUp(200,0);
               return 57;
           case 2:
               int g = payUp(500,1);
               return 57;
           case 3:
               int x = payUp(35000,2);
               return 57;
           case 4:
               int h =  payUp(15000,3);
               return 57;
           case 5:
               int k =  payUp(20000,4);
               return 57;
           case 0:
               System.out.println("Goodbye ig.");
               return 0;
               default:
               productBought = 58;
       }
return 5;
        }
        public static int payUp(int payRequired, int type) {
        int amountPaid = 0;
        Scanner can = new Scanner(System.in);
        String[] names = {"Hostage", "Arms", "ICMBs", "Missle Launcher & Silo", "Private Militia"};
            System.out.println("Selected Product: " + names[type] + " -=- Cost: " + payRequired);
            System.out.println("Enter your payment -=- Separate payments of $100, $500, $1000, $5000, or $10000 required");
            while(amountPaid<payRequired){
                amountPaid = can.nextInt() + amountPaid;
                int amountLeft = payRequired-amountPaid;
                if (amountLeft>0){System.out.println("More money required -=- Please enter " + amountLeft +" more dollars.");
            }}
            if (amountPaid>payRequired) {
                int change = amountPaid - payRequired;
                System.out.println("Change: " + change);
            }
        System.out.println("Thank you for paying. Your item will be dispensed shortly.");
            return 1;
        }
    }

