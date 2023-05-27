import java.util.Comparator;

public class Automobil implements Comparable<Automobil> {

    private int anProducere;
    public String denumire;

    public Automobil(String denumire, int anProducere) {
        this.denumire = denumire;
        this.anProducere = anProducere;
    }
// создаем гетеры для того, чтоб Java понимал, что взять и вывести на консоль
    public String getDenumire() {
        return denumire;
    }
    public int getAnProducere() {
        return anProducere;
    }
    public String toString() {
        return denumire;
    }

    // если String, то пишем /return name.compareTo(d.name);/
// если int, то пишем как ниже
    @Override
    public int compareTo(Automobil a) {
        return Integer.compare(this.anProducere, a.anProducere);
//        if (sortedYears == 0) {
//            return denumire.compareTo(a.denumire);
//        }
//        return sortedYears;
    }
}
