package ee.tkasekamp.zg.repository;

import org.springframework.data.repository.CrudRepository;

import ee.tkasekamp.zg.domain.Resource;

public interface ResourceRepository extends CrudRepository<Resource, Integer>{

}
