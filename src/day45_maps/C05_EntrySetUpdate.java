package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C05_EntrySetUpdate {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();

        // öğrenci map2indeki soyisimleri büyük harf olarak düzeltin

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti
             ) {

            String eachValue=eachEntry.getValue();
            String[] valueArr=eachValue.split("-");

            valueArr[1]=valueArr[1].toUpperCase();
            //array'i update ettik, ortalığı toplayalım

            //array'i birleştirip yeni value'yu elde edelim
            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

            eachEntry.setValue(yeniValue);

        }

        System.out.println(ogrenciMap);
        /*
        {101=Ali-CAN-11-H-MF,
        102=Veli-CEM-10-K-TM,
        103=Ali-CEM-11-K-TM,
        104=Ayse-CAN-10-H-MF,
        105=Sevgi-CEM-11-M-TM,
        106=Sevgi-CAN-10-K-MF}
         */
    }
}
