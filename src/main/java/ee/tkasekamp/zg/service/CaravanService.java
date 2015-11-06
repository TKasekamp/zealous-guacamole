package ee.tkasekamp.zg.service;

import java.util.List;

import ee.tkasekamp.zg.domain.Caravan;
import ee.tkasekamp.zg.domain.Village;

public interface CaravanService {
	List<Caravan> getAllCaravans();

	List<Caravan> getFromCaravans(Village village);

	List<Caravan> getToCaravans(Village village);
}
