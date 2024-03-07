package day3method;
import java.util.Arrays;

public class FriendSorter {
    public static void main(String[] args) {
       
        String[] friends = {
            "Alice", "Bob", "Charlie", "David", "Emily",
            "Frank", "Grace", "Hannah", "Ivy", "Jack"
        };
        Arrays.sort(friends);
        System.out.println("Sorted names of friends:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
