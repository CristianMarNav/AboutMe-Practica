package com.aboutme;

import java.util.ArrayList; // Esto es necesario para usar listas.

/**
  * Clase que representa el perfil del usuario.
  * Incluye atributos como nombre, historia personal, hobbies, comidas favoritas y datos curiosos.
  */
public class MartinezCristianPerfil { // Apertura de la clase

    // Atributos del perfil: son privados para mantener la encapsulación.

    private String name; // Nombre del usuario.
    private String story; // Historia personal del usuario.
    private ArrayList<String> hobbies; // Lista de hobbies
    private ArrayList<String> foods; // Lista de comidas favoritas.
    private ArrayList<String> funFacts; // Lista de datos curiosos.

    /**
     * Constructor para inicializar el perfil del usuario.
     * @param name Nombre del usuario.
     * @param story Historia personal del usuario.
     * @param hobbies Lista de comidas favoritas del usuario.
     * @param foods Lista de comidas favoritas del usuario.
     * @param funFacts Lista de datos curiosos del usuario.
     */

    public MartinezCristianPerfil(String name, String story, ArrayList<String> hobbies, ArrayList<String> foods, ArrayList<String> funFacts) {

        // "this.atributo" se refiere al atributo de la clase. Lo usamos para diferenciarlo del parámetro con el mismo nombre.
        this.name = name; // Asigna el nombre del usuario.
        this.story = story; // Asigna la historia personal del usuario.
        this.hobbies = hobbies; // Asigna la lista de hobbies.
        this.foods = foods; // Asigna la lista de comidas favoritas.
        this.funFacts = funFacts; // Asigna la lista de datos curiosos.
    }

    // Métodos "getters": permiten acceder a los atributos privados.

    /**
     * Devuelve el nombre del usuario
     * @return El nombre del usuario.
     */
     public String getName() {
        return name;
    }

    /**
     * Devuelve la historia personal del usuario.
     * @return La historia personal del usuario.
     */
    public String getStory() {
        return story;
    }

    /**
     * Devuelve la lista de hobbies del usuario.
     * @return Lista de hobbies.
     */
    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    /**
     * Devuelve la lista de comidas favoritas del usuario.
     * @return Lista de comidas favoritas
     */
    public ArrayList<String> getFoods() {
        return foods;
    }

    /**
     * Devuelve la lista de datos curiosos del usuario.
     * @return Lista de datos curiosos.
     */
    public ArrayList<String> getFunFacts() {
        return funFacts;
    }

    // Métodos adicionales: agregan funcionalidad para mostrar información de manera formateada.

    /**
     * Devuelve una cadena con los hobbies y las comidas favoritas formateadas.
     * @return
     */
    public String formatFavorites() {
        return "Hobbies: " + hobbies + "\nComidas favoritas: " + foods;
    }

    public String getRandomFunFact() {
        int randomIndex = (int) (Math.random() * funFacts.size()); // Genera un índice aleatorio.
        return funFacts.get(randomIndex); // Devuelve el dato curioso correspondiente.
    }
} // Cierre de la clase

