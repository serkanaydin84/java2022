public class Main {
    public static void main(String[] args) {

        int sayi1 = 100;
        int sayi2 = 15;
        int sayi3 = 800;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2){
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3){
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
    }
}