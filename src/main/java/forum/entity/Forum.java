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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author ETY
 */
@Entity
public class Forum implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany(mappedBy = "forum")
    private List<Sujet> sujets = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "utilisator_id")
    private Utilisator creator;
    
    @ManyToMany
    @JoinTable(name = "forum_utilisator")
    private List<Utilisator> utilisators = new ArrayList<>();

    public Forum() {
    }

    public Forum(Utilisator creator) {
        this.creator = creator;
    }

    public Forum(Long id, Utilisator creator) {
        this.id = id;
        this.creator = creator;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Sujet> getSujets() {
        return sujets;
    }

    public void setSujets(List<Sujet> sujets) {
        this.sujets = sujets;
    }

    public Utilisator getCreator() {
        return creator;
    }

    public void setCreator(Utilisator creator) {
        this.creator = creator;
    }

    public List<Utilisator> getUtilisators() {
        return utilisators;
    }

    public void setUtilisators(List<Utilisator> utilisators) {
        this.utilisators = utilisators;
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
        if (!(object instanceof Forum)) {
            return false;
        }
        Forum other = (Forum) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Forum[ id=" + id + " ]";
    }
    
}
