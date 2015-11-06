package ee.tkasekamp.zg.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ee.tkasekamp.zg.domain.Village;
import ee.tkasekamp.zg.repository.VillageRepository;
import ee.tkasekamp.zg.service.GameService;

@Service
public class GameServiceImpl implements GameService {
	@Autowired
	VillageRepository villageRepo;

	@Override
	@PostConstruct
	public void createSampleData() {
		System.out.println("starting this shit");
		villageRepo.save(new Village("Alpha", 50));
		villageRepo.save(new Village("Bravo", 100));
		villageRepo.save(new Village("Charlie", 150));
		villageRepo.save(new Village("Delta", 200));

	}

}
