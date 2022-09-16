package miniProjeler;

public class asalSayi {
    public static void main(String[] args) {
        int number = -4;
       // int remainder = number % 2;   number % 2 demek number'in 2ye bölümünden kalan demektir.
        boolean isPrime = true;

        if(number==1){
            System.out.println("Sayı asal değildir");
            return;
        }

        if(number<1){
            System.out.println("Geçersiz Sayı");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
            if (number % i == 0) {
                System.out.println(i + " Sayısı " + number + " Sayısını tam böler.");
            }
        }

        if (isPrime == true) {
            System.out.println("Bu sayı Asaldır");
        } else {
            System.out.println("Bu sayı asal değildir.");
        }
    }
}
