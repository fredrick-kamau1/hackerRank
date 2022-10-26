package random;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cinema: ");
        System.out.println("  1 2 3 4 5 6 7 8");

        for(int i = 1; i < 8; i++){
            System.out.print(i + " ");
            for(int j = 1; j < 9; j++){
                System.out.print("S ");
            }
            System.out.println();
        }

        System.out.print("Enter the number of rows: \n> ");
        int rows = input.nextInt();
        System.out.print("Enter the number of seats in each row: \n> ");
        int seats = input.nextInt();

        int price = 0;
        int numSeats = rows * seats;

        int frontHalfOfRows = numSeats / 2;
        int backHalfOfRows = numSeats - frontHalfOfRows;
        if(numSeats <= 60){
            price = numSeats * 10;
        }else {
            price = (numSeats * frontHalfOfRows * 10) +
                    (numSeats * backHalfOfRows * 8);
        }
        System.out.println("Totals income: \n$" + price);
    }
}
