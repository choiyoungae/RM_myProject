package com.cya.rm.myproject.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cya.rm.myproject.vo.Company;

@Mapper
public interface CompanyRepository {

	@Select("""
			<script>
				SELECT * FROM company;
			</script>
			""")
	List<Company> getForPrintCompanies();

	@Select("""
			<script>
				SELECT COUNT(*) FROM company;
			</script>
			""")
	int getCompaniesCount();

}
