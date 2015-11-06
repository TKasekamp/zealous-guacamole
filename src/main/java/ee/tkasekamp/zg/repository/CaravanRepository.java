package ee.tkasekamp.zg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ee.tkasekamp.zg.domain.Caravan;

public interface CaravanRepository extends CrudRepository<Caravan, Integer> {
	@Query("from Caravan as c where c.from.id = ?1")
	public List<Caravan> findFrom(int villageId);

	@Query("from Caravan as c where c.to.id = ?1")
	public List<Caravan> findTo(int villageId);
}
