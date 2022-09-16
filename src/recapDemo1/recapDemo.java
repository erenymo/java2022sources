package recapDemo1;

public class recapDemo {
    public static void main(String[] args) {
        int number1 = 36;
        int number2 = 78;
        int number3 = 51;
        
        int enBuyuk = number2;

        if(number1>number2){
            enBuyuk = number1;
        }

        if(number3>enBuyuk){
            enBuyuk = number3;
        }
        
        System.out.println("En büyük sayı : "+enBuyuk);


    }
}
