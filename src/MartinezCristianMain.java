package com.aboutme;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa el perfil del usuario.
 * Incluye atributos como nombre, historia personal, hobbies, comidas favorita y datos curiosos.
 */
public class MartinezCristianMain {

    public static void main(String[] args) {
        // 1. Crear listas para los hobbies, comidas favoritas y datos curiosos.
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("📖 Leer libros");
        hobbies.add("🎮 Jugar videojuegos");
        hobbies.add("🏃‍♀️ Correr");

        ArrayList<String> foods = new ArrayList<>();
        foods.add("🍕 Pizza");
        foods.add("🍣 Sushi");
        foods.add("🍨 Helado");

        ArrayList<String> funFacts = new ArrayList<>();
        funFacts.add("🎥 Me gustar ir al cine");
        funFacts.add("🪂 Tengo miedo a las alturas");
        funFacts.add("👨‍🎓 Es mi primer año en DAM");

        // 2.Crear un objeto de MartinezCristianPerfil usando el constructor.
        MartinezCristianPerfil perfil = new MartinezCristianPerfil(
                "Cristian Martínez",
                "Soy un estudiante de DAM que le gusta la programación.",
                hobbies,
                foods,
                funFacts
        );

        // 5. Crear el Scanner para leer las opciones.
        Scanner input = new Scanner(System.in);
        int opcion;

        // Menú interactivo.
        do {
            System.out.println("\nMenú AboutMe: [" + perfil.getName() + "]");
            System.out.println("1. Story: Mostrar la historia personal del perfil");
            System.out.println("2. Favorites: Mostrar los hobbies y comidas favoritas");
            System.out.println("3. Fun Facts: Mostrar un dato curioso aleatorio");
            System.out.println("4. Salir");

            System.out.println("Elige una opción");
            opcion = input.nextInt();

            // Switch para manejar las opciones.
            switch (opcion) {

                case 1:
                    // Mostrar historia.
                    System.out.println("\nHistoria: " + perfil.getStory());
                    break;

                case 2:
                    // Mostrar hobbies y comidas favoritas.
                    System.out.println("Hobbies: " + perfil.getHobbies());
                    System.out.println("Comidas favoritas: " + perfil.getFoods());
                    break;

                case 3:
                    // Mostrar fun fact aleatorio.
                    System.out.println("Dato curioso: " + perfil.getRandomFunFact());
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor elige una opción entre 1 y 4.");
                    break;
            }
        } while (opcion !=4);

        // Cerrar el scanner
        input.close();

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