package net.lermex.inaction.home;

import net.lermex.inaction.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * Created by Vlad on 27.01.2016.
 */
@Controller
public class GraphDataController {
    @Autowired
    private TestBean testBean;

    @RequestMapping(value = "/graphDataSetter")
    public ModelAndView index() {
        testBean.testMethod();

        Random rand = new Random();
        int monday = rand.nextInt(100);
        int tuesday = rand.nextInt(100);
        int wednesday = rand.nextInt(100);
        int thuesday = rand.nextInt(100);
        int friday = rand.nextInt(100);

        final ModelAndView mav = new ModelAndView("home/graphDataSetter");
        mav.addObject("customers", "test");
        mav.addObject("monday",monday);
        mav.addObject("tuesday",tuesday);
        mav.addObject("wednesday",wednesday);
        mav.addObject("thursday",thuesday);
        mav.addObject("friday",friday);
        return mav;
    }
}
