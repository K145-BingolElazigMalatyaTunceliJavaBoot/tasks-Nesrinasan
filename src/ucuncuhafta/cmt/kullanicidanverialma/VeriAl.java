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




    }


}
