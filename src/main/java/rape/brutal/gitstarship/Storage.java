/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by haze on 22.03.2017.
 */
public class Storage {

    private HashMap<String, IStorageable> itemsHashMap = new HashMap<>();
    private int capacity;

    public Storage(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public Set<String> getAllItemNames() {
        return itemsHashMap.keySet();
    }

    public boolean putItem(IStorageable iStorageable) {
        if (getCapacity() < iStorageable.getSize()) {
            System.out.println("There is no empty space in storage!");
            return false;
        } else {
            itemsHashMap.put(iStorageable.getName(), iStorageable);
            capacity -= iStorageable.getSize();
            return true;
        }
    }

    public IStorageable getItem(String itemName) {
        return this.itemsHashMap.get(itemName);
    }
}
