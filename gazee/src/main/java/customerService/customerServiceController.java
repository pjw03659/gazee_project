package customerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class customerServiceController {

	@Autowired
	customerServiceDAO dao;
	
	@RequestMapping("insert")
	public void insert(customerServiceVO bag) {
		dao.insert(bag);

	}
}
