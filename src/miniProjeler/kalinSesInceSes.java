package miniProjeler;

public class kalinSesInceSes {
    public static void main(String[] args) {
        
        char harf = 'K';


        char[] kalinSes = new char[8];
        kalinSes[0] = 'a';
        kalinSes[1] = 'ı';
        kalinSes[2] = 'o';
        kalinSes[3] = 'u';
        kalinSes[4] = 'A';
        kalinSes[5] = 'I';
        kalinSes[6] = 'O';
        kalinSes[7] = 'U';

        char[] inceSes = new char[8];
        inceSes[0] = 'e';
        inceSes[1] = 'i';
        inceSes[2] = 'ö';
        inceSes[3] = 'ü';
        inceSes[4] = 'E';
        inceSes[5] = 'İ';
        inceSes[6] = 'Ö';
        inceSes[7] = 'Ü';

        for(int i=0;i<kalinSes.length;i++){
            if(harf==kalinSes[i]){
                System.out.println("Bu harf Kalın seslidir");
            }
        }

        for(int j=0; j<inceSes.length;j++){
            if(harf==inceSes[j]){
                System.out.println("Bu harf İnce seslidir");
            }
        }


    }
}
