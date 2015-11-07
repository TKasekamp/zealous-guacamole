package ee.tkasekamp.zg.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ee.tkasekamp.zg.domain.Caravan;
import ee.tkasekamp.zg.domain.Resource;
import ee.tkasekamp.zg.domain.Type;
import ee.tkasekamp.zg.domain.Village;
import ee.tkasekamp.zg.repository.CaravanRepository;
import ee.tkasekamp.zg.repository.ResourceRepository;
import ee.tkasekamp.zg.repository.VillageRepository;
import ee.tkasekamp.zg.service.GameService;

@Service
public class GameServiceImpl implements GameService {
	@Autowired
	VillageRepository villageRepo;
	@Autowired
	ResourceRepository resourceRepo;
	@Autowired
	CaravanRepository caravanRepo;

	@Override
	@PostConstruct
	public void createSampleData() {
		System.out.println("starting this shit");
		Village a = new Village("Alpha", 50);
		Resource a1 = new Resource(Type.FOOD, 3);
		a.getStorage().add(a1);
		resourceRepo.save(a1);
		villageRepo.save(a);

		Village b = new Village("Bravo", 100);
		Resource b1 = new Resource(Type.FOOD, 3);
		b.getStorage().add(b1);
		resourceRepo.save(b1);
		villageRepo.save(b);

		villageRepo.save(new Village("Charlie", 150));
		villageRepo.save(new Village("Delta", 200));
		
		// Caravans
		Resource r = new Resource(Type.FOOD, 2);
		Caravan car = new Caravan(a, b);
		car.setResource(r);
		resourceRepo.save(r);
		caravanRepo.save(car);
		
		

	}

}
