package ru.otus.java.basic.lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PhoneBook {
    private static final List<String> FULL_NAME = new ArrayList<>();
    private static final List<Integer> PHONE_NUMBER = new ArrayList<>();
    private static final HashMap<List<String>, List<Integer>> HASH_MAP = new HashMap<>(); // не используется
    private static final List<Integer> FOUND_PHONE_NUMBERS = new ArrayList<>();

    public static void add(final String person, final int phone) {
        FULL_NAME.add(person);
        PHONE_NUMBER.add(phone);
    }

    public static void find(final String person) {

        Iterator personIterator = FULL_NAME.iterator();
        Iterator phoneNumberIterator = PHONE_NUMBER.iterator();
        while (personIterator.hasNext() && phoneNumberIterator.hasNext()) {
            String personTemp = (String) personIterator.next();
            Integer phoneNumberTemp = (Integer) phoneNumberIterator.next();
            if (person.equals(personTemp)) {
                FOUND_PHONE_NUMBERS.add(phoneNumberTemp);
            }
        }
        System.out.println("Found phone numbers for " + person + " are:");
        System.out.println(FOUND_PHONE_NUMBERS);
    }

    public static boolean containsPhoneNumber(final int phone) {
        Iterator iterator = PHONE_NUMBER.iterator();
        while (iterator.hasNext()) {
            if (phone == (Integer) iterator.next())
                return true;
        }
        return false;
    }
}
