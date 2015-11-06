package ee.tkasekamp.zg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ee.tkasekamp.zg.domain.Caravan;
import ee.tkasekamp.zg.repository.CaravanRepository;
import ee.tkasekamp.zg.service.CaravanService;

@Service
public class CaravanServiceImpl implements CaravanService {
	@Autowired
	CaravanRepository caravanRepo;

	@Override
	public List<Caravan> getAllCaravans() {
		return (List<Caravan>) caravanRepo.findAll();
	}

	@Override
	public List<Caravan> getFromCaravans(int villageId) {
		return caravanRepo.findFrom(villageId);
	}

	@Override
	public List<Caravan> getToCaravans(int villageId) {
		return caravanRepo.findTo(villageId);
	}

}
