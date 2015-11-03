package forum.entity;

import forum.entity.Utilisator;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-03T15:29:53")
@StaticMetamodel(MessagePrive.class)
public class MessagePrive_ { 

    public static volatile SingularAttribute<MessagePrive, String> msg;
    public static volatile SingularAttribute<MessagePrive, Utilisator> receiver;
    public static volatile SingularAttribute<MessagePrive, Utilisator> sender;
    public static volatile SingularAttribute<MessagePrive, Long> id;
    public static volatile SingularAttribute<MessagePrive, String> sujet;

}