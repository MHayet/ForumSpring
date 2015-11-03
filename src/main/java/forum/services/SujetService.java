/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.services;

import forum.dao.SujetDAO;
import forum.entity.Sujet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */

@Service
public class SujetService {
    
    @Autowired
    private SujetDAO dao;
    
    @Transactional
    public void create(Sujet sujet){
        dao.save(sujet);
    }
    
    @Transactional
    public void update(Sujet sujet){
        dao.save(sujet);
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
    public Sujet read(Long id){
        return dao.findOne(id);
    }
    
    @Transactional
    public Iterable<Sujet> readAll(){
        return dao.findAll();
    }
    
}
