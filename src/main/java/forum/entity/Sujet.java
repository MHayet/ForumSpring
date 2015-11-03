/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author ETY
 */
@Entity
public class Sujet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany(mappedBy = "sujet")
    private List<Message> messages = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "forum_id")
    private Forum forum;
    
    @ManyToOne
    @JoinColumn(name = "utilisator_id")
    private Utilisator utilisator;

    public Sujet() {
    }

    public Sujet(Forum forum, Utilisator utilisator) {
        this.forum = forum;
        this.utilisator = utilisator;
    }

    public Sujet(Long id, Forum forum, Utilisator utilisator) {
        this.id = id;
        this.forum = forum;
        this.utilisator = utilisator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Forum getForum() {
        return forum;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
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
        if (!(object instanceof Sujet)) {
            return false;
        }
        Sujet other = (Sujet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Sujet[ id=" + id + " ]";
    }
    
}
