package net.lermex.inaction.home;

import net.lermex.inaction.TestBean;
import net.lermex.inaction.dao.UsersJpaDao;
import net.lermex.inaction.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Vlad on 31.01.2016.
 */
@Controller
public class SignUpController {
    @Autowired
    private TestBean testBean;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView index() {

        final ModelAndView mav = new ModelAndView("signup/signup");
        mav.addObject("users", new Users());
        return mav;
    }

    @RequestMapping(value = "/signuppost", method = RequestMethod.POST)
    public void signup(@ModelAttribute(value = "users") Users users) {
        Users user = new Users(users.getUsername(), users.getPassword(), users.getUserEmail());

        UsersJpaDao usersJpaDao = new UsersJpaDao();
        usersJpaDao.addUser(user);
    }
}
