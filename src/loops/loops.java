package loops;

public class loops {
    public static void main(String[] args) {
        //For döngüsü
        for(int i=1;i<=10;i+=2){ // i++ demek i = i+1 demektir, i+=x demek i = i+x demektir
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");

        //While döngüsü
        int i =1;
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti");
       
        //Do-While döngüsü
        int j = 1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While döngüsü bitti");
    }
}
