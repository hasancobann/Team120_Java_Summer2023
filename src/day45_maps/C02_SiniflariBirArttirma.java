package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C02_SiniflariBirArttirma {
    public static void main(String[] args) {

        // Öğrenci map'inde yıl sonu düzenlemesi yapalım.
        // 9,10,11. sınıftaki öğrencilerin sınıflarını 1 arttırın
        // 12. sınıftaki çğrenciler için sınıf bilgisi olarak mezun yazın.

        Map<Integer, String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();

        ogrenciMap=MethodDeposu.yilSonuSinifArttir(ogrenciMap);

        System.out.println(ogrenciMap);

    }
}
