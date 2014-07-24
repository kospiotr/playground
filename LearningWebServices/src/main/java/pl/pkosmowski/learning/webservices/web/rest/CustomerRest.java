package pl.pkosmowski.learning.webservices.web.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;
import pl.pkosmowski.learning.webservices.dao.AbstractDao;
import pl.pkosmowski.learning.webservices.dao.CustomerDao;
import pl.pkosmowski.learning.webservices.model.Customer;

/**
 *
 * @author pkosmowski
 */
@Stateless
@Path("customer")
public class CustomerRest extends AbstractRestForDao<Customer> {

    @Inject
    private CustomerDao customerDao;

    @Override
    protected AbstractDao<Customer> getDao() {
        return customerDao;
    }

}
