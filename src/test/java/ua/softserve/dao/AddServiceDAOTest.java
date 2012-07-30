package ua.softserve.dao;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ua.softserve.hotel.dao.IAddServiceDAO;
import ua.softserve.hotel.domain.AddService;

/**
 *
 * @author Kateryna
 */
@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class AddServiceDAOTest {
 @Autowired
    private IAddServiceDAO addServiceDAO;
@Ignore
    @Test
    public void testSave() throws Exception {
        AddService addService = new AddService();
        addService.setName("Vodka");
        addService.setPrice(80);

        System.out.println(addService);
        addServiceDAO.addAddService(addService);
        List<AddService> addServiceList = addServiceDAO.getAllAddServices();

        Assert.assertEquals(addService, addServiceList.get(addServiceList.size() - 1));
        Assert.assertEquals(addService.getName(),
                addServiceList.get(addServiceList.size() - 1).getName());
    }
@Ignore
    @Test
    public void testGet() throws Exception {

        AddService addService = new AddService();
        addService.setName("Vodka");
        addService.setPrice(80);

        addServiceDAO.addAddService(addService);
        List<AddService> addServiceList = addServiceDAO.getAllAddServices();

        AddService loadedAddServicet = addServiceList.get(addServiceList.size() - 1);
        Long loadedId = loadedAddServicet.getId();
        Assert.assertEquals(loadedAddServicet, addServiceDAO.getAddService(loadedId));
    }

}
