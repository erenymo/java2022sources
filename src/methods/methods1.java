package methods;

public class methods1 {
    public static void main(String[] args) {
       sayiBulmaca();
       sayiBulmaca();
       sayiBulmaca();
       sayiBulmaca();

    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak =3;
        boolean varMi =false; 
        for(int sayi : sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }

        if(varMi==true){
            mesajVar(aranacak);
        }else{
            mesajYok("Sayi bu dizide mevcut değildir : "+aranacak);
        }

    }

    public static void mesajVar(int find){
        System.out.println("sayi mevcuttur : "+find);
    }

    public static void mesajYok(String mesaj){
        System.out.println(mesaj);
    }
}
