import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q11Collections {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,6,3,4);
        HashSet<Integer>hs1=new HashSet<>();
        hs1.addAll(l1);
        List<Integer> l2= Arrays.asList(4,7,6,5);
        hs1.addAll(l2);
        System.out.println(hs1);
    }
}
