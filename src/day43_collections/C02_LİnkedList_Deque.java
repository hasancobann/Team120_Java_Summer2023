package day43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LİnkedList_Deque {
    public static void main(String[] args) {

        /*
        Deque : double ended queue demektir. Çift başlı kuyruk   Baştan sondan eklem yapılabilir anlamında
        iki baştan da işlem yapıldığı için pek çok method'un firdt ve last şeklinde versiyonları olur.
         */

        Deque<String> isimler=new LinkedList<>();

        isimler.add("Cemil"); // List'deki add gibidir. Nereye ekleyeceğini belirtmezsek sona ekler.
        isimler.addFirst("Resul");
        isimler.addLast("Mehmet");
        isimler.addLast("Resul");
        isimler.add("Eyüp");
        isimler.add("Kaan");  //[Resul, Cemil, Mehmet, Resul, Eyüp, Kaan]

        System.out.println(isimler.removeLast()); // Kaan ==> sondaki elemanı silip bize getirdi
        // [Resul, Cemil, Mehmet, Resul, Eyüp]

        System.out.println(isimler.removeLastOccurrence("Resul")); // true ==> Resul'un son kullanımını  varsa siler ve true döndürür
        //[Resul, Cemil, Mehmet, Eyüp]

        System.out.println(isimler.removeLastOccurrence("Hilal")); // false ==> Hilal olmadığı için false
        //[Resul, Cemil, Mehmet, Eyüp]

        System.out.println(isimler.pollFirst()); // Resul  ==> ilk elemanı siler ve getirir list boşsa null döndürür
        //[Cemil, Mehmet, Eyüp]

        System.out.println(isimler.pop()); // Cemil ==>ilk elemanı siler ve getirir list boşsa hata döndürür
        //[Mehmet, Eyüp]

        System.out.println(isimler.offerFirst("Buğra")); // [Buğra, Mehmet, Eyüp]

        System.out.println(isimler.peekFirst()); //  Buğra  ==> ilk elementi getirir ama silmez. list boşsa null döndürür
        //[Buğra, Mehmet, Eyüp]

        System.out.println(isimler.element()); // Buğra ==> peek ile aynı ancak bu boş olursa exception döndürür
        // [Buğra, Mehmet, Eyüp]

        System.out.println(isimler.hashCode());// 380338678 ==> listenin o anki durumuna göre javanın oluşturduğu code



        System.out.println(isimler);


    }
}
