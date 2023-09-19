package day46_nestedMaps;

import java.util.TreeMap;

public class C02_TreeMapMethodlari {
    public static <TreeMapMap> void main(String[] args) {

        TreeMap<String, Integer> harfler = new TreeMap<>();

        harfler.put("K", 25);
        harfler.put("L", 10);
        harfler.put("T", 5);
        harfler.put("Z", 50);
        harfler.put("A", 15);
        System.out.println(harfler); // {A=15, K=25, L=10, T=5, Z=50}

        System.out.println(harfler.tailMap("L")); // {L=10, T=5, Z=50} ==> L dahil L den sonrakileri verir
        System.out.println(harfler.tailMap("C")); // {K=25, L=10, T=5, Z=50} ==> C nin olası yerinden itibaren sonrakileri verir

        System.out.println(harfler.tailMap("L", false)); // {T=5, Z=50} ==> L yi dahil etmeden sonrakileri ver
        System.out.println(harfler.tailMap("C", false)); // {K=25, L=10, T=5, Z=50} ==> C nin olası yerinden itibaren sonrakileri verir

        System.out.println(harfler.headMap("L")); // {A=15, K=25} ==> L yi dahil etmeden öncekileri  verir
        System.out.println(harfler.headMap("C")); // {A=15}  ==>C nin olası yerinden itibaren sonrakileri verir

        System.out.println(harfler.headMap("L", true)); // {A=15, K=25, L=10} ==> L'yi dahil ederek öncekileri ver
        System.out.println(harfler.headMap("C", true)); // {A=15} ==>C nin olası yerinden itibaren sonrakileri verir

        System.out.println(harfler.ceilingKey("K")); // K ==> K'ya eşit yada büyük olanlar içerisinde en büyüğünü verir.
        System.out.println(harfler.ceilingKey("N")); // T ==> K'ya eşit yada büyük olanlar içerisinde en büyüğünü verir. olmadığı için sonraki en büyük.

        System.out.println(harfler.higherKey("K")); // L ==> K'dan büyükler arasındaki en büyüğü ver. farkı eşitlik yok.

        System.out.println(harfler.ceilingEntry("K")); // K=25  K'ya eşit yada büyük olanlar içerisinde en büyüğünün value'sunu verir.
        System.out.println(harfler.higherEntry("K")); // L=10   K'dan büyükler arasındaki en büyüğün değerini verir.

        System.out.println(harfler.lowerKey("L")); // K ==> L den önceki en büyük key'i verir.
        System.out.println(harfler.lowerKey("S")); // L ==> olmayan(doğal sıralamaya göre yerini belirler) key'den önceki en büyük key'i verir.

        System.out.println(harfler.lowerEntry("L")); // K=25 L den önceki en büyük key'i value ile birlikte verir.
        System.out.println(harfler.lowerEntry("S")); // L=10 olmayan keyden önceki en büyük key'i value ile birlikte verir.

        System.out.println(harfler.floorKey("K")); // K ==>K'ya eşit ya da küçükler arasındaki en büyüğü verir.
        System.out.println(harfler.floorEntry("K")); // K=25

        System.out.println(harfler.floorEntry("S")); // L=10
        System.out.println(harfler.floorKey("S")); // L


        System.out.println(harfler.pollFirstEntry()); // A=15 A'yı kalıcı olarak siler ve bize getirir.
        System.out.println(harfler.pollLastEntry()); // Z=50 Z'yi kalıcı olarak siler ve bize getirir.

        System.out.println(harfler); // {K=25, L=10, T=5}

        System.out.println(harfler.descendingKeySet()); // [T, L, K] tersten sıralar ama kayddedilmez.
        System.out.println(harfler.descendingMap()); // {T=5, L=10, K=25}  tersten değerleriyle verir ama kaydedilmez.

        System.out.println(harfler); // {K=25, L=10, T=5}
    }
}
