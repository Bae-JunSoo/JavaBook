import java.util.*;
public class Q1 {
    public static void main(String[] args) {
            Set<Integer> num = new TreeSet<>(
            Arrays.asList(5,3,6,1,2,4)
    );
      
      num.forEach(n -> System.out.print(n + ""));
    }
}