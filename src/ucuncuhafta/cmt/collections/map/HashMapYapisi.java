package ucuncuhafta.cmt.collections.map;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapYapisi {
    /**
     * HashMap key, value olarak verileri tutan yapıdır.
     */

    public static void main(String[] args) {

        HashMap<Integer, String> hashMapOrnegi = new HashMap<>();

        hashMapOrnegi.put(123456, "Nesrin");
        hashMapOrnegi.put(21546, "Burak");
        hashMapOrnegi.put(21546, "Murat");//aynı key değerini ekleyince sonucu ne olur?

        /**
         * Veri alma
         */
        String value = hashMapOrnegi.get(123456);
//        System.out.println(value);

        String value2 = hashMapOrnegi.get(21546);
        for (Integer key : hashMapOrnegi.keySet()) {
            System.out.println("hasmap'in keyi:" + key + " value: " + hashMapOrnegi.get(key));
        }

//        System.out.println(value2);//sonuc?

        int size = hashMapOrnegi.size();
//        System.out.println(size);//sonuc ?


        /**
         * Hashmap sonucu incele.
         */
        HashMap<Flower, String> flowerHashMap = new HashMap<>();
        flowerHashMap.put(new Flower("rose"), "Nesrin" );

        String rose = flowerHashMap.get(new Flower("rose"));
        System.out.println(rose);


        /**
         * Kuyruk, Stack yapıları araştırılabilir.
         *
         */


    }

}
