package day43_collections;

import java.util.*;

public class C03_ArraydenTekrarEdenleriSilme {
    public static void main(String[] args) {

        int[] arr = {1, 25, 64, 5, 6, 34, 1, 2, 3, 5, 6, 2, 4, 2, 3, 8, 4, 3, 9,};

        // array'de tekrar edilenleri silip unique hale getirin

        /*
        boş bir list oluşturup, arry'deki elementleri tek tek ele alıp element list'te yoksa List'e ekledik
         */

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int each : arr
        ) {
            if (!tekrarsizList.contains(each)) {
                tekrarsizList.add(each);
            }

        }

        System.out.println(tekrarsizList); // [1, 25, 64, 5, 6, 34, 2, 3, 4, 8, 9]

        // aynı işlemi set ile daha kolay bir şekilde yapabiliriz.

        Set<Integer> tekrarsizSet = new TreeSet<>(); // doğal sıralamayla verir
        for (int each : arr
        ) {
            tekrarsizSet.add(each);
        }

        System.out.println(tekrarsizSet); // [1, 2, 3, 4, 5, 6, 8, 9, 25, 34, 64]

        System.out.println(Arrays.toString(arr)); //[1, 25, 64, 5, 6, 34, 1, 2, 3, 5, 6, 2, 4, 2, 3, 8, 4, 3, 9]

        // tekrarsız elemanları set olarak elde ettik
        //array'i set'deki elementlerden oluşan hale dönüştürelim

        int index = 0;
        arr = new int[tekrarsizSet.size()]; // tekrarsizSet uzunluğunda arr'yi güncelledik
        for (Integer each : tekrarsizSet // set index desteklemediği için for-each kullandık
        ) {
            arr[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 8, 9, 25, 34, 64]
    }


}
