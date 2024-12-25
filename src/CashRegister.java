import java.util.Scanner;
public class CashRegister {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Cashier - Enter Customer Name Plz");
        String name = x.nextLine();
        String[][] foodInfo = {{""//Name of Unit
                ,""//Amount of Unit
                ,""//Price of Unit
        }, {"","",""}, {"","",""}};

        for (int i = 1; i<4; i++) {
            foodInfo = getFoodInfo(foodInfo, i);
        }
        double cost = getFoodCost(foodInfo);
        double discount = 0;
        if (cost>=500) {
            discount = 10;
        } else if (cost>=100) {
            discount = 5;
        }
        double costWT = getFoodCostWt(cost, discount);
        System.out.println("Customer Name - " + name);
        System.out.println("Item 1 - " + foodInfo[0][0] + " - Qty: " + foodInfo[0][1] + " - Price Per Unit: " + foodInfo[0][2] + " - Total Price: " + Double.parseDouble(foodInfo[0][1])*Double.parseDouble(foodInfo[0][2]));
        System.out.println("Item 2 - " + foodInfo[1][0] + " - Qty: " + foodInfo[1][1] + " - Price Per Unit: " + foodInfo[1][2] + " - Total Price: " + Double.parseDouble(foodInfo[1][1])*Double.parseDouble(foodInfo[1][2]));
        System.out.println("Item 3 - " + foodInfo[2][0] + " - Qty: " + foodInfo[2][1] + " - Price Per Unit: " + foodInfo[2][2] + " - Total Price: " + Double.parseDouble(foodInfo[2][1])*Double.parseDouble(foodInfo[2][2]));
        System.out.println("Total cost without tax or discounts - " + cost);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Tax: 10%");
        System.out.println("Total Cost - " + costWT);
    }
    public static double getFoodCostWt(double cost, double discount) {
        double tax = 10;
        double costWT = (cost)*(1-(discount/100))*(1.1);
        return costWT;
    }
    public static double getFoodCost(String[][] thing) {
        double totalCost = (Double.parseDouble(thing[0][2]) * Double.parseDouble(thing[0][1]))+(Double.parseDouble(thing[2][2]) * Double.parseDouble(thing[2][1]))+(Double.parseDouble(thing[1][2]) * Double.parseDouble(thing[1][1]));
        return totalCost;
    }
    public static String[][] getFoodInfo(String[][] foodInfo, int i) {
        Scanner x = new Scanner(System.in);
        System.out.println("Cashier - Enter Unit Name");
        String name = x.nextLine();
        System.out.println("Cashier - Enter Unit Quantity");
        String qty = x.nextLine();
        System.out.println("Cashier - Enter Price Per Unit");
        String ppu = x.nextLine();
        foodInfo[i-1][0] = name;
        foodInfo[i-1][1] = qty;
        foodInfo[i-1][2] = ppu;
        return foodInfo;
    }
}
