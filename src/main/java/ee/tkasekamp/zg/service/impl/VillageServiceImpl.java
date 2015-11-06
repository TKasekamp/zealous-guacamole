package ee.tkasekamp.zg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ee.tkasekamp.zg.domain.Village;
import ee.tkasekamp.zg.repository.VillageRepository;
import ee.tkasekamp.zg.service.VillageService;

@Service
public class VillageServiceImpl implements VillageService {
	@Autowired
	VillageRepository villageRepo;

	@Override
	public List<Village> getAllVillages() {
		return (List<Village>) villageRepo.findAll();
	}

	@Override
	public Village getVillage(int id) {
		return villageRepo.findOne(id);
	}

}
