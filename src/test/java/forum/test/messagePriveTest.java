/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.test;

import forum.entity.MessagePrive;
import forum.entity.Utilisator;
import forum.services.MessagePriveService;
import forum.services.UtilisatorService;
import forum.spring.SpringConfig;
import java.util.List;
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
public class messagePriveTest {
    
    @Autowired
    private UtilisatorService serviceU;
    
    @Autowired
    private MessagePriveService serviceMP;
    
    /*@Before
    public void avant() {
        //vide les tables
        serviceMP.deleteAll();
        serviceU.deleteAll();
        
        //ajout de deux users
        serviceU.create(new Utilisator(1L, "Kirito", "Asuna", Utilisator.Type.Utilisator));
        serviceU.create(new Utilisator(2L, "Asuna", "Kirito", Utilisator.Type.Utilisator));
    }*/
    
    @Test
    public void mpTest(){
        Utilisator one = serviceU.read(1L);
        Utilisator two = serviceU.read(2L);
        
        one.sendMP("Yui", "On la reverra", two);
        serviceU.update(one);
    }
    
    @Test
    public void mpTest2(){
        Utilisator one = serviceU.read(1L);
        Utilisator two = serviceU.read(2L);
        
        List<MessagePrive> mps = one.getMpSent();
        List<MessagePrive> mpr = two.getMpReceived();
        if (!mps.isEmpty()){
            System.out.println("Message envoyé: "+mps.get(0));
        }else{
            System.out.println("Pas de message envoyé");
        }
        if (!mpr.isEmpty()){
            System.out.println("Message recu: "+mpr.get(0));
        }else{
            System.out.println("Pas de message reçu");
        }
    }
    
}
