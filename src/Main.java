//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h = 2;
        int b = 0;
     while (h == 2) {
         b =Gamble(b);

     }
    }

    public static int Gamble(int money) {
        Scanner pickGame = new Scanner(System.in);
        System.out.println("You had " + money + " dollars from the last round. Would you like to keep that balance, or get some other amount of money? Enter 1 to keep that balance, enter 2 to change it.");
        if (pickGame.nextInt() == 1) {
            System.out.println("Okay. You will start with $" + money);
        } else {
            System.out.println("How much money do you want to start with?");
            money = pickGame.nextInt();
        }

        System.out.println("Pick a game to play.");
        System.out.println("Roulette Wheels - 1");
        System.out.println("Slot Machines - 2");
        System.out.println("Lottery - 3");
        int gamePicked = pickGame.nextInt();
        if (gamePicked == 1) {
            return(playRoulette(money));
        } else if (gamePicked == 2){
            System.out.println("Pick a slot machine.");
return(playSlot(money));
        } else if(gamePicked == 3) {
            return(playLot(money));
        }
        return(5);
    }

    public static int playRoulette(int money) {
        Scanner play = new Scanner(System.in);
        System.out.println("How many numbers would you like to bet on? (Numbers are 0-35)");
        System.out.println("Bet on 1 number, winning yields 35 times your money.");
        System.out.println("Bet on 2 numbers, winning yields 17 times your money.");
        System.out.println("Bet on 3 numbers, winning yields 11 times your money.");
        System.out.println("Bet on 4 numbers, winning yields 8 times your money.");
        System.out.println("Bet on 6 numbers, winning yields 5 times your money.");
        System.out.println("Enter the amount of numbers you would like to bet on.");
        System.out.println("When you are asked the number(s) you are betting on, if you are betting on multiple numbers, please separate them by spaces.");
        int numbersBetting = play.nextInt();
        System.out.println("How much would you like to bet? Remember, you currently have $" + money);
        int bet = play.nextInt();
        int randNum1 = (int) (Math.random() * 36);
        int randNum2 = (int) (Math.random() * 36);
      int a = 5;
        if (randNum1>29) {
          a = -1;
      } else {
          a = 1;
      }


        if (numbersBetting == 1) {
            System.out.println("What 1 number would you like to bet on?");
            int uselessStuff = play.nextInt();
            if (randNum1 == randNum2) {
                System.out.println("Congrats! You won! You have won " + bet * 35 + " dollars in winnings! Your total balance is $" + (bet * 35) + money);
                money = ((bet * 35) + money);
            } else {
                System.out.println("Sorry, you lost. Your new balance is " + (money - bet));
                money = money - bet;
                System.out.println("Another round will be started. You will keep your money.");

                }
                }
                if (numbersBetting == 2) {
                    System.out.println("What 2 numbers would you like to bet on?");
                    int uselessStuff = play.nextInt();
                    if ((randNum1 ==  randNum2)||(randNum1 + 1*a == randNum2)) {
                        System.out.println("Congrats! You won! You have won " + bet * 17 + " dollars in winnings! Your total balance is $" + (bet * 17) + money);
                        money = ((bet * 17) + money);
                    } else {
                        System.out.println("Sorry, you lost. Your new balance is " + (money - bet));
                        money = money - bet;
                        System.out.println("Another round will be started. You will keep your money.");
                }}
        int uselessStuff;
        if (numbersBetting == 3) {
                    System.out.println("What 3 numbers would you like to bet on?");
                     uselessStuff = play.nextInt();
                    if ((randNum1 ==  randNum2)||(randNum1 + 1*a == randNum2)||(randNum1 + 2*a == randNum2)) {
                        System.out.println("Congrats! You won! You have won " + bet * 11 + " dollars in winnings! Your total balance is $" + (bet * 11) + money);
                        money = ((bet * 11) + money);
                    } else {
                        System.out.println("Sorry, you lost. Your new balance is " + (money - bet));
                        money = money - bet;
                        System.out.println("Another round will be started. You will keep your money.");
                    }}
                        if (numbersBetting == 4) {
                            System.out.println("What 2 numbers would you like to bet on?");
                            uselessStuff = play.nextInt();
                            if ((randNum1 == randNum2) || (randNum1 + 1 * a == randNum2) || (randNum1 + 2 * a == randNum2) || (randNum1 + 3 * a == randNum2)) {
                                System.out.println("Congrats! You won! You have won " + bet * 8 + " dollars in winnings! Your total balance is $" + (bet * 8) + money);
                                money = ((bet * 8) + money);
                            } else {
                                System.out.println("Sorry, you lost. Your new balance is " + (money - bet));
                                money = money - bet;
                                System.out.println("Another round will be started. You will keep your money.");
                            }}
                            if (numbersBetting == 6) {
                                System.out.println("What 6 numbers would you like to bet on?");
                                uselessStuff = play.nextInt();
                                if ((randNum1 == randNum2) || (randNum1 + 1 * a == randNum2) || (randNum1 + 2 * a == randNum2) || (randNum1 + 3 * a == randNum2) || (randNum1 + 4 * a == randNum2) || (randNum1 + 5 * a == randNum2)) {
                                    System.out.println("Congrats! You won! You have won " + bet * 5 + " dollars in winnings! Your total balance is $" + (bet * 5) + money);
                                    money = ((bet * 5) + money);
                                } else {
                                    System.out.println("Sorry, you lost. Your new balance is " + (money - bet));
                                    money = money - bet;
                                    System.out.println("Another round will be started. You will keep your money.");
                                }}
                                return (money);
                            }
                            public static int playSlot(int money) {
                                Scanner play = new Scanner(System.in);
                                System.out.println("Which Slot Machine would you like to play?");
                                System.out.println("Easy slot machine. Winning chance is 1 out of 15, payoff is $25. One spin costs $3.");
                                System.out.println("Medium slot machine. Winning chance is 1 out of 40, payoff is $100. One spin costs $8.");
                                System.out.println("Hard slot machine. Winning chance is 1 out of 100, payoff is $500. One spin costs $14.");
                                System.out.println("Impossible slot machine. Winning chance is 1 out of 10,000, payoff is a jackpot of 75,000. One spin costs $21.");
                                System.out.println("Enter 1 for easy, 2 for medium, 3 for hard, and 4 for impossible.");
                                int slotMachine = play.nextInt();
                                int[][] slotInfo = {{15, 25, 3}, {40, 100, 8}, {100, 500, 14}, {10000, 75000, 21}};
                                String[] symbolsP2 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", };
                                String[] symbolsP1 = {"♠", "♥", "♦", "♣", "♠", "♥", "♦", "♣" };
                                System.out.println("How many spins would you like?");
                                    int spins = play.nextInt();
                                int cost = slotInfo[slotMachine-1][2] * spins;
                                System.out.println("That will cost $" + cost + ".");
                                int spinsDone = 0;
                                while (spins != spinsDone){
                                    spinsDone++;
                                    System.out.println("Spin number " + spinsDone);
                                    int randNum1 = (int) (Math.random() * slotInfo[slotMachine-1][0] + 1);
                                    int randNum2 = (int) (Math.random() * slotInfo[slotMachine-1][0] + 1);
                                    int randNum3 = (int) (Math.random() * 5);
                                    int randNum4 = (int) (Math.random() * 14);
                                    if (randNum1 == randNum2)  {
                                        String winningCombo = new StringBuilder().append("|").append(symbolsP1[randNum3]).append(symbolsP2[randNum4]).toString();
                                        money = money + slotInfo[slotMachine-1][1];
                                        System.out.println("Wow! You won $" + slotInfo[slotMachine-1][1] + "! Your total balance is now $" + money);
                                        System.out.println("The slot machine landed on " + winningCombo + winningCombo + winningCombo + "|");
                                    } else if (randNum1 != randNum2) {
                                        int randNum5 = (int) (Math.random() * 5);
                                        int randNum6 = (int) (Math.random() * 14);
                                        int randNum7 = (int) (Math.random() * 5);
                                        int randNum8 = (int) (Math.random() * 14);
                                        while ((randNum3 + randNum4 == randNum5 + randNum6)&&(randNum3 + randNum4 == randNum7 + randNum8)) {
                                            randNum5 = (int) (Math.random() * 5);
                                            randNum6 = (int) (Math.random() * 14);
                                            randNum7 = (int) (Math.random() * 5);
                                            randNum8 = (int) (Math.random() * 14);
                                        }
                                        String losingCombo1 = new StringBuilder().append("|").append(symbolsP1[randNum5]).append(symbolsP2[randNum6]).toString();
                                        String losingCombo2 = new StringBuilder().append("|").append(symbolsP1[randNum7]).append(symbolsP2[randNum8]).toString();
                                        String losingCombo3 = new StringBuilder().append("|").append(symbolsP1[randNum3]).append(symbolsP2[randNum4]).toString();
                                        money = money - slotInfo[slotMachine-1][2];

                                        System.out.println("Man! You lost.  Your total balance is now $" + money);
                                        System.out.println("The slot machine landed on " + losingCombo1 + losingCombo2 + losingCombo3 + "|");
                                    }
                                }
                                return money;
                            }
                            public static int playLot(int money) {
                                Scanner play = new Scanner(System.in);
                                System.out.println("The lottery rules are as follows:");
                                System.out.println("1. You can pick your numbers");
                                System.out.println("2. The numbers are from 1-99. (Not 0)");
                                System.out.println("3. You can pick how many numbers you want your card to have.");
                                System.out.println("The more numbers the card has, the higher your chance to lose.");
                                System.out.println("Each extra number you have adds a multiplier to your bet if you win.");
                                System.out.println("The multiplier is a bit complicated. It uses this formula -> (bet^amountOfNumbers+1)/(amountOfNumbers+1)*bet, decimals rounded down (If you get to something in e, like 1.66667e+10, it will be rounded to 1e+10). If you had a $10 bet and you had 10 numbers, you would get $100,000,000,000 back. If you only had 1 number, then you would only get $100 back. ");
                                System.out.println("For example, say you had the numbers 63 98 31 2 58. Since you had 5 numbers, you would have had a ^6 multiplier.");
                                System.out.println("If your bet was $1,000, and you won with those numbers, you would get $1,000,000,000,000,000,000,000 back.");
                                System.out.println("4. You can buy multiple cards with different sets of winning numbers at once, but you will have to pay for each one, and the numbers on each of the cards you buy will stay the same.");
                                System.out.println("Because of rule #4, you might not want to place a high bet on an unlikely amount of numbers.");
                                System.out.println("Those are the rules.");
                                System.out.println("How many numbers would you like to play with? Max 20, if you go above 20 it will be rounded down to 20.");
                                int numAmount = play.nextInt();
                                if(numAmount >20){numAmount = 20;}
                                int numbersConfirmed = 0;
                                int[] cardNums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                                while (numbersConfirmed<numAmount) {
                                    numbersConfirmed++;
                                    System.out.println("Number " + numbersConfirmed + ". What would you like number " + numbersConfirmed + " on your card to be?");
                                    cardNums[numbersConfirmed-1] = play.nextInt();

                                }
                                System.out.println("Your card is " + Arrays.toString(cardNums));

                                System.out.println("How many times would you like to buy that card? Remember, each card is 1 bet, and each card has the same bet on it.");
                                int cardsBought = play.nextInt();
                                System.out.println("How much money would you like to bet on your card(s)? Remember, you have $" + money);
                                int bet =  play.nextInt();
                                int totalBet = bet*cardsBought;
                                int[] winningCardNums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


















                                return money;
                            }
                        }

                    




