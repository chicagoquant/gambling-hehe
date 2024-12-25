import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int b = 0;
        while (b != 6) {
            b = calc(b);
        }
    }
    public static int calc(int done) {
        Scanner can = new Scanner(System.in);
        System.out.println("Enter your operation: 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 for modulus/remainder, or 6 to exit the calculator");
        int operation = can.nextInt();
        System.out.println("First digit plz");
        int firstNum = can.nextInt();
        System.out.println("Second digit now");
        int secNum = can.nextInt();
        switch(operation) {
            case 1:
                int output = firstNum + secNum;
                System.out.println(firstNum + " plus " + secNum + " is " + output);
                return 5;
            case 2:
                 output = firstNum - secNum;
                System.out.println(firstNum + " minus " + secNum + " is " + output);
                return 5;
            case 3:
                output = firstNum * secNum;
                System.out.println(firstNum + " times " + secNum + " is " + output);
                return 5;
            case 4:
                output = firstNum / secNum;
                if (secNum == 0) {System.out.println("Cannot divide by 0");} else
                { System.out.println(firstNum + " divided by " + secNum + " is " + output);}
                return 5;
            case 5:
                output = firstNum%secNum;
                System.out.println(firstNum + " mod " + secNum + " is " + output);
                return 5;
            case 6:
                System.out.println("Exiting");
                return 6;
            default:
                return 5;

        }

    }
}
