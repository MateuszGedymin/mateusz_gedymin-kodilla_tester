package petlaZWykorzystaniemOpiektow;

import java.lang.Math;

public class RandomNumbers {

    public static void main(String[] args) {
         int min = 0;
         int max = 30;
         int total = 0;

         while ( total < 5000) {
              int result = (int)(Math.random() * (max - min + 1) + min);
         }
    }

}