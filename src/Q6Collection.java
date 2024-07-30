import java.util.*;

public class Q6Collection {
    public static <Integer> List<Integer> Common(List<List<Integer>> lists) {
        HashSet<Integer> set = new HashSet<>();

        boolean flag = true;


        for (List<Integer> ele : lists) {
            if (flag) {
                set.addAll(new HashSet<>(ele));
                flag = false;
            } else {
                set.retainAll(new HashSet<>(ele));
            }


        }
        return new ArrayList<>(set);


    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> list3 = Arrays.asList(5, 6, 7, 8, 9);

        List<List<Integer>> lists = Arrays.asList(list1, list2, list3);

        List<Integer> commonElements = Common(lists);

        System.out.println("Common elements: " + commonElements);
    }
}

