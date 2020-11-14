package com.example.demo.repository;

import com.example.demo.model.Guitar;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class GuitarRepos {

    private Map<String, Guitar> database;

    public GuitarRepos() {
        database = new HashMap<String, Guitar>();
        Guitar guitar = new Guitar("Stratocaster", "Fender", "A guitar played by most guitarists in the world", "https://images.reverb.com/image/upload/s--IHWqvDoJ--/f_auto,t_supersize/v1584549394/yyvbxyqee5j6vrqxjehu.jpg");
        database.put(guitar.getModelName(), guitar);
    }

    public List<Guitar> findAll() {
        Collection<Guitar> values = this.database.values();
        return new ArrayList<>(values);
    }

    public Guitar findByName(String name) {
        return database.get(name);
    }

    public void add(Guitar guitar) {
        this.database.put(guitar.getModelName(), guitar);
    }
}
