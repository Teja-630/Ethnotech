

import java.util.*;

public class CollegeFest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> registrations = new LinkedList<>();
        HashSet<Integer> uniqueIds = new HashSet<>();

        System.out.println("Enter 10 Student IDs:");

        for (int i = 1; i <= 10; i++) {
            int id = sc.nextInt();

            if (uniqueIds.add(id)) { // ID is unique
                registrations.add(id);
            } else {
                System.out.println("Duplicate ID " + id + " ignored.");
            }
        }

        System.out.println("\nUnique Registered Student IDs:");
        System.out.println(registrations);

        sc.close();
    }
}