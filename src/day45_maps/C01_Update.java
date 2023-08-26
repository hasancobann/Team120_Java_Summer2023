package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C01_Update {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF}
         */

        // 105 numaralı öğrencinin soyadını Han yapın.
        ogrenciMap.put(105,"Sevgi-Han-11-M-TM");

        //103 numaralı öğrencinin sınıfını T yapın
        ogrenciMap.put(103,"Ali-Cem-11-T-TM");

        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-T-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Han-11-M-TM,
        106=Sevgi-Can-10-K-MF}
         */

        /*
        Map'de bir value'yu update etmek istersek:
        1-Bilgiye ulaşmak için yaptığımız gibi adım adım value'yü array'e çevirmeliyiz.
            - Key ile value'yu çağırırız.
            - Value'yu Array'e çeviririz.
            - Array'de istediğimiz update'i yaparız.
        2- Bilgiye ulaşmak için parçaladığımız value'yu yeni hali ile tekrar birleştiririz.
        3- Key ve yeni value'yu kullanarak map'i update ederiz.
         */


    }
}
