/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 4: Generics and Collections
Topic:  Collections, Sets TreeSet, HashSet, LinkedHashSet
*/

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        // Initialize some data
        List<Integer> initialData = List.of(10, 20, 50, 40, 30);

        // Create a set from this list, best practice to declare variables
        // to the interface type as shown here.
        Set<Integer> h = new HashSet<>(initialData);
        System.out.println("----------- HashSet -----------");
        System.out.println("Original values entered: " + initialData);

        // Call static method on CollectionTests to exercise the Collections methods
        CollectionTests.doStuffWithCollection(h, 60, 50, 10);

    }
}

