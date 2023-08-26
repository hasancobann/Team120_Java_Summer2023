package day44_maps;

import java.util.Map;

public class C05_KeyIleValueErisimi {
    public static void main(String[] args) {

        // numarası verilen öğrencinin diğer tüm bilgilerini getirin.

        Map<Integer,String> ogrenciMap=MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap.get(102)); //Veli-Cem-10-K-TM
        System.out.println(ogrenciMap.get(105)); //Sevgi-Cem-11-M-TM
        System.out.println(ogrenciMap.get(123)); //null

        MethodDeposu.numaraIleOgrenciBilgisiYazdirma(ogrenciMap,102); //İsim: Veli, Soyisim Cem, Sınıf 10, Şube K
    }


}
