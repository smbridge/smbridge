package de.fcernota.utils;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Abstrakte Klasse für Entites
 */
public abstract class AbstractDBObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

}
