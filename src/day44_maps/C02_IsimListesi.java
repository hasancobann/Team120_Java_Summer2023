package day44_maps;

import java.util.Map;
import java.util.TreeMap;

public class C02_IsimListesi {
    public static void main(String[] args) {

        /*
        öğrenci mapinde bulunan öğrencilerin isim ve soysimlerini sıra numaralı bir liste olarak yazdırın.
         map'ler kompleks bilgiler barıdırabilirler. Barındırdığı bilgi  ne kadar kompleks olursa
         o bilginin detaylarına ulaşmak o adar aşama gerektirebilir.

         Bu tür kompleks işlemleri, her seferinde yeniden kodlamak yerine
         ilk istendiği zaman method oluşturup
         sonrasında ihtiyaç duyulduğunda o methodu kullanmak daha mantıklıdır.

         Bir map ile işlem yapmak istediğimizde
         ilk bakacağımız şey istenen bilginin key mi yoksa value da mı bulunduğudur.

         Eğer sadece value de olan bir bilgiyi arıyorsak;

         1- Tüm value'leri bir Collection olarka kaydedelim.
         2- bir for_each loop ile her bir value'yu ele alalım.
         3- Value'lar belirli bir ayraç ile birleştirilen Stringlerden oluştuğu için bu ayraç kullanılarak split ile bir array'e dönüştürülebilir.
         4- Artık bir array ve içerisinde value'yu oluşturan bilgiler mevcut. İstenen bilgiyi array'den index ile alabiliriz.
        */

        Map<Integer,String> ogrenciMap=MethodDeposu.ogrenciMapOlustur();
        ogrenciMap.put(110, "Kaan-Can-12-K-MF");


        MethodDeposu.isimSoyisimListesiYazdir(ogrenciMap);


    }
}
