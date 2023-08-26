package day44_maps;

import java.util.Map;

public class C06_NumaraliOgrenciDeposu {
    public static void main(String[] args) {

        // tüm öğrencileri öğrenci no, isim, soy isim olarak yazdırın.

        Map<Integer,String> ogrenciMap=MethodDeposu.ogrenciMapOlustur();

        /*
        bizden istenen bilgi hem key, hem de value ile calismamizi gerektiriyor
        bunun icin oncelikle key'leri kaydedelim
        sonra her bir key'i ve o key'e ait value'dan istenen bilgileri yazdiralim
         */

        MethodDeposu.numaraliOgrencListesiYazdir(ogrenciMap);
        /*
        101 Ali Can
        102 Veli Cem
        103 Ali Cem
        104 Ayse Can
        105 Sevgi Cem
        106 Sevgi Can
         */
    }
}
