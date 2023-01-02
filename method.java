package kodlamahmwrk;

public class method {
    public static void main(String[] args) {
        sayiBulmaca();


    }


    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        String mesaj="";
        if (varMi) {
            mesaj="Sayı Mevcuttur : "+aranacak;
            mesajVer(mesaj);
            System.out.println("Sayı Mevcuttur: " + aranacak);
        } else {
            System.out.println("Sayı Mevcut Değildir: " + aranacak);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
