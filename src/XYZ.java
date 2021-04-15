/**
 * 4. В стране XYZ население равно 10 миллионов человек.
 * Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
 * Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год.
 * Рассчитайте, какая численность населения будет через 10 лет, учитывая,
 * что рождаемость не может быть меньше 7 человек на 1000 человек,
 * а смертностность не может быть меньше 6 человек на 1000 человек.
 */
public class XYZ {

    private static int xyzCurrentPopulation = 10000000;

    public static void main(String[] args) {
        int fertility = 14;
        int mortality = 8;
        int year = 0;
        int bornInYear;
        int diedInYear;

        for (int i = 0; i < 10; i++) {
            year += 1;
            bornInYear = numberOfBirthsPerYear(fertility - i);
            diedInYear = numberOfDeathsPerYear(mortality - i);
            xyzCurrentPopulation += (bornInYear - diedInYear);
            System.out.print("Population after " + year + " year(s): " + xyzCurrentPopulation);
            System.out.println(" | Born: " + bornInYear + " | Died: " + diedInYear);
        }
    }

    private static int numberOfBirthsPerYear(int fertility) {
        if (fertility < 7) fertility = 7;
        return (xyzCurrentPopulation / 1000) * fertility;
    }

    private static int numberOfDeathsPerYear(int mortality) {
        if (mortality < 6) mortality = 6;
        return (xyzCurrentPopulation / 1000) * mortality;
    }

}