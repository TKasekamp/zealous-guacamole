package ee.tkasekamp.zg.repository;

import org.springframework.data.repository.CrudRepository;

import ee.tkasekamp.zg.domain.Day;

public interface DayRepository extends CrudRepository<Day, String> {

}
