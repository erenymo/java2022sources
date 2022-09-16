package strings;

public class stringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);
        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4)); // .charAt(x) x'inci karakteri gösterir
        System.out.println(mesaj.concat(" Yaşasın!")); // .concat("lorem ipsum...") metinleri birlestirir.
        System.out.println(mesaj.startsWith("B")); // .startsWith(x) x ile başlıyorsa true, değilse false .
        System.out.println(mesaj.endsWith(".")); // .endsWith(x) x ile bitiyorsa true, değilse false.
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));  // .indexOf('x' ve ya "y") x'inci harfin ya da y'inci kelimenin kaçıncı sırada oldugunu gösterir
        System.out.println(mesaj.lastIndexOf('e')); // .lastIndexOf() aramaya sondan başlar
    }
}
