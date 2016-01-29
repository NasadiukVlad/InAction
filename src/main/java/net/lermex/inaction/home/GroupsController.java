package net.lermex.inaction.home;

import net.lermex.inaction.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Vlad on 25.01.2016.
 */
public class GroupsController {
    @Autowired
    private TestBean testBean;

    @RequestMapping(value = "/")
    public ModelAndView index() {
        testBean.testMethod();

        final ModelAndView mav = new ModelAndView("home/homeNotSignedIn");
        mav.addObject("customers", "test");
        return mav;
    }

}
