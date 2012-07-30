package ua.softserve.hotel.web;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.softserve.hotel.domain.Person;
import ua.softserve.hotel.service.IPersonService;
import ua.softserve.hotel.service.PersonService;

/**
 *
 * @author Kateryna
 */
@Controller
public class PersonController {

    @Autowired
    private IPersonService ipersonService;

    @RequestMapping("/index")
    public String getAllPersons(Map<String, Object> map) {

        map.put("person", new Person());
        map.put("getAllPersons", ipersonService.getAllPersons());

        return "person";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("person") Person person,
            BindingResult result) {

        ipersonService.addPerson(person);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{personId}")
    public String removePerson(@PathVariable("personId") Integer personId) {

        ipersonService.removePerson(personId);

        return "redirect:/index";
    }
}
