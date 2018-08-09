package Task2;

import java.util.*;

public class Phonebook {

    Map<String, ArrayList<Integer>> phonebook = new HashMap<>();


    public void add(String lastName, int number) {

        if (phonebook.containsKey(lastName))
            phonebook.get(lastName).add(number);
        else {
            ArrayList<Integer> lastname = new ArrayList<>();
            lastname.add(number);
            phonebook.put(lastName, lastname);
        }

    }

    public void get(String lastName) {
        Set<Map.Entry<String, ArrayList<Integer>>> set = phonebook.entrySet();
        for (Map.Entry<String, ArrayList<Integer>> o : set) {
            if (o.getKey().equalsIgnoreCase(lastName)) {
                System.out.println(lastName + ": ");
                System.out.println(o.getValue());
            }
        }
    }
}

