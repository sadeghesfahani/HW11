import java.util.TreeSet;


public class Q1 {

    public static void main(String[] args) {
        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            char c1 = (char) ((int) (Math.random() * 26) + 'a');
            char c2 = (char) ((int) (Math.random() * 26) + 'a');
            set1.add(c1);
            set2.add(c2);
        }
        // print the contents of the two sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // find the union of the two sets and print the result
        TreeSet<Character> union = union(set1, set2);
        System.out.println("Union: " + union);

        // find the intersection of the two sets and print the result
        TreeSet<Character> intersection = intersection(set1, set2);
        System.out.println("Intersection: " + intersection);
    }

    // method to find the union of two TreeSets
    public static TreeSet<Character> union(TreeSet<Character> set1, TreeSet<Character> set2) {
        TreeSet<Character> result = new TreeSet<>(set1);
        result.addAll(set2);
        return result;
    }

    // method to find the intersection of two TreeSets
    public static TreeSet<Character> intersection(TreeSet<Character> set1, TreeSet<Character> set2) {
        TreeSet<Character> result = new TreeSet<>(set1);
        result.retainAll(set2);
        return result;
    }

}
