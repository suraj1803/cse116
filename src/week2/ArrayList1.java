package week2;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 1; i <= 5; i++)
            arr1.add(i);
        System.out.println(sum(arr1));
    }

    public static int sum(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i);
        }
        return result;
    }
}
