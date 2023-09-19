package day45_maps;

import java.util.HashMap;
import java.util.Map;

public class C08_MapMethodlari {
    public static void main(String[] args) {

        Map<String, Integer> harfler = new HashMap<>();

        harfler.put("K", 25);
        harfler.put("L", 10);
        harfler.put("T", 5);
        harfler.put("Z", 50);
        harfler.put("A", 15);
        System.out.println(harfler); // {A=15, T=5, Z=50, K=25, L=10}

        System.out.println(harfler.putIfAbsent("L", 30)); //10 ==> Eğer L yoksa ekle değeri de 30 olsun.
        System.out.println(harfler);// {A=15, T=5, Z=50, K=25, L=10}

        // T'nin value'sunu 2 katına çıkarın
        int value = harfler.get("T"); // 5
        harfler.put("T", 2 * value);
        System.out.println(harfler); //{A=15, T=10, Z=50, K=25, L=10}

        //Z'nin değerini 20 arttır.
        harfler.compute("Z", (k, v) -> v + 20);
        System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=10}

        //L'nin değerini 3 katının 5 fazlası yapın.
        harfler.compute("L",(a,b)->3*b+5);
        System.out.println(harfler); //{A=15, T=10, Z=70, K=25, L=35}

        // map'de "M" yoksa değeri 50 olarak map'e ekleyin.
        //harfler.putIfAbsent("M",50);
        harfler.computeIfAbsent("M",v->50);
        System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=35, M=50}

        // T harfi var ise value'sunu 1 arttırın.
        harfler.computeIfPresent("T",(k,v)->v+1);
        System.out.println(harfler); // {A=15, T=11, Z=70, K=25, L=35, M=50}

    }
}
