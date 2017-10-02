package properties;

import java.util.List;

import model.Employee;
import model.Immobile;
import model.Sales;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.metamodel.SessionFactoryBuilder;

public class Properties {

    public static void main(String[] args) {

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();

            Employee emp = new Employee();
            Sales sales = new Sales();
           
            emp.setNome("Mary");
            sales.setAddress("QMSW 300 A BLOCO D");
            sales.setCity("Brasilia");
            sales.setCountry("Brazil");
            sales.setSituation(0);
            sales.setSalesPrice(1000000);
            sales.setCommission(10);
           
            
            //session.save(emp);
            //session.save(sales);
            
                        
            tx.commit();
            
        } catch (HibernateException e) {
            System.out.println("Can't insert...");
        }finally{
            session.close();
        }
        
           
          try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            
            Query query = session.createQuery("from Employee");
            List list = query.list();
                                
                       
                        
            tx.commit();
            
            
        } catch (HibernateException e) {
            System.out.println("Can't consult...");
        }finally{
            session.close();
        }

    }
    
    

}
