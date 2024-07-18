package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


class DuckRacer {
    private final int id;
    private final String name;
    private final Collection <Reward> rewards = new ArrayList<>();

    //constructors
    public DuckRacer(int id, String name) {
        this.id =id;
        this.name = name;

    }
     //action methods
    public void win(Reward reward){
        rewards.add(reward);

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //a derived property from size of collection
    public int getWins() {
        return rewards.size();
    }

    public Collection<Reward> getRewards() {
        return Collections.unmodifiableCollection(rewards);
    }

    @Override
    public String toString(){
       return String.format("ID: %d, Name: %s, Wins: %d", getClass().getSimpleName(),
               getId(), getName(), getWins(), getRewards());
    }
}