package hackerRank;

import java.sql.SQLOutput;
import java.util.*;

public class Maps {

    public static void main(String []argh){
        Map<String, Integer> phonebook = new HashMap<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Inout num of iterations: ");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Input name: ");
            String name = in.next();
            System.out.println("Input number");
            int phone = in.nextInt();
            // Write code here

            phonebook.put(name, phone);
         }
        System.out.println(phonebook);

        while(in.hasNext()){
            String s = in.next();
            // Write code here
            int number = phonebook.get(s);
            if(phonebook.containsKey(s)){
                System.out.println(s + "=" + number);
            }else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

    }
