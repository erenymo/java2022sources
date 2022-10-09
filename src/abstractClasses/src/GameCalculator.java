public abstract class GameCalculator {
    public abstract void calc(); // kim inherit ediyorsa calc'ı override etmek zorunda. kendi calc'ını yazmak zorunda.

    public final void gameOver() { // override edilemez. hiçbir zaman değişmeyecek bir kuraldır.
        System.out.println("Oyun bitti !");
    }
}
