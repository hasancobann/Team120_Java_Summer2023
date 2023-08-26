package day44_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MethodDeposu {

    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static void isimSoyisimListesiYazdir(Map<Integer, String> ogrencimap) {

        Collection<String> valueCollections = ogrencimap.values();
        System.out.println("Sıra no    İsim    Soyisim");
        System.out.println("==========================");
        int siraNo = 1;

        for (String eachValue : valueCollections //"Ali-Can-11-H-MF"
        ) {

            String[] valueArr = eachValue.split("-");
            System.out.println(siraNo + " -   " + valueArr[0] + " " + valueArr[1]);
            siraNo++;

        }

    }

    public static void sinifSubedekiOnrenciListesiYazdir(Map<Integer, String> ogrenciMap, int sinif, String sube) {


        // 1- Tüm value'leri bir Collection olarka kaydedelim.

        Collection<String> valueCollections = ogrenciMap.values();

        // 2- bir for_each loop ile her bir value'yu ele alalım.

        System.out.println(sinif + ".sınıf " + sube + " şubesindeki öğrenci listesi");
        System.out.println("==========================");
        for (String eachValue : valueCollections
        ) {
            // 3- Value'lar belirli bir ayraç ile birleştirilen Stringlerden oluştuğu için bu ayraç kullanılarak split ile bir array'e dönüştürülebilir.

            String[] valueArr = eachValue.split("-"); // ["Ali-Can-11-H-MF"]

            // 4- Artık bir array ve içerisinde value'yu oluşturan bilgiler mevcut. İstenen bilgiyi array'den index ile alabiliriz.
            String sinifStr = sinif + "";
            if (valueArr[2].equals(sinifStr) || valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }

    }

    public static void isimSoyisimIleOgrenciBul(Map<Integer, String> ogrenciMap, String isim, String soyisim) {

        Collection<String> valueCollection = ogrenciMap.values();

        for (String eachValue : valueCollection  // "Ali-Can-11-H-MF"
        ) {

            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
            // isim , soyisim, sinif ve subelerini yazdirin

            if (valueArr[0].equalsIgnoreCase(isim) && valueArr[1].equalsIgnoreCase(soyisim)) {

                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2] + " " + valueArr[3]);
            }
        }
    }

    public static void numaraIleOgrenciBilgisiYazdirma(Map<Integer, String> ogrenciMap, int ogrenciNo){

        String istenenOgrenciValue=ogrenciMap.get(ogrenciNo); // "Ali-Can-11-H-MF" ==> String olarak gelecek

        String []istenenOgrenciArr=istenenOgrenciValue.split("-"); // [Ali, Can, 11, H, MF]

        System.out.println("İsim: "+istenenOgrenciArr[0]+", "+
                           "Soyisim "+ istenenOgrenciArr[1]+", "+
                            "Sınıf "+istenenOgrenciArr[2]+", "+
                            "Şube "+istenenOgrenciArr[3]);

    }

    public static void numaraliOgrencListesiYazdir(Map<Integer,String>ogrenciMap){
        //bütün keyleri kaydedelim

        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet(); //[101, 102, 103, 104, 105, 106]

        // bir for each looop ile tüm keyleri elden geçirebilirim.

        for (Integer eachKey:ogrenciKeySeti
             ) {
            // Her bir key
            System.out.print(eachKey+ " ");
            // o keyin isim ve soyisimini yazdıralım

            String valueStr=ogrenciMap.get(eachKey); //"Ali-Can-11-H-MF" ==> String olarak gelecek

            String[]valueArr=valueStr.split("-"); // [Ali, Can, 11, H, MF]

            System.out.println(valueArr[0]+" "+valueArr[1]);


        }
    }

    public static Map<Integer, String> yilSonuSinifArttir(Map<Integer, String> ogrenciMap) {

        Set<Integer>ogrenciKeySeti =ogrenciMap.keySet();

        //for each loop ile her bir key'e ait value'yu çağırıp istediğimiz update'i yapalım.
        for (Integer eachKey:ogrenciKeySeti
             ) {

            //1-Bilgiye ulaşmak için yaptığımız gibi adım adım value'yü array'e çevirmeliyiz.
            //    - Key ile value'yu çağırırız.
            String eachValue=ogrenciMap.get(eachKey);

           //- Value'yu Array'e çeviririz.
            String []valueArr=eachValue.split("-");

           //- Array'de istediğimiz update'i yaparız.
            switch (valueArr[2]){
                case "9":
                    valueArr[2]="10";
                    break;
                case "10":
                    valueArr[2]="11";
                    break;
                case "11":
                    valueArr[2]="12";
                    break;
                case "12":
                    valueArr[2]="Mezun";
                    break;
            }//[Ali, Can, 12, H, MF]

           //2- Bilgiye ulaşmak için parçaladığımız value'yu yeni hali ile tekrar birleştiririz.
            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];
            // "Ali, Can, 12, H, MF"

           //3- Key ve yeni value'yu kullanarak map'i update ederiz.
            ogrenciMap.put(eachKey,yeniValue);


        }
        return ogrenciMap;
    }

    public static Map<Integer, String> ogrenciBolumDegistir(Map<Integer, String> ogrenciMap, String eskiBolum, String yeniBolum) {

        //update için key ve value'nun ikisini de ihtiyacımız var.

        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet(); //[101, 102, 103, 104, 105, 106]

        // Her bir key'e ait value'yu çağırıp update edip yeni hali ile map'e ekleyelim.

        for (Integer eachKey:ogrenciKeySeti //101
             ) {

            String eachValue=ogrenciMap.get(eachKey); //"Ali, Can, 12, H, MF"
            String [] valueArr=eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // artık array'de update yapabiliriz.

            if (valueArr[4].equalsIgnoreCase(eskiBolum)){
                valueArr[4]=yeniBolum;
            }

            // update edilen array'i mape value olarak koymak için birleştirelim.

            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

            // key var, value'nun update hali de var. mapi update edelim.
            ogrenciMap.put(eachKey,yeniValue);


        }

        return ogrenciMap;

    }
}



