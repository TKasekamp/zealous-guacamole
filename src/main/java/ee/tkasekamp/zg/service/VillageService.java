package ee.tkasekamp.zg.service;

import java.util.List;

import ee.tkasekamp.zg.domain.Village;

public interface VillageService {
	public List<Village> getAllVillages();

	public Village getVillage(int id);
}
