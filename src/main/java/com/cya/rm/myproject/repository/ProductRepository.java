package com.cya.rm.myproject.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cya.rm.myproject.vo.Product;

@Mapper
public interface ProductRepository {

	@Select("""
			<script>
				SELECT * FROM product
			</script>
			""")
	List<Product> getForPrintProducts();

	@Select("""
			<script>
				SELECT COUNT(*) FROM product
			</script>
			""")
	int getProductsCount();

}
