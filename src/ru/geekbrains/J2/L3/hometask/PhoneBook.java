package ru.geekbrains.J2.L3.hometask;

import java.util.HashMap;


public class PhoneBook {
    public HashMap<String, Object> myPhoneBook = new HashMap<>();


    public Object getInfo(String s){
        return myPhoneBook.get(s);
    }

    public void addInfo(String lastname, Object person) {
        myPhoneBook.put(lastname, person);
    }
}
