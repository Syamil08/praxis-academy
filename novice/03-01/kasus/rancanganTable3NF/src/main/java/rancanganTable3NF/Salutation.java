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
@Table(name="salutation")
public class Salutation{
    @Id
    @Column(name="id")
    public long id;

    @Column(name = "nam")
    public String nam;

    public Salutation(int id, String nam){
        this.id = id;
        this.nam = nam;
    }

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNam(){
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public Salutation() {}   

}