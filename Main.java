import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 4, 5, 2, 8);
        System.out.println("Inceput Task 1.");
        System.out.println("Elemente lista: " + a.size());
        boolean existaElementeUnice = existaElementeUnice(a);
        System.out.println("Lista are elemente unice: " + existaElementeUnice);
        System.out.println("Sfarsit Task 1.");
        System.out.println("Inceput Task 2.");
        List<Integer> listaSortata= a.stream().sorted().collect(Collectors.toList());
        listaSortata.forEach(System.out::println);
        System.out.println("Sfarsit Task 2.");
    }

    static boolean existaElementeUnice(List<Integer> lista) {
        Set<Integer> set = new HashSet<>(lista);
        return set.size() == lista.size();
    }
}

/*In Java 8, stream() is an API used to process collections of objects.
The collect() method is used to receive elements from a stream and stored them in a collection.
The toList() return the collector which collects all the input elements into a list, in encounter order.*/