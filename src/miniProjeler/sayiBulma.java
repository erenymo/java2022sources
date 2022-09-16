package miniProjeler;
import java.util.Scanner;

public class sayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak;
        System.out.print("Aramak istediğiniz sayıyı giriniz : ");
        aranacak = input.nextInt();
        
        boolean varMi =false; 
        for(int sayi : sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }

        if(varMi==true){
            System.out.println("Bu sayı dizide mevcuttur.");
        }else{
            System.out.println("Bu sayı dizide mevcut değildir.");
        }





    }
}
