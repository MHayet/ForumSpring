/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.services;

import forum.dao.MessageDAO;
import forum.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */

@Service
public class MessageService {
    
    @Autowired
    private MessageDAO dao;
    
    @Transactional
    public void create(Message message){
        dao.save(message);
    }
    
    @Transactional
    public void update(Message message){
        dao.save(message);
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
    public Message read(Long id){
        return dao.findOne(id);
    }
    
    @Transactional
    public Iterable<Message> readAll(){
        return dao.findAll();
    }
    
}
