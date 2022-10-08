package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class arrays {

    public static void main(String[] args) {

            List<Integer> ls = new ArrayList<>();
            ls.add(1);
            ls.add(2);
            ls.add(3);
            ls.add(4);

        Integer[] print = new Integer[ls.size()];
        print = reverse(ls.toArray(print));

        for(Integer num: print){
            System.out.print(num + " ");
        }

    }

    public static Integer[] reverse (Integer[] arr) {
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        return arr;
    }


}
