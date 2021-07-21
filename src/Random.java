//Print the numbers from 1 to 10 in random order

import java.util.ArrayList;
import java.util.Collections;

public class Random {

    public static void main(String[] args) {

        ArrayList<Integer> randomList = new ArrayList<>(); //Create an empty list named "randomList" that will hold 10 values from 1 to 10

        for (int i = 1; i < 11; i++) {     //Add the numbers from 1 to 10 to our randomList
            randomList.add(i);
        }

        Collections.shuffle(randomList);  //Using the shuffle method of the Collections Object we randomize the order of the randomList

        System.out.println(randomList);   //We print the list
    }

}