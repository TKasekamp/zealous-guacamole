package ee.tkasekamp.zg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ee.tkasekamp.zg.domain.Distance;
import ee.tkasekamp.zg.domain.Village;
import ee.tkasekamp.zg.repository.DistanceRepository;
import ee.tkasekamp.zg.service.DistanceService;

@Service
public class DistanceServiceImpl implements DistanceService {
	@Autowired
	DistanceRepository distanceRepo;

	@Override
	public int distanceBetween(Village one, Village two) {
		Distance distance = distanceRepo.findOne(one.getId());

		switch (two.getId()) {
		case 1:
			return distance.getDistTo1();
		case 2:
			return distance.getDistTo2();
		case 3:
			return distance.getDistTo3();
		case 4:
			return distance.getDistTo4();
		}
		return 0;
	}

	@Override
	public List<Distance> getAllDistances() {
		return (List<Distance>) distanceRepo.findAll();
	}

}
