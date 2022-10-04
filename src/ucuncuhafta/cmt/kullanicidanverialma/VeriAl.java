package ucuncuhafta.cmt.kullanicidanverialma;

import java.util.Scanner;

public class VeriAl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayı girin");
        int i = scanner.nextInt();
        System.out.println("girdiğiniz sayı: " + i);

        while (true){
            System.out.println("Lütfen almak istediğiniz meyveyi yazınız");
            String meyveAdi = scanner.next();
            System.out.println("Lütfen meyveden kaç kilo istediğinizi söyleyin.");
            int kilo = scanner.nextInt();
            System.out.println("İstenilen meyve:" +meyveAdi + "kilosu:" + kilo);
            int toplam = kilo * 5;
            System.out.println("Ödenecek tutar" + toplam);
            System.out.println("sistemden çıkmak isterseniz f tuşuna basınız");
            String exit = scanner.next();
            if(exit.equals("f")){
                break;
            }

        }

        System.out.println("MEyveniz hazır. ");



        /**
         * Manav dükkanı açmak isteyen bir adam hal'den bir miktar elma, bir miktar armut, bir miktar kiraz alacaktır.
         * Mallar dükkana gelmiştir.
         * Kullanıcı bu malları ayrı odalarda saklayacaktır.
         * Her bir odadaki elma, armut ve kirazın kg cinsinden değerini bulalım.
         *
         *
         */

        /**
         * Manav'dan online alışveriş yapılıyor. Müşteri Ve 1 kg elma, 2 kg armut almak istedi.
         * Malları alsın. depo guncellensin.
         */


        /**
         * Online satışta müşteri depoda kalan maldan fazla bir miktarda mal almak istedi.
         * Bunu kullanıcıya bildir.
         */



    }


}
