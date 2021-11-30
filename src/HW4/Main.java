package HW4;

import java.util.*;

class Main {

    public static void main(String[] args) {
        HW4_1();
        HW4_2();
    }

    private static void HW4_1() {
        Map<String, Integer> city = new HashMap<>();
        String[] words = {
                "Москва", "Питер", "Ростов",
                "Химки", "Калининград", "Питер",
                "Краснодар", "Москва", "Тула",
                "Москва", "Химки", "Сочи",
                "Ярославль", "Тула", "Москва",
                "Казань", "Екатеринбург", "Питер", "Тула"
        };

        for (int i = 0; i < words.length; i++) {
            if (city.containsKey(words[i]))
                city.put(words[i], city.get(words[i]) + 1);
            else
                city.put(words[i], 1);
        }
        System.out.println(city);
    }

    private static void HW4_2() {
        Directory directory = new Directory();

        directory.add("Ivanov", "88005553535");
        directory.add("Ivanov", "88002000202");
        directory.add("Petrov", "88002000100");
        directory.add("Petrov", "88001827319");
        directory.add("Ivanov", "88003827193");
        directory.add("Testov", "88003724721");
        directory.add("Sidorov", "89019374282");
        directory.add("Sidorov", "89279273910");
        directory.add("Testov", "89018293947");

        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Petrov"));
        System.out.println(directory.get("Testov"));
        System.out.println(directory.get("Sidorov"));
    }
}

class Directory {
    private Map<String, List<String>> scroll = new HashMap<>();
    private List<String> phone_numbers;

    public void add(String surname, String phone_number) {
        if (scroll.containsKey(surname)) {
            phone_numbers = scroll.get(surname);
            phone_numbers.add(phone_number);
            scroll.put(surname, phone_numbers);
        } else {
            phone_numbers = new ArrayList<>();
            phone_numbers.add(phone_number);
            scroll.put(surname, phone_numbers);
        }
    }

    public List<String> get(String surname) {
        return scroll.get(surname);
    }

}
