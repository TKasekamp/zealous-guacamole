package ee.tkasekamp.zg.service;

import java.util.List;

import ee.tkasekamp.zg.domain.Distance;
import ee.tkasekamp.zg.domain.Village;

public interface DistanceService {
	public int distanceBetween(Village one, Village two);

	public List<Distance> getAllDistances();
}
