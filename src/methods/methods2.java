package methods;

public class methods2 {
    public static void main(String[] args) {
        String newMessage = sehirVer();
        System.out.println(newMessage);
        int sayi = topla(15,7);
        System.out.println(sayi);

        int toplam = topla2(2,3,4,6);
        System.out.println(toplam);
    }

    // void operasyonları emir kipi gibidir. yap dersin yapar
    public static void add(){
        System.out.println("added");
    }

    public static void delete(){
        System.out.println("deleted");
    }

    public static void update(){
        System.out.println("updated");
    }   

    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam =0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }

        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}
