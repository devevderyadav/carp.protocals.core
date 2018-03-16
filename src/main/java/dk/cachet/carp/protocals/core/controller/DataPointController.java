package dk.cachet.carp.protocals.core.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dk.cachet.carp.protocals.core.service.DataPointService;
import dk.cachet.carp.protocals.core.util.DataUpload;

@RestController
@CrossOrigin
public class DataPointController {

	@Autowired
	private DataPointService dataPointService;

	@RequestMapping("/datapoint")
	public String hello() {

		/*
		 * StudyProtocol.fromSnapshot
		 */

		return "Hello From Rest service";

	}

	@RequestMapping("/hello")
	public String sayHello() {

		return "hello";

	}

	/*
	 * @PreAuthorize("#oauth2.clientHasRole('" + "CLIENT_ROLE" +
	 * "') and #oauth2.hasScope('" + "DATA_POINT_WRITE_SCOPE" + "')")
	 */
	@RequestMapping(value = "/dataPoint", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> writeDataPoint(@RequestBody @Valid DataUpload dataUpload) {

		System.out.println("Data recieved " + dataUpload.toString());
		dataPointService.save(dataUpload);

		return new ResponseEntity<String>("Data Saved ", HttpStatus.OK);
	}

	@RequestMapping(value = "/dataPoint/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> deleteDataPoint(@PathVariable String id) {

		return new ResponseEntity<String>("Deleted userId " + id, HttpStatus.OK);
	}

	/*
	 * @PreAuthorize("#oauth2.clientHasRole('" + "CLIENT_ROLE" +
	 * "') and #oauth2.hasScope('" + "DATA_POINT_WRITE_SCOPE" + "')")
	 */
	@RequestMapping(value = "/dataPoint/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> readDataPoint(@PathVariable String id) {

		System.out.println("Inside dataPoints method & the Id is= " + id);
		return new ResponseEntity<String>("Get data for Id " + id, HttpStatus.OK);
	}

}