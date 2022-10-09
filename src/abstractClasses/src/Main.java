public class Main {
    public static void main(String[] args) {
        KadinGameCalculator kadinGameCalculator = new KadinGameCalculator();
        kadinGameCalculator.calc();
        kadinGameCalculator.gameOver();

        GameCalculator gameCalculator = new KadinGameCalculator();
    }
}
