package com.ufv.dis;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class JSONReader {

public Persona readJson() {
    Persona persona = null;
    try {
        // create Gson instance
        Gson gson = new Gson();

        // create a reader
        Reader reader = Files.newBufferedReader(Paths.get("person.json"));

        // convert a JSON string to a User object
         persona = gson.fromJson(reader,Persona.class);

        // print user object

        // close reader
        reader.close();

        return persona;

    } catch (Exception ex) {
        ex.printStackTrace();
        return persona;
    }
}


}
