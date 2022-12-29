package com.cya.rm.myproject.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cya.rm.myproject.vo.Product;

@Mapper
public interface ProductRepository {

	@Select("""
			<script>
				SELECT P.id, P.`name`, P.price,
				SUBSTR(P.regDate,1,10) AS regDate,
				C.companyName AS companyName
				FROM product AS P
				LEFT JOIN company AS C
				ON P.companyId = C.id;
			</script>
			""")
	List<Product> getForPrintProducts();

	@Select("""
			<script>
				SELECT COUNT(*) FROM product;
			</script>
			""")
	int getProductsCount();

}
