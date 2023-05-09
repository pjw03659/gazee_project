package customerService;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class customerServiceDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(customerServiceVO bag) {
		my.insert("customer.create", bag);
	}
}
