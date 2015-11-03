/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.test;

import forum.entity.Utilisator;
import forum.services.UtilisatorService;
import forum.spring.SpringConfig;
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
public class LoginTest {
    
    @Autowired
    private UtilisatorService service;
    
    @Test
    public void ajoutUtilisateur(){
        service.inscription("Kirito", "Asuna");
        service.inscription("Asuna", "Kirito");
        
        service.validationInscription("Kirito");
        service.validationInscription("Asuna");
        
        Utilisator one = service.login("Kirito", "Asuna");
        Utilisator two = service.login("Asuna", "Kirito");
        
        System.out.println(one);
        System.out.println(two);
    }
    
}
