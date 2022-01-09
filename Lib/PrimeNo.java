package Lib;

import java.util.*;

class PrimeNo {

    ArrayList<Long> primeList = new ArrayList<>(1000);
    long currLimit;

    PrimeNo(long limit) {
        currLimit = 3;
        primeList.add(2L);
        primeList.add(3L);
        initList(limit);

    }

    void initList(long limit) {
        if (limit <= currLimit) {
            return;
        }

        if (limit % 2 == 0) {
            limit++;
        }

        for (long i = currLimit + 2; i <= limit; i += 2) {
            boolean flag = true;
            double sqrt = Math.sqrt(i);

            for (int div = 0; primeList.get(div) <= sqrt; div++) {
                if (i % primeList.get(div) == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                primeList.add(i);
            }
        }

        currLimit = limit;
    }

    boolean isPrime(long no) {
        initList(no);
        int i = Collections.binarySearch(primeList, no);
        return i >= 0;
    }

    List<Long> getPrimes(long min, long max) {
        initList(max);
        int minI = Collections.binarySearch(primeList, min);
        if (minI < 0) {
            minI = (-minI) - 1;
        }
        int maxI = Collections.binarySearch(primeList, max);
        if (maxI < 0) {
            maxI = (-maxI) - 1;
        } else {
            maxI++;
        }

        return primeList.subList(minI, maxI);

    }

}
