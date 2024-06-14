package com.issuemoa.user.gateway;

import java.util.*;

public class Notepad {
    public static void main(String[] args) {
        Map<Integer,Integer> hMap = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(result);

        char c = 't';
        String str = "str";
    }
}
