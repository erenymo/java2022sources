package strings;

public class stringsDemo2 {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = mesaj.replace(' ','-'); // .replace(oldChar, newChar)
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 13)); // .substring(2,13) 2'den 13. indexe kadar yaz.

        for(String kelime : mesaj.split(" ")){ // .split() parantezin içindeki şeye göre indexleri ayır.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // .toLowerCase() tüm harfleri küçük harfe çevirir
        System.out.println(mesaj.toUpperCase()); // . toUpperCase() tüm harfleri büyük harfe çevirir.

        String mesaj2 = "     Bugün hava çok kötü     ";
        System.out.println();
        System.out.println(mesaj2.trim()); // .trim() metnin başındaki ve sonundaki boşlukları siliyor.
        
    }
}
