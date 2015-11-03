/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ETY
 */
@Entity
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "sujet_id")
    private Sujet sujet;
    @ManyToOne
    @JoinColumn(name = "utilisator_id")
    private Utilisator utilisator;

    public Message() {
    }

    public Message(Sujet sujet, Utilisator utilisator) {
        this.sujet = sujet;
        this.utilisator = utilisator;
    }

    public Message(Long id, Sujet sujet, Utilisator utilisator) {
        this.id = id;
        this.sujet = sujet;
        this.utilisator = utilisator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sujet getSujet() {
        return sujet;
    }

    public void setSujet(Sujet sujet) {
        this.sujet = sujet;
    }

    public Utilisator getUtilisator() {
        return utilisator;
    }

    public void setUtilisator(Utilisator utilisator) {
        this.utilisator = utilisator;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Message[ id=" + id + " ]";
    }
    
}
