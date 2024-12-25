//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.HashMap;
import java.util.Scanner;

public class GamblingHEHEHEHE {
    public static void main(String[] args) {
        int money = 0;
        while (true) {
            money = Gamble(money);

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
        System.out.println("Blackjack - 4");
        int gamePicked = pickGame.nextInt();
        switch (gamePicked) {
            case 1:
                return playRoulette(money);

            case 2:
                return playSlot(money);

            case 3:
                return playLot(money);

            case 4:
                return playBlackjack(money);

            default:
                return money;
        }


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
        int a = 1;
        if (randNum1 > 29) {
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
            if ((randNum1 == randNum2) || (randNum1 + 1 * a == randNum2)) {
                System.out.println("Congrats! You won! You have won " + bet * 17 + " dollars in winnings! Your total balance is $" + (bet * 17) + money);
                money = ((bet * 17) + money);
            } else {
                System.out.println("Sorry, you lost. Your new balance is " + (money - bet));
                money = money - bet;
                System.out.println("Another round will be started. You will keep your money.");
            }
        }
        int uselessStuff;
        if (numbersBetting == 3) {
            System.out.println("What 3 numbers would you like to bet on?");
            uselessStuff = play.nextInt();
            if ((randNum1 == randNum2) || (randNum1 + 1 * a == randNum2) || (randNum1 + 2 * a == randNum2)) {
                System.out.println("Congrats! You won! You have won " + bet * 11 + " dollars in winnings! Your total balance is $" + (bet * 11) + money);
                money = ((bet * 11) + money);
            } else {
                System.out.println("Sorry, you lost. Your new balance is " + (money - bet));
                money = money - bet;
                System.out.println("Another round will be started. You will keep your money.");
            }
        }
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
            }
        }
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
            }
        }
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
        int[][] slotInfo = {
                {
                        15, // Winning chances //
                        25, // Money for winning //
                        3   // Cost per spin //
                },
                {
                        40,
                        100,
                        8
                },
                {
                        100,
                        500,
                        14
                },
                {
                        10000,
                        75000,
                        21
                }
        };
        String[] symbolsP2 = {
                "A",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "J",
                "Q",
                "K"
        };
        String[] symbolsP1 = {
                "♠",
                "♥",
                "♦",
                "♣"
        };
        System.out.println("How many spins would you like?");
        int spins = play.nextInt();
        int cost = slotInfo[slotMachine - 1][2] * spins;
        System.out.println("That will cost $" + cost + ".");
        int spinsDone = 0;
        while (spins != spinsDone) {
            spinsDone++;
            System.out.println("Spin number " + spinsDone);
            int randNum1 = (int) (Math.random() * slotInfo[slotMachine - 1][0]);
            int randNum2 = (int) (Math.random() * slotInfo[slotMachine - 1][0]);
            int randSuit1 = getRandNum(4);
            int randCard1 = getRandNum(13);
            if (randNum1 == randNum2) {
                String winningCombo = new StringBuilder().append("|").append(symbolsP1[randSuit1]).append(symbolsP2[randCard1]).toString();
                money = money + slotInfo[slotMachine - 1][1];
                System.out.println("Wow! You won $" + slotInfo[slotMachine - 1][1] + "! Your total balance is now $" + money);
                System.out.println("The slot machine landed on " + winningCombo + winningCombo + winningCombo + "|");
            } else {
                int randSuit2 = getRandNum(4);
                int randCard2 = getRandNum(13);
                int randSuit3 = getRandNum(4);
                int randCard3 = getRandNum(13);
                while ((randSuit1 + randCard1 == randSuit2 + randCard2) && (randSuit1 + randCard1 == randSuit3 + randCard3)) {
                    randSuit2 = getRandNum(4);
                    randCard2 = getRandNum(13);
                    randSuit3 = getRandNum(4);
                    randCard3 = getRandNum(13);
                }
                String losingCombo1 = new StringBuilder().append("|").append(symbolsP1[randSuit2]).append(symbolsP2[randCard2]).toString();
                String losingCombo2 = new StringBuilder().append("|").append(symbolsP1[randSuit3]).append(symbolsP2[randCard3]).toString();
                String losingCombo3 = new StringBuilder().append("|").append(symbolsP1[randSuit1]).append(symbolsP2[randCard1]).toString();
                money = money - slotInfo[slotMachine - 1][2];

                System.out.println("Man! You lost.  Your total balance is now $" + money);
                System.out.println("The slot machine landed on " + losingCombo1 + losingCombo2 + losingCombo3 + "|");
            }
        }
        return money;
    }


    private static int getRandNum(int maxNumNoteThatMinIsZeroByDefault) {
        return (int) (Math.random() * maxNumNoteThatMinIsZeroByDefault);
    }

    public static String randCard() {
        String[] symbolsP1 = {
                "♠",
                "♥",
                "♦",
                "♣"
        };
        String[] symbolsP2 = {
                "A",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "J",
                "Q",
                "K"
        };
        String randCard = new StringBuilder().append(symbolsP1[getRandNum(4)]).append(symbolsP2[getRandNum(13)]).toString();
        return randCard;
    }

    public static String randCardWNum(int randNum) {
        String[] symbolsP1 = {
                "♠",
                "♥",
                "♦",
                "♣"
        };
        String[] symbolsP2 = {
                "A",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "J",
                "Q",
                "K"
        };
        String randCard = new StringBuilder().append(symbolsP1[getRandNum(4)]).append(symbolsP2[randNum - 1]).toString();
        return randCard;
    }


    public static int playLot(int money) {
        Scanner play = new Scanner(System.in);
        System.out.println("The lottery rules are as follows:");
        System.out.println("1. You can pick your numbers");
        System.out.println("2. The numbers are from 1-99. (Not 0)");
        System.out.println("3. You can pick how many numbers you want your card to have.");
        System.out.println("The more numbers the card has, the higher your chance to lose.");
        System.out.println("Each extra number you have adds a multiplier to your bet if you win.");
        System.out.println("The multiplier is a bit complicated. It uses this formula -> (bet^amountOfNumbers+1)/(bet/amountOfNumbers), decimals rounded down.");
        System.out.println("For example, say you had the numbers 63 98 31 2 58. Since you had 5 numbers, you would have had a ^6 multiplier.");
        System.out.println("If your bet was $1,000, and you won with those numbers, you would get $5E15 back.");
        System.out.println("4. You can buy multiple cards with different sets of winning numbers at once, but you will have to pay for each one, and the numbers on each of the cards you buy will stay the same. (NOTE: Since the winning numbers are different each time, if you win one of your cards, that doesn't mean you will win all of them.)");
        System.out.println("Because of rule #4, you might not want to place a high bet on an unlikely amount of numbers.");
        System.out.println("Those are the rules.");
        System.out.println("How many numbers would you like to play with? Max 20, if you go above 20 it will be rounded down to 20.");
        int numAmount = play.nextInt();
        if (numAmount > 20) {
            numAmount = 20;
        }
        //MAKE SURE THIS IS A STRING//
        String[] cardNums = new String[20];
        int numbersConfirmed = 0;
        while (numbersConfirmed < numAmount) {
            numbersConfirmed++;
            System.out.println("Number " + numbersConfirmed + ". What would you like number " + numbersConfirmed + " on your card to be?");
            cardNums[numbersConfirmed - 1] = String.valueOf(play.nextInt());

        }
        System.out.println("Your card is " + readableArrayMaker(cardNums));

        System.out.println("How many times would you like to buy that card? Remember, each card is 1 bet, and each card has the same bet on it.");
        int cardsBought = play.nextInt();
        System.out.println("How much money would you like to bet on your card(s)? The maximum betting amount is 1 billion. Remember, you have $" + money);
        int bet = play.nextInt();
        if (bet > 1000000000) {
            bet = 1000000000;
        }
        int totalBet = bet * cardsBought;
        String[] winningCardNums = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        };
        double possibleWinnings = (Math.pow(bet, numAmount + 1) / ((bet) / numAmount));
        numbersConfirmed = 0;
        while (numbersConfirmed < numAmount) {
            numbersConfirmed++;
            winningCardNums[numbersConfirmed - 1] = String.valueOf(getRandNum(99) + 1);

        }
        numbersConfirmed = 0;
        while (numbersConfirmed < cardsBought) {
            numbersConfirmed++;
            System.out.println("Card Number " + numbersConfirmed);
            if (readableArrayMaker(cardNums).equals(readableArrayMaker(winningCardNums))) {
                money = (int) (money + possibleWinnings);
                System.out.println("Huh! You got real lucky, cause you won! Your winnings are " + possibleWinnings + ". The winning numbers were " + readableArrayMaker(winningCardNums) + ". You now have " + money);


            } else {
                System.out.println("Man. You lost. Your bet was " + bet + ", so you lost that much money. Bad luck, eh? By the way, the winning numbers were " + readableArrayMaker(winningCardNums));
                money = money - bet;

            }
            int numbersConfirmed1 = 0;
            while (numbersConfirmed1 < numAmount) {
                numbersConfirmed1++;
                winningCardNums[numbersConfirmed1 - 1] = String.valueOf(getRandNum(99) + 1);

            }
        }
        return money;
    }

    private static String readableArrayMaker(String[] inputArray) {
        int numbersRead = 0;
        int numbersTotal = inputArray.length;
        String outputString = "";
        while (numbersRead < numbersTotal) {
            numbersRead++;
            if (!inputArray[numbersRead - 1].equals("")) {
                outputString = new StringBuilder().append(outputString).append(" - ").append(inputArray[numbersRead - 1]).append(" - ").toString();
            }
        }
        return outputString;
    }

    public static int playBlackjack(int money) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(randCardWNum(1));
        }
        String[] showHand = new String[23];
        int dealerHand = 0;
        int[] dealerHandVals = new int[23];
        String dealerShow = "";
        System.out.println("These are the rules for blackjack.");
        System.out.println("1. To start, you get 2 cards. The dealer (Computer in this case) also gets 2 cards, but you can only see 1 of them.");
        System.out.println("2. On your turn, you can either\"hit\" or \"stand\". If you hit, you get another card. If you stand, you don't get another card, and the game is over.");
        System.out.println("3. Your goal is to get as close to a total value of 21 without going over 21. Face cards, like kings or queens count as 10.");
        System.out.println("4. Aces count as 11, but if getting eleven makes you go over 21, then the ace counts as a 1.");
        System.out.println("5. The best possible hand is 21, and you can keep going until you want to stand. However, the dealer has to stand once they reach a total of 18 or higher, so you have a slight advantage.");
        System.out.println("6. Betting wise, if you lose, you lose your money. If you win, you get your bet back doubled.");
        System.out.println("Those are the rules. Happy gambling!");


        return money;


    }

    public static boolean checkBust(String[] hand) {
        return (calcHandVal(hand) > 21);
    }

    public static int calcHandVal(String[] hand) {
        int[] handVals = new int[23];
        String[] cardFaces = {
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "J",
                "Q",
                "K",
                "A"
        };

        int[] cardVals = {
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10,
                10,
                10,
                10,
                11
        };
        HashMap<String, Integer> cardLookup = new HashMap<>();
        for (int i = 0; i < cardFaces.length; i++) {
            cardLookup.put(cardFaces[i], cardVals[i]);
        }

        int sum = 0;
        int aces = 0;

        for (String card : hand) {
            if (card.equals("A")) {
                aces++;
            } else {
                sum += cardLookup.get(card);
            }
        }
        for (; aces > 0; aces--) {
            if (sum + 11 > 21) {
                sum++;
            } else {
                sum += 11;
            }
        }

        return (sum);
    }

    public static String[] handSuitify(String[] hand) {
        HashMap<Integer, String> getSuit = new HashMap<>();

        for (int i = 0; i < CardConstants.SUITS.length; i++) {
            getSuit.put(i, CardConstants.SUITS[i]);
        }
        String[] newHand = new String[hand.length];

        for (int i = 0; i < hand.length; i++) {

            newHand[i] = (getSuit.get(getRandNum(CardConstants.SUITS.length))) + hand[i];

        }
        return newHand;
    }
}