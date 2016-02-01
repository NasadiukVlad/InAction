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

import javax.servlet.http.HttpSession;

/**
 * Created by Vlad on 25.01.2016.
 */
@Controller
public class SignInController {

    @Autowired
    private TestBean testBean;

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public ModelAndView index() {
        testBean.testMethod();

        final ModelAndView mav = new ModelAndView("signin/signin");
        mav.addObject("users", new Users());
        return mav;

    }

    @RequestMapping(value = "/signinpost", method = RequestMethod.POST)
    public ModelAndView signup(@ModelAttribute(value = "users") Users users, HttpSession session) {
     //   Users user = new Users(users.getUsername(), users.getPassword(), users.getUserEmail());

        String username = users.getUsername();
        String password = users.getPassword();

        final ModelAndView mav = new ModelAndView("home/homeSignedIn");
        mav.addObject("users", new Users());



        UsersJpaDao usersJpaDao = new UsersJpaDao();
        Users user = usersJpaDao.getByLogin(username);

        if (user != null) {
            if (user.getUsername().equals(username) &&
                    user.getPassword().equals(password)) {
                session.setAttribute("username", username);
                mav.addObject("users", new Users());
                mav.addObject("username", username);
                return mav;
            } else if (!user.getUsername().equals(username) ||
                    !user.getPassword().equals(password)) {
                session.setAttribute("error", "Login and password not match!");
                mav.addObject("users", new Users());
                mav.addObject("username", "error");
                session.setAttribute("username", "Incorret login");
                return mav;            }
        } else {
            mav.addObject("users", new Users());
            mav.addObject("username", "error");
            session.setAttribute("username", "Incorret login");
            return mav;
        }
        return mav;
    }


}
