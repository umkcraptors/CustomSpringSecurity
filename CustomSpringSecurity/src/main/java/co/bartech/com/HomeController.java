package co.bartech.com;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
	
		return "home";
	}
	@RequestMapping(value = "/admin/two", method = RequestMethod.GET)
	public String two() {
	
		return "two";
	}
	@RequestMapping(value = "/admin/three", method = RequestMethod.GET)
	public String three() {
	
		return "three";
	}
	@RequestMapping(value = "/admin/four", method = RequestMethod.GET)
	public String four() {
	
		return "four";
	}
	
}
