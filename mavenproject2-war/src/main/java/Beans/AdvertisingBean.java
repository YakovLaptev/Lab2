package Beans;

import DAO.AdvertisingDAO;
import Entities.Advertising;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yakov
 */
@ManagedBean(value = "AdvertisingBean")
@SessionScoped
public class AdvertisingBean implements Serializable {
    @EJB
    AdvertisingDAO advDao;
    
    public List<Advertising> getAllAdvertisings() {
        return advDao.getAllAdvertisings();
    }

    public void deleteAdvertisingById(Long id) {
        advDao.deleteAdvertising(id);
    }
    
}
