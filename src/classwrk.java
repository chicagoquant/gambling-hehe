public class classwrk {
    public static void main(String[] args) {
int[] hi = {(int) (Math.random()*10), (int) (Math.random()*10), (int) (Math.random()*10), (int) (Math.random()*10), (int) (Math.random()*10 )};
        for (int i = 0; i<=4; i++) {
            System.out.println(hi[i]);
        }
for (int i = 0; i<5; i++) {
            hi[i] = hi[i]*2;
        }
System.out.println("#DoubledNumbersBeLike I know right im so popular doesn't everyone like me??");
        for (int i = 0; i<=4; i++) {
            System.out.println(hi[i]);
        }
int Int = hi[0];
        for (int i = 0; i<=4; i++) {
            if (hi[i] < Int) {
                Int = hi[i];
            }
        }
        System.out.println("lowest number -=- " + Int);
        int sum = 0;
        for (int i = 0; i<=(hi.length-(hi.length%2))-1; i = i+2) {
            sum = sum + hi[i];
        }
        System.out.println(sum);
        System.out.println("-=-");
        int[] ih = new int[5];
        int d = 0;
for (int i =4; i >=0;i--) {


    ih[d] = hi[i];
    d += 1;
}
        for (int i = 0; i<=4; i++) {
            System.out.println(ih[i]);
        }
        int secMax = hi[0];
        int max = hi[0];
        for (int i = 0; i<=4; i++) {
            if (hi[i] > max) {
                max = hi[i];
            }
        }
        for (int i = 0; i<=4; i++) {
            if ((hi[i] < max)&&(hi[i]>secMax)) {
                secMax = hi[i];
            }

        }
        System.out.println("Max: " + max + " Second Max: " + secMax);
        int[] hi2 = new int[5];
        for (int i = 0; i<=4; i++) {
            hi2[(i+1)%4] = hi[i];
        }
        System.out.println("-=-=-=-=-");
        for (int i = 0; i<=4; i++) {
            System.out.println(hi[i]);
        }
        System.out.println("-=-=-=-=-");
        for (int i = 0; i<=4; i++) {
            System.out.println(hi2[i]);
        }
    }
    }

