
public class Main {
    public static void main(String[] args) {
        var countries = new Country[] { new Country("USA", 10000),
                new Country("MEXICO", 3000), new Country("PERU", 15000) };
        Country.maximum(countries);
    }

}