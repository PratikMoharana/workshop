import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q14Collections {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,3,2,5,5,6);
        HashSet<Integer>hs=new HashSet<>();
        hs.addAll(l1);
        System.out.println(hs);
    }
}
