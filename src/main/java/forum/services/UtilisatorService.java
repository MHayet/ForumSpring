/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.services;

import forum.dao.UtilisatorDAO;
import forum.entity.Utilisator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */

@Service
public class UtilisatorService {
    
    @Autowired
    private UtilisatorDAO dao;
    
    @Transactional
    public void create(Utilisator user){
        dao.save(user);
    }
    
    @Transactional
    public void update(Utilisator user){
        dao.save(user);
    }
    
    @Transactional
    public void delete(Long id){
        dao.delete(id);
    }
    
    @Transactional
    public void deleteAll(){
        dao.deleteAll();
    }
    
    @Transactional
    public Utilisator read(Long id){
        return dao.findOne(id);
    }
    
    @Transactional
    public Iterable<Utilisator> readAll(){
        return dao.findAll();
    }
    
    @Transactional
    public void inscription(String login, String mdp){
        dao.save(new Utilisator(login, mdp, Utilisator.Type.Utilisator));
    }
    
    @Transactional
    public void validationInscription(String login){
        Iterable<Utilisator> users = dao.findAll();
        for (Utilisator user:users){
            if (user.getLogin().equals(login)){
                user.setCertifie(Utilisator.Certifie.Valide);
                dao.save(user);
            }
        }
    }
    
    @Transactional
    public Utilisator login(String login, String mdp){
        Iterable<Utilisator> users = dao.findAll();
        Utilisator usr = null;
        for (Utilisator user:users){
            if (user.getLogin().equals(login) && user.getMdp().equals(mdp)){
                usr = user;
            }
        }
        return usr;
    }
    
}
