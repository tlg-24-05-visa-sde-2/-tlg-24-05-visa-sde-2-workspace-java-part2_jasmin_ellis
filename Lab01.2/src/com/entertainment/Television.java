package com.entertainment;

import java.util.Objects;

public class Television {

    private String brand;
    private int volume;
    private Tuner tuner = new Tuner();

    //constructors
    public Television() {

    }
    public Television(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }

    //methods
    public int getCurrentChannel(){
        //delegating method to the tuner
        return tuner.getChannel();

    }

    public void changeChannel(int channel){
        //delegating method to tuner
        tuner.setChannel(channel);

    }


    //setters & getters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj    ) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Television that = (Television) obj;
        return getVolume() == that.getVolume() && Objects.equals(getBrand(), that.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getVolume());
    }

    //toString method to print
    public String toString(){
        return getClass().getSimpleName() + "Brand: " + brand + " volume: " + volume + " , channel: " + getCurrentChannel();
    }
}
