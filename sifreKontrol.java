import java.util.Scanner;
import java.lang.Character;

//en az 8 karakter olmalı
//en az 2 rakam bulunmalı
//sadece harf ve sayıdan oluşmalı

public class Main {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Şifre Giriniz: ");
        String sifre = girdi.nextLine();
        kontrol(sifre);
    }

    static String kontrol(String sifre){
        boolean gecerliMi = false;
        String mesaj = "";
        int sayisayac = 0 , harfsayac = 0;

        for (int i = 0; i < sifre.length(); i++) {
            if (Character.isLetter(sifre.charAt(i))){
                gecerliMi = true;
                harfsayac++;
            }
            else if (Character.isDigit(sifre.charAt(i))){
                gecerliMi = true;
                sayisayac++;
            }
            else {
                gecerliMi = false;
                break;
            }
        }

        if ((sifre.length() >= 8) && (sayisayac >= 2) && gecerliMi == true && (harfsayac > 0)){
            gecerliMi = true;
        }
        else {
            gecerliMi = false;
        }

        if (gecerliMi){
            mesaj = "Şifre Geçerlidir";
            System.out.println(mesaj);
        }
        else {
            mesaj = "Şifre Geçerli Değildir";
            System.out.println(mesaj);
        }

        return mesaj;
    }
}
