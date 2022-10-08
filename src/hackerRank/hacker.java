package hackerRank;

import java.util.Scanner;

public class hacker {

    public int age;

    public hacker(int initialAge){
        if(initialAge < 0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        this.age = initialAge;

    }

    public int yearPasses(){
        return this.age++;
    }

    public void amIOld(){

            if (this.age < 13) {
                System.out.println("You are young.");
            } else if (this.age >= 13 && this.age < 18) {
                System.out.println("You are a teenager.");
            } else if (this.age >= 18 && this.age <= 30) {
                System.out.println("You are old.");
            }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        System.out.println(T);

        while(T >= 1 && T <= 10){
            String S = input.next();
            for (int i = 0; i < S.length(); i++){
                if(i % 2 == 0){
                    System.out.print(S.charAt(i));
                }
            }
            System.out.print(" ");

            for (int i = 0; i < S.length(); i++){
                if(i % 2 != 0){
                    System.out.print(S.charAt(i));
                }
            }
            System.out.println();
            T--;
        }


    }



}
