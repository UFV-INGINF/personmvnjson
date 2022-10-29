package com.ufv.dis;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        JSONReader reader = new JSONReader();
        Persona persona = reader.readJson();

        System.out.print(persona.getNombre());
        System.out.println(persona);
        persona.setNombre("Ignacio");

        Gson gson = new Gson();

        String salid = gson.toJson(persona);

        System.out.println(salid);

    }


}
