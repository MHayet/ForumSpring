package forum.entity;

import forum.entity.Forum;
import forum.entity.Message;
import forum.entity.MessagePrive;
import forum.entity.Sujet;
import forum.entity.Utilisator.Certifie;
import forum.entity.Utilisator.Type;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-03T15:29:53")
@StaticMetamodel(Utilisator.class)
public class Utilisator_ { 

    public static volatile ListAttribute<Utilisator, Forum> forumsCree;
    public static volatile ListAttribute<Utilisator, Forum> forums;
    public static volatile ListAttribute<Utilisator, Sujet> sujets;
    public static volatile SingularAttribute<Utilisator, String> mdp;
    public static volatile ListAttribute<Utilisator, MessagePrive> mpReceived;
    public static volatile ListAttribute<Utilisator, Message> messages;
    public static volatile ListAttribute<Utilisator, MessagePrive> mpSent;
    public static volatile SingularAttribute<Utilisator, Long> id;
    public static volatile SingularAttribute<Utilisator, Certifie> certifie;
    public static volatile SingularAttribute<Utilisator, String> login;
    public static volatile SingularAttribute<Utilisator, Type> type;

}