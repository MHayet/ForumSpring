/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.services;

import forum.dao.MessagePriveDAO;
import forum.entity.MessagePrive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */

@Service
public class MessagePriveService {
    
    @Autowired
    private MessagePriveDAO dao;
    
    @Transactional
    public void create(MessagePrive mp){
        dao.save(mp);
    }
    
    @Transactional
    public void update(MessagePrive mp){
        dao.save(mp);
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
    public MessagePrive read(Long id){
        return dao.findOne(id);
    }
    
    @Transactional
    public Iterable<MessagePrive> readAll(){
        return dao.findAll();
    }
    
}
