package dk.cachet.carp.protocals.core.service;

import javax.validation.Valid;

import dk.cachet.carp.protocals.core.util.DataUpload;

public interface DataPointService {

	DataUpload save(@Valid DataUpload dataUpload);

}
