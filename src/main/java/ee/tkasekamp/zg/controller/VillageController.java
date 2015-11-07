package ee.tkasekamp.zg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ee.tkasekamp.zg.service.CaravanService;
import ee.tkasekamp.zg.service.VillageService;

@Controller
public class VillageController {
	@Autowired
	VillageService villageServ;
	@Autowired
	CaravanService caravanServ;
	@RequestMapping("/village")
	public String villages(Model model) {
		model.addAttribute("villages", villageServ.getAllVillages());
		return "villages";
	}
	@RequestMapping("/village/{id}")
	public String village(Model model, @PathVariable int id) {
		model.addAttribute("village", villageServ.getVillage(id));
		model.addAttribute("fromCaravans", caravanServ.getFromCaravans(id));
		model.addAttribute("toCaravans", caravanServ.getToCaravans(id));
		return "village";
	}
}
