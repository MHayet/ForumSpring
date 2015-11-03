package forum.entity;

import forum.entity.Forum;
import forum.entity.Message;
import forum.entity.Utilisator;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-03T15:29:53")
@StaticMetamodel(Sujet.class)
public class Sujet_ { 

    public static volatile SingularAttribute<Sujet, Forum> forum;
    public static volatile ListAttribute<Sujet, Message> messages;
    public static volatile SingularAttribute<Sujet, Long> id;
    public static volatile SingularAttribute<Sujet, Utilisator> utilisator;

}