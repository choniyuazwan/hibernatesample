import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure();
        config.addAnnotatedClass(Customer.class);
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        factory = config.buildSessionFactory(serviceRegistry);

        App app = new App();

        List<Customer> customers = app.listCustomer();
        for(Customer u : customers) {
            System.out.println(u.getCif()+" "+u.getFirstName()+" "+u.getUsername());
        }
    }

    private List<Customer> listCustomer() {
        Session sesn = factory.openSession();
        List<Customer> users = new ArrayList<Customer>();
        try {
            Query query = sesn.createQuery("From Customer");
            users = query.list();
        } finally {
            sesn.close();
        }
        return users;
    }
}
