package tm.services.employee.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tm.app.common.domain.Employee;

@RestController
@RequestMapping(path = "/api/services/employee", produces = "application/json")
public class ReadAPI {

	@RequestMapping(path = "getall")
	public ResponseEntity<List<Employee>> readAll() {

		return ResponseEntity.ok(new ArrayList<>());

	}

}
