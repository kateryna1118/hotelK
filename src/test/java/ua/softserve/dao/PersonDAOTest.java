package ua.softserve.dao;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ua.softserve.hotel.dao.IPersonDAO;
import ua.softserve.hotel.domain.Person;


/**
 *
 * @author Kateryna
 */
@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class PersonDAOTest {

    @Autowired
    private IPersonDAO personDAO;
@Ignore
    @Test
    public void testSave() throws Exception {
        Person person = new Person();
        person.setfName("Ivan");
        person.setlName("Ivanov");

        System.out.println(person);
        personDAO.addPerson(person);
        List<Person> personList = personDAO.getAllPersons();

        Assert.assertEquals(person, personList.get(personList.size() - 1));
        Assert.assertEquals(person.getfName(),
                personList.get(personList.size() - 1).getfName());
    }
@Ignore
    @Test
    public void testGet() throws Exception {

        Person person = new Person();
        person.setfName("Ivan");
        person.setlName("Ivanov");

        personDAO.addPerson(person);
        List<Person> supplList = personDAO.getAllPersons();

        Person loadedPerson = supplList.get(supplList.size() - 1);
        Integer loadedId = loadedPerson.getId();
        Assert.assertEquals(loadedPerson, personDAO.getPerson(loadedId));
    }
}
