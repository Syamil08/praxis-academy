/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package rancanganTable3NF;

import org.hibernate.HibernateException;
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
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

public class App {

    private static final SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
            .addAnnotatedClass(Salutation.class).addAnnotatedClass(Membership.class).buildSessionFactory();

    // main
    public static void main(String[] args) throws Exception {

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();

            // add new salutation data to table salutation
            session.save(new Salutation(1, "Mr."));
            session.save(new Salutation(2, "Ms."));
            session.save(new Salutation(3, "Mrs."));
            session.save(new Salutation(4, "Dr."));
            
            // add new membership data to table membership
            session.save(new Membership(1,"Janet Jones","First Street Plot No 4",2));
            session.save(new Membership(2,"Roberth Phill","3rd Street 34",1));
            session.save(new Membership(3,"Roberth Phill","5th Avenue",1));

            // add new movies data to table movies 
            session.save(new Movies(1,"Pirates of the Caribbean",1));
            session.save(new Movies(2,"Clash of the Titans",1));
            session.save(new Movies(3,"Forgetting Sarah Marshal",2));
            session.save(new Movies(4,"Daddy's Little Girls",2));
            session.save(new Movies(5,"Clash of the Titans",3));

            session.getTransaction().commit();

            CriteriaQuery<Salutation> query = session.getCriteriaBuilder().createQuery(Salutation.class);
            query.select(query.from(Salutation.class));
            for (Salutation salu : session.createQuery(query).getResultList()) {
                System.out.printf("%d %s\n", salu.getId(), salu.getNam());
            }


            // list table salutation
            System.out.println("==============================");
            System.out.println("Ini data dari table salutation");
            App salutation = new App();
            salutation.listSalutation();
            System.out.println();

            // list table membership
            System.out.println("==============================");
            System.out.println("Ini data dari table membership");
            App membership = new App();
            membership.listMembership();
            System.out.println();

            // list table movies
            System.out.println("==============================");
            System.out.println("Ini data dari table movies");
            App movies = new App();
            movies.listMovies();
            System.out.println();

            // Get Movie List With Id
            System.out.println("==============================");
            System.out.println("Ini data dari table movies berdasarkan id yang diminta");
            App moviesId = new App();
            moviesId.getMovieList(1);
            System.out.println();

        } finally {
            session.close();
            sessionFactory.close();
        }

    }

    public void listSalutation(){
        Session session = sessionFactory.openSession();

        try{
            List salutat = session.createQuery("FROM Salutation").list();
            for(Iterator iterator = salutat.iterator(); iterator.hasNext();){
                Salutation salutatt = (Salutation) iterator.next();
                System.out.print("id: "+ salutatt.getId() + " || ");
                System.out.println(" name: "+salutatt.getNam());
            }
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    public void listMembership(){
        Session session = sessionFactory.openSession();

        try{
            List member = session.createQuery("FROM Membership").list();
            for(Iterator iterator = member.iterator(); iterator.hasNext();){
                Membership membership = (Membership) iterator.next();
                System.out.print("id: " + membership.getId() + " || ");
                System.out.print(" Full Name: " + membership.getFullName() + " || ");
                System.out.print(" Address: " + membership.getAddress() + " || ");
                System.out.println(" Salutation Id: " + membership.getSalutationId());
            }
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void listMovies(){
        Session session = sessionFactory.openSession();

        try{
            List movies = session.createQuery("FROM Movies").list();
            for(Iterator iterator = movies.iterator(); iterator.hasNext();){
                Movies moviess = (Movies) iterator.next();
                System.out.print("id: " + moviess.getId() + " || ");
                System.out.print(" name: " + moviess.getName() + " || ");
                System.out.println(" Membership Id: " + moviess.getMembershipId());
            }
        } catch (HibernateException e){
            e.printStackTrace();
        } finally{
            session.close();
        }
    }

    public void getMovieList(int id){
        Session session = sessionFactory.openSession();

        try{
            List movies = session.createQuery("FROM Movies WHERE membershipid=" + id).list();
            for(Iterator iterator = movies.iterator(); iterator.hasNext();){
                Movies moviess = (Movies) iterator.next();
                System.out.print("id: " + moviess.getId() + " || ");
                System.out.print(" name: " + moviess.getName() + " || ");
                System.out.println(" Membership Id: " + moviess.getMembershipId() + " || ");
            }
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}
