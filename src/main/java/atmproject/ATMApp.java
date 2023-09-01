package atmproject;

import java.util.Scanner;

public class ATMApp {

    /*
    Bakıye (başlangıç bakıyesi 1000 tl)
    öğrenme,
    para yatırma ve
    cekme,
    çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */


    Scanner input = new Scanner(System.in);
    boolean isAgain;
    public int bakiye = 1000;
    public int tutar;


    public void start() {

        do {
            System.out.println("Lütfen Yapmak istediğiniz işlemi seçiz. " +
                    "\n1. BAKİYE öğren " +
                    "\n2. PARA YATIRMA" +
                    "\n3. PARA ÇEME" +
                    "\n4. ÇIKIŞ");
            int islem = input.nextInt();

            switch (islem) {
                case 1:
                    bakiyeOgren();
                    break;
                case 2:
                    paraYatir();
                    break;
                case 3:
                    paraCek();
                    break;
                case 4:
                    cikis();
                    break;
                default:
                    System.out.println("Geçersiz İşlem");
                    break;
            }

        } while (isAgain);
        System.out.println("İyi günler dileriz...");
    }

    public void bakiyeOgren() {
        System.out.println("Bakiyeniz : " + bakiye+" TL");
        secim();
    }

    public void paraCek() {
        System.out.println("Lütfen Çekmek İstediğiniz Tutarı Giriniz.");
        tutar = input.nextInt();

        if (tutar < bakiye) {
            bakiye = bakiye - tutar;
            System.out.println("Yeni bakiyeniz : " + bakiye+" TL");
        } else {
            System.out.println("Yetersiz Bakiye. Bakiyeniz : " + bakiye+" TL");
        }
        secim();
    }

    public void paraYatir() {
        System.out.println("Lütfen Yatırmak İstediğiniz Tutarı Giriniz.");
        tutar = input.nextInt();
        bakiye = bakiye + tutar;
        System.out.println("Yeni bakiyeniz : " + bakiye+" TL");
        secim();
    }

    public void cikis() {
        isAgain = false;
    }

    public void secim() {
        System.out.println("Başka bir işlem Yapmak İster misiz?" +
                "\nDevat etmek için  1" +
                "\nÇıkış için 2");
        int select = input.nextInt();
        isAgain = select == 1 ? true : false;

    }

}

