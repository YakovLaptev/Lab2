package Beans;

import DAO.OrderDAO;
import Entities.Order;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yakov
 */
@ManagedBean(value = "OrderBean")
@SessionScoped
public class OrderBean implements Serializable {
    @EJB
    private OrderDAO orderDAO;
    private Long advId;

    public String getOrdersByAdvertisingIdRedirect(Long id) {
        advId = id;
        return "ordersById";
    }

    public List<Order> getOrdersByAdvertisingId() {
        return orderDAO.getOrdersByAdvertisingId(advId);
    }

}
