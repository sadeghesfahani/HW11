import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(3);
        list.add(20);


        ArrayList<Integer> result = removeImproperPairs(list);
        System.out.println(result);
    }


    public static ArrayList<Integer> removeImproperPairs(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = list.size();
        for (int i = 0; i < n - 1; i += 2) {
            if (list.get(i) > list.get(i + 1)) {
                continue;
            }
            result.add(list.get(i));
            result.add(list.get(i + 1));
        }
        return result;
    }
}
