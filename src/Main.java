import java.util.*;
public class Main {
    public static void main(String[] args) {

        Set<Automobil> auto = new HashSet<>();
        auto.add(new Automobil("Audi", 2012));
        auto.add(new Automobil("Skoda", 2017));
        auto.add(new Automobil("Toyota", 2015));

        List<Automobil> autoSort = new ArrayList<>(auto);
        Collections.sort(autoSort);
        System.out.println("Afisare sortarii HashSet dupa anul de producere" + autoSort);

        Set <Automobil> auto2 = new TreeSet<>(new Comparator<Automobil>() {
            public int compare(Automobil a1, Automobil a2) {
                return a1.getDenumire().compareTo(a2.getDenumire());
            }
        });
        auto2.add(new Automobil("Fiat", 2012));
        auto2.add(new Automobil("Ford", 2017));
        auto2.add(new Automobil("Mercedes", 2015));
        auto2.add(new Automobil("AlfaRomeo", 2015));

        System.out.println("Afisare sortarii TreeSet dupa denumire" + auto2);
    }
}