package Lib;

import java.util.LinkedList;

public class Combi {

    long facto(long n) {
        long f = 1;
        for (; n >= 1; n--) {
            f *= n;
        }
        return f;
    }

    long combi(long n, long r) {
        return facto(n) / (facto(r) * facto(n - r));
    }

    void combiIndex(int start, int end, int size, LinkedList<Integer> list) {

        if (size <= 0) {
            // Write your function here
            // fun(list)
            // System.out.println(list);
            return;
        }

        for (int i = start; i <= end - size + 1; i++) {
            list.add(i);
            combiIndex(i + 1, end, size - 1, list);
            list.pollLast();

        }
    }

}
