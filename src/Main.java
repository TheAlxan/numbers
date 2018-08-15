import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        HashMap<Integer,Integer> dups = new HashMap<>();
        boolean flag = true;
        Scanner in = new Scanner(System.in);

        //----------------  INPUT OF NUMBERS ----------------------//
        int i=0;
        while(flag){
            System.out.println("Enter number #" + (i+++1) + " : ( 0 for end )");
            int tmp = in.nextInt();
            if(tmp == 0) flag = false;
            else nums.add(tmp);
        }

        //---------------- END OF INPUT OF NUMBERS ----------------------//
        //----------------  DETECTING REPEATED NUMBERS IN O(n)  ----------------------//

        for(int j=0;j<nums.size();j++){
            int k;
            if(dups.get(nums.get(j)) == null) k=0;
            else k=dups.get(nums.get(j));
            dups.put(nums.get(j) , k+1);
        }
        //----------------  END OF DETECTING REPEATED ONES  ----------------------//
        //----------------  OUTPUT  ----------------------//

        for(int j=0;j<nums.size();j++){
            if(dups.get(nums.get(j)) > 1)
                System.out.println("Number " + nums.get(j) + " was repeated " + dups.get(nums.get(j)) + " times");
        }

        //---------------- END OF OUTPUT  ----------------------//



    }
}
