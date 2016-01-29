package net.lermex.inaction.home;

import net.lermex.inaction.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class HomeController {

	@Autowired
	private TestBean testBean;

	@RequestMapping(value = "/")
	public ModelAndView index() {
		testBean.testMethod();

		Random rand = new Random();
		int monday = rand.nextInt(100);
		int tuesday = rand.nextInt(100);
		int wednesday = rand.nextInt(100);
		int thuesday = rand.nextInt(100);
		int friday = rand.nextInt(100);



        final ModelAndView mav = new ModelAndView("home/homeNotSignedIn");

        mav.addObject("monday", monday);
		mav.addObject("tuesday", tuesday);
		mav.addObject("wednesday", wednesday);
		mav.addObject("thursday", thuesday);
		mav.addObject("friday", friday);
		return mav;
	}

}
