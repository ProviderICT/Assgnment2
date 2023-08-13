/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assg2.f;

import java.util.*;

/**
 *
 * @author admin
 */
public class Assg2F {
//    HashMap is the implementation of map interface.

    static HashMap<Integer, String> collection = new HashMap<>();

    public static void CreateHashmap() {
        collection.put(101, "ReactJS");
        collection.put(102, "Enterprise Java");
        collection.put(103, "Information Technology");
        collection.put(104, "Computer Network");

        System.out.println(collection);
        System.out.println("Size Of The HashMap is : " + collection.size());

    }

    public static void copyHashMap() {
        HashMap<Integer, String> secondCollection = new HashMap<>();
        secondCollection.put(201, "Dotnet MVC");
        secondCollection.put(202, "PHP");
        System.out.println("Second Collection of HashMap" + secondCollection);
        secondCollection.putAll(collection);
        System.out.println("Copied Both Collections" + secondCollection);

//       Removing all maping from map
        secondCollection.clear();
        System.out.println(" Removing all maping from Second Collection of HashMap : " + secondCollection);

        boolean result = secondCollection.isEmpty();
        boolean result1 = collection.isEmpty();
        System.out.println("Is second Collection is empty : " + result);
        System.out.println("Is first Collection is empty : " + result1);

    }

    public static void CloneCollection() {
        HashMap<Integer, String> newCollection = new HashMap<>();
        newCollection = (HashMap<Integer, String>) collection.clone();
        System.out.println("Clone Collectrion : " + newCollection);

    }

    public static void MappingKeyExists() {
        System.out.println("Is 101  Key exists?  ");
        if (collection.containsKey(101)) {
            System.out.println("Yes. " + collection.get(101));
        } else {
            System.out.println("NO.. ");

        }
        System.out.println("Is 106  Key exists?  ");
        if (collection.containsKey(106)) {
            System.out.println("Yes. " + collection.get(106));
        } else {
            System.out.println("NO.. ");

        }
    }

    public static void MappingValueExists() {
        System.out.println("Is Enterprise Java is exists?  ");
        if (collection.containsValue("Enterprise Java")) {
            System.out.println("Yes. ");
        } else {
            System.out.println("NO.. ");

        }
        System.out.println("Is Python is exists?  ");
        if (collection.containsValue("Python")) {
            System.out.println("Yes. ");
        } else {
            System.out.println("NO.. ");

        }

    }

    public static void SetView() {
        Set set = collection.entrySet();
        System.out.println("Set Values : " + set);
    }

    public static void ValueOfKeys() {
        String val = (String) collection.get(104);
        System.out.println("Values Of Key 104 is : " + val);

    }

    public static void setKeysValue() {
        Set keyset = collection.keySet();
        System.out.println("Key Set Values are : " + keyset);
        System.out.println("Collection views are : " + collection.values());
    }

    public static void main(String[] args) {
        CreateHashmap();
        copyHashMap();
        CloneCollection();
        MappingKeyExists();
        MappingValueExists();
        SetView();
        ValueOfKeys();
        setKeysValue();
    }
}
