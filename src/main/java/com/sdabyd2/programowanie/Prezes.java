package com.sdabyd2.programowanie;

public class Prezes implements AnimalAddedListener {

    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Panie Prezesie, nowy zwierzak: " + animal.getName());
    }
}