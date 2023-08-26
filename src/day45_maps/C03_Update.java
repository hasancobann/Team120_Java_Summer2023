package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C03_Update {
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();

        // öğrenci map'indeki bölümü TM olanları EA yapın
        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF}
         */

        ogrenciMap=MethodDeposu.ogrenciBolumDegistir(ogrenciMap,"TM","EA");

        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-EA,
        103=Ali-Cem-11-K-EA,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-EA,
        106=Sevgi-Can-10-K-MF}
         */

        ogrenciMap=MethodDeposu.ogrenciBolumDegistir(ogrenciMap,"MF","TM");
        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-11-H-TM,
        102=Veli-Cem-10-K-EA,
        103=Ali-Cem-11-K-EA,
        104=Ayse-Can-10-H-TM,
        105=Sevgi-Cem-11-M-EA,
        106=Sevgi-Can-10-K-TM}
         */
    }
}
