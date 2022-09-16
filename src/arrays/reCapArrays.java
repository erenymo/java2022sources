package arrays;

public class reCapArrays {
    public static void main(String[] args) {
        double[] myList = { 1.2, 1.3, 5.7, 2.6 };
        double total = 0;
        double enBuyuk = myList[0];
        for (double number : myList) {
            if (number > enBuyuk) {
                enBuyuk = number;
            }
            total = total + number;
            System.out.println("  " + number);
        }
        System.out.println("+_____");
        System.out.println("  " + total);
        System.out.println("En Buyuk sayi : " + enBuyuk);
    }
}
