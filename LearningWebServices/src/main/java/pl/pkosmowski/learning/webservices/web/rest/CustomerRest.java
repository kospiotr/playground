package pl.pkosmowski.testing.jaxrs.web.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;
import pl.pkosmowski.testing.jaxrs.dao.AbstractDao;
import pl.pkosmowski.testing.jaxrs.dao.CustomerDao;
import pl.pkosmowski.testing.jaxrs.model.Customer;

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
