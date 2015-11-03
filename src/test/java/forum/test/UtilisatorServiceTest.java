/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.test;

import forum.entity.Message;
import forum.entity.Utilisator;
import forum.services.MessageService;
import forum.services.UtilisatorService;
import forum.spring.SpringConfig;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class UtilisatorServiceTest {
    
    @Autowired
    private UtilisatorService service;
    
    @Autowired
    private MessageService serviceM;
    
    @Before
    /*@Transactional
    public void avant() {
        //supprime tout les users
        serviceM.deleteAll();
        service.deleteAll();
        
        //ajout de 3 users
        service.create(new Utilisator(1L, "Heathcliff", "Aincrad", Utilisator.Type.Administrator));
        service.create(new Utilisator(2L, "Kirito", "Asuna", Utilisator.Type.Utilisator));
        service.create(new Utilisator(3L, "Asuna", "Kirito", Utilisator.Type.Utilisator));
    }*/
    
    @Test
    public void testTroisUsers(){
        Utilisator one = service.read(1L);
        Utilisator two = service.read(2L);
        Utilisator three = service.read(3L);
        
        Assert.assertEquals("Heathcliff", one.getLogin());
        Assert.assertEquals("Kirito", two.getLogin());
        Assert.assertEquals("Asuna", three.getLogin());
    }
    
    @Test
    public void ajoutMessageTest(){
        Utilisator four = service.read(1L);
        
        List<Message> msgs  = new ArrayList<>();
        msgs.add(new Message(1L, null, four));
        msgs.add(new Message(2L, null, four));
        msgs.add(new Message(3L, null, four));
        four.setMessages(msgs);
        service.update(four);
    }
    
    @Test
    public void lectureMessageTest(){
        Utilisator six = service.read(1L);
        List<Message> msgss = six.getMessages();
        
        for (Message msg:msgss){
            System.out.println("Message: "+msg.getId().toString());
        }
    }
    
}
