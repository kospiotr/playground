package pl.pkosmowski.learning.webservices.bootstrap;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import pl.pkosmowski.learning.webservices.dao.CustomerDao;
import pl.pkosmowski.learning.webservices.model.Customer;

/**
 *
 * @author pkosmowski
 */
@WebListener
public class DataFiller implements ServletContextListener{

    @Inject
    CustomerDao customerDao;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        customerDao.create(new Customer(1L, "Piotr Kosmowski"));
        customerDao.create(new Customer(2L, "Stanisław Kosmowski"));
        customerDao.create(new Customer(3L, "Szymon Kosmowski"));
        customerDao.create(new Customer(4L, "Anna Kosmowska"));
        customerDao.create(new Customer(5L, "Paulina Kosmowska"));
        customerDao.create(new Customer(6L, "Marta Kosmowska"));
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
    
}
