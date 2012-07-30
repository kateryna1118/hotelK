package ua.softserve.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ua.softserve.hotel.dao.IAddServiceHistoryDAO;


/**
 *
 * @author Kateryna
 */
@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class AddServiceHistoryDAOTest {
 @Autowired
    private IAddServiceHistoryDAO addServiceHistoryDAO;
@Ignore
    @Test
    public void testSave() throws Exception {
//        AddServiceHistory addServiceHistory = new AddServiceHistory();
//        addServiceHistory.setName("Vodka");
//        addServiceHistory.setPrice(80);
//
//        System.out.println(addServiceHistory);
//        addServiceHistoryDAO.addAddServiceHistory(addServiceHistory);
//        List<AddServiceHistory> addServiceHistoryList = addServiceHistoryDAO.getAllAddServiceHistorys();
//
//        Assert.assertEquals(addService, addServiceList.get(addServiceList.size() - 1));
//        Assert.assertEquals(addService.getName(),
//                addServiceList.get(addServiceList.size() - 1).getName());
    }
@Ignore
    @Test
    public void testGet() throws Exception {

//        AddService addService = new AddService();
//        addService.setName("Vodka");
//        addService.setPrice(80);
//
//        addServiceDAO.addAddService(addService);
//        List<AddService> addServiceList = addServiceDAO.getAllAddServices();
//
//        AddService loadedAddServicet = addServiceList.get(addServiceList.size() - 1);
//        Long loadedId = loadedAddServicet.getId();
//        Assert.assertEquals(loadedAddServicet, addServiceDAO.getAddService(loadedId));
    }

}
