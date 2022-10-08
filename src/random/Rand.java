package random;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


 class Rand {
    static long l = 10;

    private static String Rand;

     static int var2 = 200;
     public static void print() {
         System.out.println(var2);
     }
     public void print (int var1) {          //line n1
         System.out.println(var1);
         var2 = var2 + var1;                 //line n2
         print();
     }
    static public void main(String[] args) {
         print();



         Rand ran = new Rand();
         ran.print(100);
         ran.print();
           /* int seed = 20;
            Random r = new Random();
            int ans = r.nextInt(seed);
            System.out.println(ans);

            ArrayList a = new ArrayList();
            a.add("me");
            System.out.println(a.toString()); */

        List<Double> num = new ArrayList<>();
        num.add(1.0);

        System.out.println(num.get(0));
        System.out.println(num.indexOf(1));

        final String s = "OCJP";
        long l = 10l;
        System.out.println(s);

        int i = 1234;
        int rev = 0;
        //System.out.println(String.format("The value of i is: %n%d", i));
        //System.out.println("Please \n Fred");

        while(i!=0) {
            int digit = i % 10;
            rev = rev * 10 + digit;
            i /= 10;
        }
            System.out.println(rev);

        int number = 1947;
        String str = String.format("%08d", 1947);
        System.out.println(str);

        int total = 0;
        int n = 10;
        for (int j = n; j >= 1; --j){
            total += j;
        }
        System.out.println(total + " " );

        Random r = new Random(10);
        System.out.println(r.ints(2));

        String a  = "Java";
        StringBuffer b = new StringBuffer(a);
        String c = b.toString();
        if(a.equals(c)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        StringBuilder sb = new StringBuilder();
        String hi = "HelloWorld";
        sb.append("Hello").append("World");
        System.out.println(sb.toString());
        System.out.println(hi);

        float fValue = 120;


        main(args);
    }


}