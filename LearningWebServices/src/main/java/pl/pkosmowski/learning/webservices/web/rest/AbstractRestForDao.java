package pl.pkosmowski.learning.webservices.web.rest;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import pl.pkosmowski.learning.webservices.dao.AbstractDao;

/**
 *
 * @author pkosmowski
 */
public abstract class AbstractRestForDao<T> {

    protected abstract AbstractDao<T> getDao();

    @POST
    @Consumes({"application/xml", "application/json"})
    public void create(T entity) {
        getDao().create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Long id, T entity) {
        getDao().edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        getDao().remove(getDao().find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public T find(@PathParam("id") Long id) {
        return getDao().find(id);
    }

    @GET

    @Produces({"application/xml", "application/json"})
    public List<T> findAll() {
        return getDao().findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<T> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return getDao().findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(getDao().count());
    }
}
