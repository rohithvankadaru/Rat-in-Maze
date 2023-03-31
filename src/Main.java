import java.util.*;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 3;

        int[][] mat = {
        {1, 1, 0},
        {0, 1, 0},
        {1, 1, 1},
        };
        try{
            ArrayList<String> l = Solution.findSum(mat, n);
             Collections.sort(l);
            if(l == null) System.out.print(-1);
            for(String s : l){
                System.out.println(s);
            }
        }
      catch (Exception e){
          System.out.println("No Path");
      }
    }
}