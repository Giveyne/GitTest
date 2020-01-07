package newGitTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;


public class BranchTest {

    public static void main(String[] args) {

        List <String> list = new LinkedList<>(Arrays.asList("aaa", "aaa1", "bbb", "bbb1", "ccc", "ccc1"));

       list
               .stream()
               .filter((s) -> s.startsWith("a"))
               .forEach(System.out::println);
    }
}
