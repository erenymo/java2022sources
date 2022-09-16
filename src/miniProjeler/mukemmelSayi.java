package miniProjeler;

public class mukemmelSayi {
    public static void main(String[] args) {
        int number = 14;
        int total = 0;

        for(int i=1; i<number; i++){
            if(number%i==0){
                total = total+i;
            }
        }

        if(total==number){
            System.out.println(number+ " mükemmel sayıdır");
        }else{
            System.out.println(number+" mükemmel sayı değildir");
        }
    }
}
