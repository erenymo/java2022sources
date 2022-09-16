package arrays;

public class multiDimensionalArray {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "Istanbul";
        cities[0][1] = "Kocaeli";
        cities[0][2] = "Bursa";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kayseri";
        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Şanlıurfa";
        cities[2][2] = "Gaziantep";

        for(int i = 0; i<=2;i++){
            if(i==0){
                System.out.println("--Marmara--");
            }
            if(i==1){
                System.out.println("--İç Anadolu--");
            }
            if(i==2){
                System.out.println("--Güneydoğu Anadolu--");
            }
            for(int j = 0; j<=2;j++){
               System.out.println(cities[i][j]);
            }
        }

    }
}
