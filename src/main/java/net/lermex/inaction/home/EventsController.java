package net.lermex.inaction.home;

import net.lermex.inaction.TestBean;
import net.lermex.inaction.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vlad on 25.01.2016.
 */
@Controller
public class EventsController {
    @Autowired
    private TestBean testBean;

    List<Event> events = new ArrayList<>();

    Event javaDayEvent = new Event("Kyiv Java Day", "15.02.2016 14:00", "15.02.2016 20:00", "The biggest java day in Ukraine!");
    Event javaUserGroupEvent = new Event("Java User Group", "26.03.2016 18:00", "26.03.2016 21:00", "Java friend meeting in Kyiv!");

    public EventsController() {
        events.add(javaDayEvent);
        events.add(javaUserGroupEvent);
    }

    @RequestMapping(value = "/events")
    public ModelAndView index() {
        testBean.testMethod();

        final ModelAndView mav = new ModelAndView("home/events");
        mav.addObject("events", events);
        return mav;
    }
}
