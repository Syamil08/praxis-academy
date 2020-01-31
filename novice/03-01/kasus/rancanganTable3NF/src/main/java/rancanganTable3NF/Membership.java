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
@Table(name="membership")
public class Membership{
    @Id
    @Column(name="id")
    public long id;

    @Column(name = "full_name")
    public String full_name;

    @Column(name = "address")
    public String address;

    @Column(name = "salutation_id")
    public long salutation_id;

    public Membership(long id, String full_name, String address, long salutation_id){
        this.id = id;
        this.full_name = full_name;
        this.address = address;
        this.salutation_id = salutation_id;
    }

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName(){
        return full_name;
    }

    public void setFullName(String fullName) {
        this.full_name = fullName;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public long getSalutationId(){
        return salutation_id;
    }

    public void setSalutationId(long salutation_id){
        this.salutation_id = salutation_id;
    }
    
    public Membership() {}   

}