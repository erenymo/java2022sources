package arrays;

public class arrays {
    public static void main(String[] args) {
        String ogrenci1= "Eren";
        String ogrenci2= "Şule";
        String ogrenci3= "Ayşe";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        
        System.out.println("-------------------------------------");

        String[] ogrenciler = new String[5]; //3 yazan yer kaç elemandan olusacagını gösteriyor
        ogrenciler[0] = "Eren";
        ogrenciler[1] = "Şule";
        ogrenciler[2] = "Ayşe";
        ogrenciler[3] = "Metin";
        ogrenciler[4] = "Ceren";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-------------------------------------");
       
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }


  

    }
}
