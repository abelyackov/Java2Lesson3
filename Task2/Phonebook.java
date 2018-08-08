package Task2;

import java.util.*;

public class Phonebook {

    Map<String, ArrayList<Integer>> phonebook = new HashMap<>();


    public void add(String lastName, int number) {

        if (phonebook.keySet().equals(lastName))
            phonebook.get(lastName).add(number);
        else {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(number);
            phonebook.put(lastName,arrayList);
        }
        System.out.println(phonebook.keySet());

    }

    public Collection<ArrayList<Integer>> get(String lastName) {
        return phonebook.values();
    }

    private String toString(ArrayList<Integer> number) {
        return String.valueOf(number);
    }
}
