/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.MessagePrive;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ETY
 */
public interface MessagePriveDAO extends CrudRepository<MessagePrive, Long>{
    
}
