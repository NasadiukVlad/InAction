package net.lermex.inaction.home;

import net.lermex.inaction.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Vlad on 25.01.2016.
 */
@Controller
public class SignInController {

    @Autowired
    private TestBean testBean;

    @RequestMapping(value = "/signin")
    public ModelAndView index() {
        testBean.testMethod();

        final ModelAndView mav = new ModelAndView("signin/signin");
        mav.addObject("customers", "test");
        return mav;
    }
}
