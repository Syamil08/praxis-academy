package rancanganTable3NF;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaQuery;


@Entity
@Table(name="movies")
public class Movies{
    @Id
    @Column(name="id")
    public long id;

    @Column(name = "name")
    public String name;

    @Column(name = "membershipid")
    public long membershipid;

    public Movies(long id, String name, long membershipid){
        this.id = id;
        this.name = name;
        this.membershipid = membershipid;
    }

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMembershipId(){
        return membershipid;
    }

    public void setMembershipid(long membershipid){
        this.membershipid = membershipid;
    }

    public Movies() {}   

}