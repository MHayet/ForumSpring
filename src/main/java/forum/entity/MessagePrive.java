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
public class MessagePrive implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String sujet;
    private String msg;
    
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Utilisator sender;
    
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Utilisator receiver;

    public MessagePrive() {
    }

    public MessagePrive(String sujet, String msg, Utilisator sender, Utilisator receiver) {
        this.sujet = sujet;
        this.msg = msg;
        this.sender = sender;
        this.receiver = receiver;
    }

    public MessagePrive(Long id, String sujet, String msg, Utilisator sender, Utilisator receiver) {
        this.id = id;
        this.sujet = sujet;
        this.msg = msg;
        this.sender = sender;
        this.receiver = receiver;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public Utilisator getSender() {
        return sender;
    }

    public void setSender(Utilisator sender) {
        this.sender = sender;
    }

    public Utilisator getReceiver() {
        return receiver;
    }

    public void setReceiver(Utilisator receiver) {
        this.receiver = receiver;
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
        if (!(object instanceof MessagePrive)) {
            return false;
        }
        MessagePrive other = (MessagePrive) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MP [ id=" + id + " ; sujet= " + sujet + " ; msg= " + msg + " ; sender= " + sender + " ; receiver=" + receiver + " ]";
    }
    
}
