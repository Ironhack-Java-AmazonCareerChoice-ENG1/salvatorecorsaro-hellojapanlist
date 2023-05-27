import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CityReader {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("cities.csv");
        Scanner scanner = new Scanner(file);
        List<String> cities = new ArrayList<>();

        int index = 1;
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();

            String[] words = data.replace('"', ' ')
                    .split(", ");
            for (int i = 0; i < words.length; i++) {
                if (i % 2 == 0){
                    System.out.print(index++ +": ");
                    System.out.println(words[i]);
                    cities.add(words[i].trim());
                }
            }

            System.out.println(cities);
        }
        String cityToFind = "Tokyo";
        System.out.println(cityToFind + " is included? " + cities.contains(cityToFind));
        System.out.println(cityToFind + " is included? " + cities.indexOf(cityToFind));
        System.out.println(cities.get(30));
        scanner.close();

    }
}
