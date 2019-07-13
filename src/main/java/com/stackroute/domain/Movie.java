package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie
{
    private Actor actor;

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie() {
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie { " +
                "actor = " + actor +
                '}';
    }
}
