package com.xxx.test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepleceString {

    public static void main(String[] args) {
        //String str ="abcccbad";// ccc要被前面的b成bbb
        String str  = replaceConsecutiveDuplicates("abbbbd"); // abbbad, ccc is replaced by b
        System.out.println(str);


    }

    public static String replaceConsecutiveDuplicates(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (i < sb.length() - 2) {
            if (sb.charAt(i) == sb.charAt(i+1) && sb.charAt(i) == sb.charAt(i+2)) {
                char replacement = (char) (sb.charAt(i) - 1);
                sb.replace(i, i+3, String.valueOf(replacement));

            } else {
                i++;
            }
        }
        return sb.toString();
    }


}
