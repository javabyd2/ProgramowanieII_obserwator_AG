package com.sdabyd2.programowanie;

public class Kierownik implements AnimalAddedListener {

    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Panie Kierowniku, nowy zwierzak: " + animal.getName());
    }
}
