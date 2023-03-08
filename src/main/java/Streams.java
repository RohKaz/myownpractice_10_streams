import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {



    int[] numbers = {9, 1, 8, 2, 7, 3, 6, 4, 5};

    Arrays.stream(numbers)
            .sorted()
            .forEach(System.out::println);

    int[] sortedNumbers =
            Arrays.stream(numbers)
            .sorted()
            .toArray();

        int arraySum =
                Arrays.stream(numbers)
                .sum();

        int arrayProduct =
                Arrays.stream(numbers)
                .reduce(1, (a, b) -> a * b);

        System.out.println(arraySum);
        System.out.println(arrayProduct);


    }

}
