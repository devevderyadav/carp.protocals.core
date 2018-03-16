package dk.cachet.carp.protocals.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dk.cachet.carp.protocals.core.repository.DataPointRepository;
import dk.cachet.carp.protocals.core.util.DataUpload;
import static com.google.common.base.Preconditions.checkNotNull;

@Service
public class DataPointServiceImpl implements DataPointService {

	@Autowired
	private DataPointRepository repository;

	@Override
	@Transactional
	public DataUpload save(DataUpload dataPoint) {

		checkNotNull(dataPoint);

		return repository.save(dataPoint);
	}

}