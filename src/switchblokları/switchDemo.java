package switchblokları;

public class switchDemo {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("Geçtiniz");
                break;
            case 'D':
                System.out.println("ucu ucuna");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not girdiniz");

        }
    }
}
