package de.fcernota.entity;

import de.fcernota.utils.AbstractDBObject;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Entity für Rollen
 */
@Entity
@Table
public class Role implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<User> getUsers(){
        return users;
    }

    public void setusers(List<User> users){
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
