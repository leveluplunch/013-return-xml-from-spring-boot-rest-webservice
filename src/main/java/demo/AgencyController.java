package demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgencyController {

	@RequestMapping(value = "/agencies", produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_XML_VALUE })
	public List<AgencyResource> getAgencies() {

		List<AgencyResource> agencies = getListing();

		return agencies;
	}

	private List<AgencyResource> getListing() {

		List<AgencyResource> resources = new ArrayList<>();
		resources.add(new AgencyResource(1, "all state", "123"));
		resources.add(new AgencyResource(2, "fcci insurnace group", "456"));
		resources.add(new AgencyResource(3, "farmers", "789"));
		resources.add(new AgencyResource(4, "met life", "167"));

		return resources;
	}

}
