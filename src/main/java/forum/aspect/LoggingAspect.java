/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author ETY
 */

@Aspect
@Component
public class LoggingAspect {
    
    @Before("execution(* forum.services.*.*(..))")
    public void log(JoinPoint jp){
        System.out.format("<====}=O [Log %s] %s O={====>\n", new Date(), jp);
    }
    
}
