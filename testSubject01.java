package com.xxx.test;

import java.util.*;
import java.util.stream.Collectors;

public class testSubject01 {

    public static void main(String[] args) {

        String str = testSubject01.removeConsecutiveIdenticalChars("aabcccbbad");
        System.out.println(str);


    }

    public static  String removeConsecutiveIdenticalChars(String str) {
        int x=0,y=1;
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for(Character c : str.toCharArray()){
            list.add(c);
        }

        Collections.sort(list);
        while(x<y && x< list.size() && y<list.size()) {
            Character c  = list.get(y-1);
            if(list.get(x).equals(c)) {
                list.remove(x);
            }else {
                x++;
                y++;
            }
        }

        for(Character c : list){
            sb.append(String.valueOf(c));
        }
        return sb.toString();
    }


    private static StringBuilder dele(String str1) {
        String s1 = str1.toUpperCase();
        int i=0,j=1;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for(int k=0;k<s1.length();k++) {
            arrayList.add(s1.charAt(k));
        }
        System.out.println(arrayList.toString());
        while(i<j&&i<arrayList.size()&&j<arrayList.size()) {
            if(arrayList.get(i).equals(arrayList.get(j))) {
                arrayList.remove(j);
            }else {
                i++;
                j++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Object character:arrayList) {
            stringBuilder.append(character);
        }
        return stringBuilder;
    }
}




