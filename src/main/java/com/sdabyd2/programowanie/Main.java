package com.sdabyd2.programowanie;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.registerAnimalAddedListener(new Visitor());
        zoo.registerAnimalAddedListener(new Prezes());
        zoo.registerAnimalAddedListener(new Kierownik());

        //zoo.unregisterAnimalAddedListener();

        zoo.addAnimal(new Animal("Kot"));





    }
}