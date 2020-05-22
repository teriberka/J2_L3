package ru.geekbrains.J2.L3.hometask;

import java.util.HashMap;


public class PhoneBook {
    public HashMap<String, HashMap<String, String>> myPhoneBook = new HashMap<>();

    public HashMap<String, String> getInfo(String s){
        return myPhoneBook.get(s);
    }

    public void addInfo(String name, HashMap<String, String> record) {
        myPhoneBook.put(name, record);
    }
}
