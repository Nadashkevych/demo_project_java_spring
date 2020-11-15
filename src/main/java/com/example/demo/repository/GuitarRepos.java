package com.example.demo.repository;

import com.example.demo.model.Guitar;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Repository
public class GuitarRepos {

    private Map<String, Guitar> database;

    public GuitarRepos() {
        database = new HashMap<String, Guitar>();
        try {
            File file = new File("file.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fileReader);
            String line = null;
            while ((line = bfr.readLine()) != null) {
                String[] guitarInfo = line.split("regex");
                Guitar guitar = new Guitar(guitarInfo[0], guitarInfo[1], guitarInfo[2], guitarInfo[3], guitarInfo[4]);
                database.put(guitar.getModelName(), guitar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
