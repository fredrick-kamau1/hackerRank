package hackerRank;

public class consecutiveOnes {
    public static void main(String[] args) {
        int n = 125;
        System.out.println(convertBinary(n));


    }

    public static int numDigits(int n){
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int maxNum(int n) {
        int count = 0;
        int  max = Integer.MIN_VALUE;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit == 1) {
                count++;
            } else if (lastDigit == 0) {
                count = 0;
            }
            n /= 10;

            if(count > max){
                max = count;
            }
        }
        return max;
    }

    //My implementation
    public static int convertBinary(int n){
        int remainder = 0;
        int count = 0;
        int maxCount = 0;
        while(n > 0){
           remainder = n % 2;
            if(remainder == 1){
                count++;
            } else if(remainder == 0){
                count = 0;
            }
           n /= 2; // remove last digit

            if(count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }

    //Different implementation from Hackerrank

    /* public class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();

            char[] binary = Integer.toBinaryString(n).toCharArray();
            int tmpCount = 0;
            int maxCount = 0;
            for(int i = 0; i < binary.length; i++){
                tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1;
                if(tmpCount > maxCount){
                    maxCount = tmpCount;
                }
            }
            System.out.println(maxCount);
        }
    }*/
}
