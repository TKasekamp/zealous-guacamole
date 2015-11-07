package ee.tkasekamp.zg.service;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;

import ee.tkasekamp.zg.domain.Distance;
import ee.tkasekamp.zg.domain.Village;

public interface DistanceService {
	@ModelAttribute("distanceBetween")
	public int distanceBetween(Village one, Village two);

	public List<Distance> getAllDistances();
}
