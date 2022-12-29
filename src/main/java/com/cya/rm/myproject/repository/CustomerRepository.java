package com.cya.rm.myproject.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cya.rm.myproject.vo.Customer;

@Mapper
public interface CustomerRepository {

	@Select("""
			<script>
				SELECT id, `name`,
				CONCAT(SUBSTR(phoneNum,1,8),'**',SUBSTR(phoneNum,11)) AS phoneNum 
				FROM customer;
			</script>
			""")
	List<Customer> getForPrintCustomers();

	@Select("""
			<script>
				SELECT COUNT(*) FROM customer;
			</script>
			""")
	int getCustomersCount();

}
