package ee.tkasekamp.zg.service;

import javax.annotation.PostConstruct;

public interface GameService {
	@PostConstruct
	void createSampleData();
}
