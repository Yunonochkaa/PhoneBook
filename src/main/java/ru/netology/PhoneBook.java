package ru.netology;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new TreeMap<>();
    }

    public int add(String name, String number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }


    public String findByNumber(String number) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (Objects.equals(number, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        return phoneBook.get(name);
    }


    public void printAllNames() {
        for (String key : phoneBook.keySet()) {
            System.out.println(key);
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Тегран Мирзалиев", "56784934");
        phoneBook.add("Анастасия Попова", "629005789");
        phoneBook.add("Георгий Власов", "99542789");

        phoneBook.printAllNames();
    }
}