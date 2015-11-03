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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author ETY
 */
@Entity
public class Utilisator implements Serializable {
    
    public enum Type{
        Administrator, Moderator, Utilisator
    }
    
    public enum Certifie{
        Attente, Valide
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String login;
    private String mdp;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private Certifie certifie;
    
    @OneToMany(mappedBy = "creator")
    private List<Forum> forumsCree = new ArrayList<>();
    
    @OneToMany(mappedBy = "utilisator")
    private List<Sujet> sujets = new ArrayList<>();
    
    @OneToMany(mappedBy = "utilisator")
    private List<Message> messages = new ArrayList<>();
    
    @OneToMany(mappedBy = "sender")
    private List<MessagePrive> mpSent = new ArrayList<>();
    
    @OneToMany(mappedBy = "receiver")
    private List<MessagePrive> mpReceived = new ArrayList<>();
    
    @ManyToMany(mappedBy = "utilisators")
    private List<Forum> forums = new ArrayList<>();

    public Utilisator() {
    }

    public Utilisator(String login, String mdp, Type type) {
        this.login = login;
        this.mdp = mdp;
        this.type = type;
        this.certifie = Certifie.Attente;
    }

    public Utilisator(Long id, String login, String mdp, Type type) {
        this.id = id;
        this.login = login;
        this.mdp = mdp;
        this.type = type;
        this.certifie = Certifie.Attente;
    }
    
    public void sendMP(String sujet, String msg, Utilisator receiver){
        MessagePrive mp = new MessagePrive(sujet, msg, this, receiver);
        this.mpSent.add(mp);
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Forum> getForumsCree() {
        return forumsCree;
    }

    public void setForumsCree(List<Forum> forums) {
        this.forumsCree = forums;
    }

    public List<Sujet> getSujets() {
        return sujets;
    }

    public void setSujets(List<Sujet> sujets) {
        this.sujets = sujets;
    }

    public List<Message> getMessages() {
        List<Message> msgs = messages;
        return msgs;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Forum> getForums() {
        return forums;
    }

    public void setForums(List<Forum> forums) {
        this.forums = forums;
    }

    public List<MessagePrive> getMpSent() {
        return mpSent;
    }

    public void setMpSent(List<MessagePrive> mpSent) {
        this.mpSent = mpSent;
    }

    public List<MessagePrive> getMpReceived() {
        return mpReceived;
    }

    public void setMpReceived(List<MessagePrive> mpReceived) {
        this.mpReceived = mpReceived;
    }

    public Certifie getCertifie() {
        return certifie;
    }

    public void setCertifie(Certifie certifie) {
        this.certifie = certifie;
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
        if (!(object instanceof Utilisator)) {
            return false;
        }
        Utilisator other = (Utilisator) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User [ id=" + id + " ; login=" + login + " ; msgs=" + messages.size() + "]";
    }
    
}
