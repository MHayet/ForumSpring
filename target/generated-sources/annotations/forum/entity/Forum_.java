package forum.entity;

import forum.entity.Sujet;
import forum.entity.Utilisator;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-03T15:29:53")
@StaticMetamodel(Forum.class)
public class Forum_ { 

    public static volatile SingularAttribute<Forum, Utilisator> creator;
    public static volatile ListAttribute<Forum, Sujet> sujets;
    public static volatile ListAttribute<Forum, Utilisator> utilisators;
    public static volatile SingularAttribute<Forum, Long> id;

}