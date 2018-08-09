package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Яблоко");
        arrayList.add("Груша");
        arrayList.add("Абрикос");
        arrayList.add("Персик");
        arrayList.add("Слива");
        arrayList.add("Яблоко");
        arrayList.add("Ананас");
        arrayList.add("Лимон");
        arrayList.add("Апельсин");
        arrayList.add("Грейпфрут");
        arrayList.add("Яблоко");
        arrayList.add("Яблоко");
        arrayList.add("Авокадо");
        arrayList.add("Огурец");
        arrayList.add("Помидор");
        arrayList.add("Тыква");
        arrayList.add("Перец");
        arrayList.add("Перец");
        arrayList.add("Лук");
        arrayList.add("Яблоко");
        //через HashSet выводим уникальные позиции в массиве
        HashSet<String> uniq = new HashSet<>(arrayList);

        for (String value : uniq) {
            System.out.print(value + " | ");
        }

        System.out.println();
        //через HashMap осуществляем подсчет повторяющихся элементов массива
        //и выводим на экран значение и кол-во повторений
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        Integer count;

        for (String word : arrayList) {
            count = hashMap.get(word);
            if (count == null) hashMap.put(word, 1);
            else hashMap.put(word, count + 1);
        }
        System.out.println(hashMap);
    }
}
