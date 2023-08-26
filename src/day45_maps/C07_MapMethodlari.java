package day45_maps;

import java.util.HashMap;
import java.util.Map;

public class C07_MapMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler=new HashMap<>();

        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);

        System.out.println(harfler); // {A=15, T=5, Z=50, K=25, L=10}

        harfler.put("L",40);
        System.out.println(harfler); // {A=15, T=5, Z=50, K=25, L=40}

        System.out.println(harfler.containsKey("T")); // true
        System.out.println(harfler.containsValue(5)); // true
        // Eğer value birleştirilmiş bir String ("Ali, Can, 12, H, MF") ise
        //harfler.containsValue("Ali") false döner.
        // Value'yu bir bütün olarak arar, value'nun bir parçasını kontrol etmez.

        System.out.println(harfler.getOrDefault("G", 0)); // 0
        System.out.println(harfler.getOrDefault("T", 0)); // 5
        // T nin value'sunu getir bulamazsan default olarak 0 getirir.

        System.out.println(harfler.get("G")); // null

        System.out.println(harfler.replace("F", 90)); // null
        System.out.println(harfler.replace("T", 90)); // 5 ==> T'yi buldum 90 la değiştirdim. 5'i de sqana getirdim.

        System.out.println(harfler.replace("A", 20, 45)); //false ==> A nin değeri 20 ise 45 yap. A'nın değeri 20 olmadığı için false
        System.out.println(harfler.replace("K", 25, 100)); // true
        System.out.println(harfler); // {A=15, T=90, Z=50, K=100, L=40}
        System.out.println(harfler.replace("X", 50, 90)); // false

        System.out.println(harfler.remove("Z")); // 50
        System.out.println(harfler); // {A=15, T=90, K=100, L=40}
        System.out.println(harfler.remove("Y")); // null
        System.out.println(harfler.remove("T", 70)); // false
        System.out.println(harfler.remove("T", 90)); // true
        System.out.println(harfler); // {A=15, K=100, L=40}


    }
}
