package com.company;

public class Main {

    public static void main(String[] args) {
        AnimalHouse<Tiger> tigerHouse=new AnimalHouse<>();
        AnimalHouse<Bird> birdHouse=new AnimalHouse<>();
        Tiger tiger=new Tiger();
        Bird bird=new Bird();
        tigerHouse.animal=tiger;
        birdHouse.animal=bird;

    }
}
