package dk.cachet.carp.protocals.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dk.cachet.carp.protocals.core.util.DataUpload;

/**
 * A repository of data points.
 *
 * @see org.springframework.data.repository.CrudRepository
 * @author Devender Kumar
 */

@Repository
public interface DataPointRepository extends MongoRepository<DataUpload, String>, DataPointRepositoryCustom {

	DataUpload save(DataUpload dataPoint);

}
