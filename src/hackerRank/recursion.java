package hackerRank;

public class recursion {

    public static void main(String[] args) {
        int num = factorial(3);

        System.out.println(num);
    }

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
