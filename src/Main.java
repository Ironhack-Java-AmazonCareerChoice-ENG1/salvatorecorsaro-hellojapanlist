import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Norm Array ===" );
        String[] cities = {"Tokyo", "Osaka", "Kyoto"};
        Arrays.toString(cities);
        for (String city : cities){
            System.out.println(city);
        }

        List<String> maximum = new ArrayList<>();




        System.out.println("=== ArrayList===" );
        List<String> japaneseCities = new ArrayList<>();
        japaneseCities.add("Tokyo");
        japaneseCities.addAll(List.of("Osaka", "Kyoto"));
        for (String city : cities){
            System.out.println(city);
        }
        List<String> oneTimeCities = new ArrayList<>(List.of("Madrid", "Paris", "Berlin"));

        List<Product> japaneseProducts = new ArrayList<>(
                List.of(
                        new Product("Sushi", "Food"),
                        new Product("Kimono", "Clothing"),
                        new Product("Sake", "Drink")
                )
        );
        Product bonsaiTree = new Product("Bonsai Tree", "Decoration");
        Product samuraiSword = new Product("Samurai Sword", "Historical Artifact");
        Product manga = new Product("Manga", "Book");
        Product origamiPaper = new Product("Origami Paper", "Craft Supply");
        Product matchaTea = new Product("Matcha Tea", "Drink");
        Product animeDVD = new Product("Anime DVD", "Entertainment");
        Product chopsticks = new Product("Chopsticks", "Utensil");

        japaneseProducts.add(matchaTea);
        japaneseProducts.add(manga);

        System.out.println(japaneseProducts);
        System.out.println(japaneseProducts.contains(manga));
        System.out.println(japaneseProducts.contains(origamiPaper));

        LimitedArray limitedArray = new LimitedArray();
        for (int i = 0; i <50; i++){
            System.out.println((i + 1) + ": " + limitedArray.add("OnePiece"));
        }
    }
}