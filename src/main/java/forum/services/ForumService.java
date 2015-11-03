/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.services;

import forum.dao.ForumDAO;
import forum.entity.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */

@Service
public class ForumService {
    
    @Autowired
    private ForumDAO dao;
    
    @Transactional
    public void create(Forum forum){
        dao.save(forum);
    }
    
    @Transactional
    public void update(Forum forum){
        dao.save(forum);
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
    public Forum read(Long id){
        return dao.findOne(id);
    }
    
    @Transactional
    public Iterable<Forum> readAll(){
        return dao.findAll();
    }
    
}
