import java.util.Arrays;


public class test {
    public static void main(String[] args) {
        bustWorks();
        handifyWorks();
    }

    public static void handifyWorks() {
        String[] hand = new String[]{"J", "9"};
        String[] newHand = GamblingHEHEHEHE.handSuitify(hand);
        if (newHand.length != hand.length) {
            System.out.println("fail");
        }
        for (int i = 0; i < hand.length; i++) {
            if (newHand[i].charAt(1) != hand[i].charAt(0)) {
                System.out.println("fail");
            }
            int j = 0;
            for (int d = 0; d < CardConstants.SUITS.length; d++) {
                if (newHand[i].charAt(0) == CardConstants.SUITS[d].charAt(0)) {
                    j = 1;
                }
            }
            if (j == 0) {
                System.out.println("fail");
            }
        }
    }


    public static void bustWorks() {
        int dealerHand = 0;
        int[] dealerHandVals = new int[23];
        String dealerShow = "";
        String[] hand = new String[23];

        boolean answer = GamblingHEHEHEHE.checkBust(new String[]{"A", "2"});
        if (answer == true) {
            System.out.println("Fail");
        }
        answer = GamblingHEHEHEHE.checkBust(new String[]{"J", "9", "A"});
        if (answer == true) {
            System.out.println("Fail");
        }
        answer = GamblingHEHEHEHE.checkBust(new String[]{"J", "9", "10", "2"});
        if (answer == false) {
            System.out.println("Fail");

        }
    }

}
