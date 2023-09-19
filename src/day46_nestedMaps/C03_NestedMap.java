package day46_nestedMaps;

import java.util.ArrayList;
import java.util.List;

public class C03_NestedMap {
    public static void main(String[] args) {

        /*
        {
            “firstname” : “Ahmet”,
            “lastname” : “Bulut”,
            “totalprice” : 500,
            “depositpaid” : false,
            “bookingdates” : {
                   “checkin” : “2023-07-21”,
                   “checkout” : “2023-08-10”
                      },
            “additionalneeds” : “wi-fi”
            }
         */

        List<Object> havuz=new ArrayList<>();
        havuz.add(78);
        havuz.add("Java");
        havuz.add(true);
        havuz.add('K');
        havuz.add(new int[3]);
        havuz.add(new ArrayList<String>());

        System.out.println(havuz); // [78, Java, true, K, [I@129a8472, []]

        System.out.println(((Integer)havuz.get(0) * 2)); // 156 ==> object olduğu için (Integer) yapmadan işlemi yapmaz çünkü havuz olduğu için int'mı olduğunu java bilmiyor

        System.out.println(((String) havuz.get(1)).substring(2)); // va

        /*
        Data türünü Object gibi Jenerik(Geniş Kapsamlı) bir data türü seçmek
        istediğimiz bu elementi bu list'e koymak başlangıçta güzel olur
        AMA
        sonrasında elemanlarla ilgili işlemler yapmak istediğimizde sürekli olarak Casting yapmamız gerekir.
                 */

    }
}
