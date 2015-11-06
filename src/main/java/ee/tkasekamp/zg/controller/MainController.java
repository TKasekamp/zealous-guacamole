package ee.tkasekamp.zg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ee.tkasekamp.zg.service.DistanceService;

@Controller
public class MainController {
	@Autowired
	DistanceService distanceService;
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("/distances")
	public String distancePage(Model model) {
		model.addAttribute("distances", distanceService.getAllDistances());
		return "distances";
	}
}
