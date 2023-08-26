package day44_maps;

import java.util.Map;

public class C03_SinifListesi {
    public static void main(String[] args) {

        /*
        Öğrenci map'de sınıf ve şube verdiğimizde o sınıfta bulunan öğrenci isim ve soyisimleri yazdırın
         */

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.sinifSubedekiOnrenciListesiYazdir(ogrenciMap, 11, "h");
        /*
        11.sınıf h şubesindeki öğrenci listesi
        ==========================
        Ali Can
        Ali Cem
        Ayse Can
        Sevgi Cem
         */

    }
}
