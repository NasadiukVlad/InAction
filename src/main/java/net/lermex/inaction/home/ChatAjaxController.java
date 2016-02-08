package net.lermex.inaction.home;


import net.lermex.inaction.model.Comments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vlad on 08.02.2016.
 */
@Controller
public class ChatAjaxController {
    List<Comments> commentsList = new ArrayList<>();

    @RequestMapping(value = "/events")
    public ModelAndView index() {


        final ModelAndView mav = new ModelAndView("home/chatAjax");
        mav.addObject("comments", commentsList);
        return mav;
    }

    @RequestMapping(value = "/chatPostAjax", method = RequestMethod.POST)
    public ModelAndView signup(@ModelAttribute(value = "comments") Comments comments) {
        Comments comment = new Comments(comments.getUserComment(), comments.getUsername());

        commentsList.add(comment);

        /*UsersJpaDao usersJpaDao = new UsersJpaDao();
        usersJpaDao.addUser(user);*/

        final ModelAndView mav = new ModelAndView("home/chatAjax");
        mav.addObject("comments", commentsList);
        return mav;
    }
}
