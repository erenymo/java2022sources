package miniProjeler;

public class arkadasSayilar {
    public static void main(String[] args) {
        // kendileri hariç pozitif tam bölenleri toplamı birbirine eşit olan sayılar arkadaş sayılardır.
        int number1 = 220;
        int number2 = 284;

        int total1=0;
        int total2=0;

        for(int i=1; i<number1; i++){
            if(number1 % i==0){
                total1= total1 +i;
            }
        }

        System.out.println(total1);
        for(int j=1; j<number2; j++){
            if(number2 % j==0){
                total2= total2 +j;
            }
        }
        System.out.println(total2);

        if(total1==number2 && total2==number1){
            System.out.println("Bu sayılar arkadas sayılardır");
        }else{
            System.out.println("Bu sayılar arkadas sayı değildir");
        }

    }
}
