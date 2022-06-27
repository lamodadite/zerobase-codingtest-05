package p3;

public class Solution {
    public static int solution(int[] arr) {

        int min = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            min = Math.min(min, arr[i]);
            if (arr[i] > min) {
                return i;
            }
        }

        return -1;
    }
}

class Solution {
    public int solution(int[] arr) {

    }
}