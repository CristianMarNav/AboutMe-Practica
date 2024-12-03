package com.aboutme;

import java.util.ArrayList;

public class MartinezCristianMain {
    public static void main(String[] args) {

        // 1. Crear listas para los hobbies, comidas favoritas y datos curiosos
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Leer libros");
        hobbies.add("Jugar videojuegos");
        hobbies.add("Correr");

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        foods.add("Sushi");
        foods.add("Helado");

        ArrayList<String> funFacts = new ArrayList<>();
        funFacts.add("Me gustar ir al cine");
        funFacts.add("Tengo miedo a las alturas");
        funFacts.add("Es mi primer año en DAM");

        // Crear un objeto de MartinezCristianPerfil usando el constructor
        MartinezCristianPerfil perfil = new MartinezCristianPerfil(
                "Cristian Martínez",
                "Soy un estudiante de DAM que le gusta la programación.",
                hobbies,
                foods,
                funFacts
        );

        // 3. Probar los getters

        System.out.println("Nombre: " + perfil.getName());
        System.out.println("Historia: " + perfil.getStory());
        System.out.println("Hobbies: " + perfil.getHobbies());
        System.out.println("Hobbies: " + perfil.getFoods());
        System.out.println("Dato curioso aleatorio: " + perfil.getFunFacts());

        // 4. Probar el método adicional formatFavorites

        System.out.println("\nFormato personalizado:");
        System.out.println(perfil.formatFavorites());

    }
}