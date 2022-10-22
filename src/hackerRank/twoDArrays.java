package hackerRank;

import java.util.Arrays;

public class twoDArrays {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(nums));

        for(int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[row].length ; col++){
                System.out.print(nums[row][col]);
            }
            System.out.println();            
        }
        
        for(int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[row].length ; col++){
                System.out.print(nums[row][col]);
            }
            System.out.println();
           
    }
}
