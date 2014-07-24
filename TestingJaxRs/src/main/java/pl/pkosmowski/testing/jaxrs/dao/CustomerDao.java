package pl.pkosmowski.testing.jaxrs.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.pkosmowski.testing.jaxrs.model.Customer;

/**
 *
 * @author pkosmowski
 */
@Stateless
public class CustomerDao extends AbstractDao<Customer> {

    @PersistenceContext(unitName = "PU")
    private EntityManager entityManager;

    public CustomerDao() {
        super(Customer.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

}
