package ee.tkasekamp.zg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ee.tkasekamp.zg.service.VillageService;

@Controller
public class VillageController {
	@Autowired
	VillageService villageServ;
	@RequestMapping("/village")
	public String villages(Model model) {
		model.addAttribute("villages", villageServ.getAllVillages());
		return "village";
	}
}
