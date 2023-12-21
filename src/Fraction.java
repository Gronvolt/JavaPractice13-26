public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public static int getGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
    }

    public static int getLCM(int a, int b) {
        return a / getGCD(a, b) * b;
    }

    public Fraction add(Fraction fraction) {
        return add(this, fraction);
    }

    public Fraction minus(Fraction fraction) {
        return minus(this, fraction);
    }

    public static Fraction add(Fraction firstFraction, Fraction secondFraction) {
        int resultDenominator = getLCM(firstFraction.denominator, secondFraction.denominator);
        int resultNumerator = firstFraction.numerator * (resultDenominator / firstFraction.denominator)
                + secondFraction.numerator * (resultDenominator / secondFraction.denominator);

        return new Fraction(resultNumerator, resultDenominator);
    }

    public static Fraction minus(Fraction firstFraction, Fraction secondFraction) {
        int resultDenominator = getLCM(firstFraction.denominator, secondFraction.denominator);
        int resultNumerator = firstFraction.numerator * (resultDenominator / firstFraction.denominator)
                - secondFraction.numerator * (resultDenominator / secondFraction.denominator);

        return new Fraction(resultNumerator, resultDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
