package p4;

public class Solution {
    public static int solution (int N, int[] branches) {

        int left = 0;
        int right = 0;

        for (int b : branches) {
            right = Math.max(b, right);
        }


        while (left < right) {
            int mid = (left + right) / 2;
            int cnt = 0;

            for (int b : branches) {
                cnt += b / mid;
            }


            if (cnt > N) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
