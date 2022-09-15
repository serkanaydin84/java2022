public class Main {
    public static void main(String[] args) {

        char harf = 'ð';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
                case 'U':
                case 'a':
            case 'ý':
            case 'o':
            case 'u':
                System.out.println("Kalýn sesli harfler");
                break;

            case 'E':
            case 'Ý':
            case 'Ö':
            case 'Ü':
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("Ýnce sesli harfler");
                break;
            default:
                System.out.println("Sessiz harf");
        }
    }
}