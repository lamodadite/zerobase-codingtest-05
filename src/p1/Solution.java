package p1;

import java.util.*;

public class Solution {
    public static boolean solution(String s, String t) {

        ArrayList<String> sList = new ArrayList<>();
        ArrayList<String> tList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            sList.add(String.valueOf(s.charAt(i)));
        }

        for (int i = 0; i < t.length(); i++) {
            tList.add(String.valueOf(t.charAt(i)));
        }

        Collections.sort(sList);
        Collections.sort(tList);

        if (sList.equals(tList)) {
            return true;
        }

        return false;
    }
}
