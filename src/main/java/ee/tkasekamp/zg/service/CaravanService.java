package ee.tkasekamp.zg.service;

import java.util.List;

import ee.tkasekamp.zg.domain.Caravan;

public interface CaravanService {
	List<Caravan> getAllCaravans();

	List<Caravan> getFromCaravans(int villageId);

	List<Caravan> getToCaravans(int villageId);
}
