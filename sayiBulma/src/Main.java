public class Main {
    public static void main(String[] args) {

        int sayilar[] = new int[] {1, 2, 5, 7, 9};
        int aranacak = 6;
        
        boolean varMi = false;

        for (int sayi : sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Say� mecvuttur");
        } else {
            System.out.println("Say� mevcut DE��LD�R");
        }
    }
}