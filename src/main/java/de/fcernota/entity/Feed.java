package de.fcernota.entity;

import de.fcernota.utils.AbstractDBObject;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by cernota on 06.10.16.
 */

@Entity
@Table
public class Feed implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String url;
    private Boolean publishToFacebook;
    private Boolean publishToTwitter;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "feed")
    private List<Item> items;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getPublishToFacebook() {
        return publishToFacebook;
    }

    public void setPublishToFacebook(Boolean publishToFacebook) {
        this.publishToFacebook = publishToFacebook;
    }

    public Boolean getPublishToTwitter() {
        return publishToTwitter;
    }

    public void setPublishToTwitter(Boolean publishToTwitter) {
        this.publishToTwitter = publishToTwitter;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
