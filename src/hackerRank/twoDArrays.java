package hackerRank;

import java.util.Arrays;

public class twoDArrays {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] seats = new int[8][9];
        //System.out.println(Arrays.deepToString(nums));
        //arrPrint(nums);
        //System.out.println(arrSum(nums));
        //seats(seats);
        int num = Integer.MAX_VALUE;
    }

    public static void arrPrint(int[][] nums){
        for(int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[row].length ; col++){
                System.out.print(nums[row][col]);
            }
                
            }
            System.out.println();
        }
    

           
    
    public static int arrSum(int[][] arr){
        int rows = arr.length;
        int columns = arr[0].length;

        int max_hourglass_sum = Integer.MIN_VALUE;

        for(int i = 0; i < rows-2; i++){
            for (int j = 0; j < columns-2 ; j++){
                int current_hourglass_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                                                        arr[i+1][j+1] +
                                            arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                max_hourglass_sum = Math.max(max_hourglass_sum, current_hourglass_sum);
                /*if(current_hourglass_sum> max_hourglass_sum){
                    max_hourglass_sum = current_hourglass_sum;
                }*/
            }
        }

        return max_hourglass_sum;
    }

    public static void seats(int[][] arr){
        int rows = arr.length;
        int columns = arr[0].length;

        //initialize array
        for(int i = 1; i < rows; i++){
            arr[i][0] = i;
            for (int j = 1; j < columns ; j++) {
                arr[0][j] = j;
            }
            System.out.println();
        }

        //Print array
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    }
