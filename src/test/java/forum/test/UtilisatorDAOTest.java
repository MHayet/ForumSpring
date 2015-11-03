/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.test;

import forum.dao.UtilisatorDAO;
import forum.entity.Utilisator;
import forum.spring.SpringConfig;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class UtilisatorDAOTest {
    
    @Autowired
    private UtilisatorDAO dao;
    
    @Before
    @Transactional
    public void avant() {
        //supprime tout les users
        dao.deleteAll();
        
        //ajout de 3 users
        dao.save(new Utilisator(1L, "Heathcliff", "Aincrad", Utilisator.Type.Administrator));
        dao.save(new Utilisator(2L, "Kirito", "Asuna", Utilisator.Type.Utilisator));
        dao.save(new Utilisator(3L, "Asuna", "Kirito", Utilisator.Type.Utilisator));
    }
    
    @Test
    public void testTroisUsers(){
        Utilisator one = dao.findOne(1L);
        Utilisator two = dao.findOne(2L);
        Utilisator three = dao.findOne(3L);
        
        Assert.assertEquals("Heathcliff", one.getLogin());
        Assert.assertEquals("Kirito", two.getLogin());
        Assert.assertEquals("Asuna", three.getLogin());
    }
    
}
